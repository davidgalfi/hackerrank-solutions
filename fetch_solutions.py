import requests, os, json

session = os.environ["HRANK_SESSION"]
cookies = {"_hrank_session": session}
headers = {"User-Agent": "Mozilla/5.0"}

url = "https://www.hackerrank.com/rest/contests/master/submissions/?offset=0&limit=50"
r = requests.get(url, cookies=cookies, headers=headers)
data = r.json()

os.makedirs("solutions", exist_ok=True)

for sub in data.get("models", []):
    if sub.get("status") != "Accepted":
        continue

    sub_id = sub["id"]
    lang = sub.get("language", "txt")
    name = sub.get("challenge", {}).get("slug", "unknown")
    ext = {"python3": "py", "java": "java", "java15": "java", "java16": "java",
           "cpp": "cpp", "cpp14": "cpp", "cpp17": "cpp",
           "javascript": "js"}.get(lang, "txt")

    detail_url = f"https://www.hackerrank.com/rest/contests/master/submissions/{sub_id}"
    detail = requests.get(detail_url, cookies=cookies, headers=headers).json()
    model = detail.get("model", {})
    if not isinstance(model, dict):
        continue
    code = model.get("code", "")

    filename = f"solutions/{name}.{ext}"
    with open(filename, "w") as f:
        f.write(code)
    print(f"Saved: {filename}")

print("Done!")
