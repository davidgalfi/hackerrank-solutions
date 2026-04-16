import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=".repeat(32));
        
        while(sc.hasNextLine()){
            String text = sc.next();
            int number = sc.nextInt();
            System.out.printf("%-15s%03d%n", text, number);
        }
        
        System.out.println("=".repeat(32));
    }
}
