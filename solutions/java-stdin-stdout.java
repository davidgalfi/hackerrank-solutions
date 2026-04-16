import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        /*
        integer
        double
        String
        */
        
        // Scanner setup
        Scanner sc = new Scanner(System.in);
        
        //Read inputs
        int number = sc.nextInt();
        double floating = sc.nextDouble();
        // double and int leaves a new line character ""
        sc.nextLine();
        String text = sc.nextLine();
        
        //Print inputs
        System.out.println("String: " + text);
        System.out.println("Double: " + floating);
        System.out.println("Int: " + number);
    }
}
