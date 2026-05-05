import java.io.*;
import java.util.*;

public class Solution {
    
    public static Integer getFrequency(String word, char letter) {
        Integer count = 0;
        
        for (int l = 0; l < word.length(); l++) {
            if (word.charAt(l) == letter) count++;
        }
        
        return count;
    }
    
    public static Map<String, Integer> countLetters(String word){
        Map<String, Integer> letters = new HashMap<>();
        
        for (int l = 0; l < word.length(); l++) {
            char letter = word.charAt(l);
            letters.computeIfAbsent(String.valueOf(letter), k -> getFrequency(word, letter));
        }
        
        return letters;
    }
    
    public static boolean isAnagram(String a, String b){ 
        return countLetters(a).equals(countLetters(b));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //1. Not case sensitive
        //2. Letter count equals
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next().strip().toLowerCase();
        String b = sc.next().strip().toLowerCase();
        sc.close();
        
        if (isAnagram(a, b)) {System.out.println("Anagrams");}
        else {System.out.println("Not Anagrams");}
    }
}
