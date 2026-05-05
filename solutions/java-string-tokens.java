import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String line = sc.nextLine();
            sc.close();

            line = line.replaceAll("[^A-Za-z]", " ").trim();

            if (line.isEmpty()) {
                System.out.println(0);
            } else {
                String[] tokens = line.split("\\s+");

                System.out.println(tokens.length);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        } else {
            System.out.println(0);
        }
    }
}
