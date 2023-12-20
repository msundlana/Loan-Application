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
     * Complete the 'countStudents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY height as parameter.
     */

    public static int countStudents(List<Integer> height) {
        Integer count = 0;
        Integer temp = 0;
        // Write your code here
        int index = 0;
        for(Integer h: height){
            if(h<temp){
                System.out.println("index" + index);
                System.out.println(h);
                count++;
                for(int j=0; j<=index; j++){
                    if(height.get(j)>height.get(index)){
                        count++;
                    }
                }
            }
            temp = h;
            index++;
        }


        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(1);
        height.add(3);
        height.add(4);
        height.add(1);

        int result = Result.countStudents(height);

        System.out.println(String.valueOf(result));
    }
}
