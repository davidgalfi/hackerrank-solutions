import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
     
     private static final int H = 0;
     private static final int MIN = 1;
     private static final int SEC = 2;

    public static String timeConversion(String s) {
    // Write your code here
        String raw_time = s.substring(0, s.length() - 2);
        String meridiem = s.substring(s.length() - 2);
        String[] time = raw_time.split(":", 3);
        
        for(int i=0;i<4;i++){
            int h = Integer.parseInt(time[H]);
            if(meridiem.equals("AM")){
                if(h >= 12){
                    h -= 12;
                    time[H] = String.valueOf("0" + h);
                }
            } else {
                if(h < 12){
                    h += 12;
                    time[H] = String.valueOf(h);
                }
            }
        }
        
        return time[H] + ":" + time[MIN] + ":" + time[SEC];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
