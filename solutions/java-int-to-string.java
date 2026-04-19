import java.io.*;
import java.util.*;

public class Solution {
    
    static int x;
    
    static {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String s = String.valueOf(x);
        
        if (s instanceof String) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
