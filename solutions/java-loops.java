import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for (int t = 0; t < q; t++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int sum = a;
            for (int i = 0; i < n; i++){
                sum += (int) Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println("");
        }
        
    }
}
