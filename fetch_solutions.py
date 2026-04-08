import requests, os, json

session = os.environ["HRANK_SESSION"]
cookies = {"_hrank_session": session}
headers = {"User-Agent": "Mozilla/5.0"}

url = "https://www.hackerrank.com/rest/contests/master/submissions/?offset=0&limit=50"
r = requests.get(url, cookies=cookies, headers=headers)
data = r.json()

os.makedirs("solutions", exist_ok=True)

for sub in data.get("models", []):
    if sub.get("status") == "Accepted":
        lang = sub.get("language", "txt")
        name = sub.get("challenge", {}).get("slug", "unknown")
        ext = {"python3": "py", "java": "java", "cpp": "cpp", "javascript": "js"}.get(lang, "txt")
        filename = f"solutions/{name}.{ext}"
        with open(filename, "w") as f:
            f.write(sub.get("code", ""))

print("Done!")
