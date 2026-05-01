import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int sizeOfSubstring = sc.nextInt();
        
        List<String> parts = new ArrayList<>();
        int chunk = sizeOfSubstring - 1;
        
        for (int end = chunk; end < S.length(); end++) {
            parts.add(S.substring(end-chunk, end+1));
        }
        
        parts.sort(Comparator.comparing((String s) -> s.substring(0)));
        
        System.out.println(parts.get(0));
        System.out.println(parts.get(parts.size() - 1));
    }
}
