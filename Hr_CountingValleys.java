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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int height= 0;
        int mountains= 0;
        int valleys= 0;
        boolean reset= true;

        for(int i=0; i<steps; i++){
            String currHike= String.valueOf(path.charAt(i));
            
            if(height==0) reset= true;

            if(currHike.equals("D")){
                if(reset){
                    valleys+= 1;
                    reset= false;
                }
                height-= 1;
            }else if(currHike.equals("U")){
                if(reset){
                    mountains+= 1;
                    reset= false;
                }
                height+= 1;
            }
        }
        return valleys;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
