import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        HashMap<String, long[]> primitives = new HashMap<>();
        primitives.put("byte", new long[]{-(long)Math.pow(2, 7), (long)Math.pow(2, 7) - 1});
        primitives.put("short", new long[]{-(long)Math.pow(2, 15), (long)Math.pow(2, 15) - 1});
        primitives.put("int", new long[]{-(long)Math.pow(2, 31), (long)Math.pow(2, 31) - 1});
        primitives.put("long", new long[]{Long.MIN_VALUE, Long.MAX_VALUE});
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++){
            
            try{
                long next_number = sc.nextLong();
                
                System.out.println(next_number + " can be fitted in:");
            
                for(Map.Entry<String, long[]> entry : primitives.entrySet()){
                    String type = entry.getKey();
                    long[] values = entry.getValue();
                    
                    long min = values[0];
                    long max = values[1];
                    
                    if(next_number >= min && next_number <= max){
                        System.out.println("* " + type);
                    }
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
