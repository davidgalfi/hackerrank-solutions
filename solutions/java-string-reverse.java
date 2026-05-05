import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        
        String b = new StringBuilder(a).reverse().toString();
        
        if(a.compareTo(b) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
