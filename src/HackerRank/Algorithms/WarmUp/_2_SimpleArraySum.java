package HackerRank.Algorithms.WarmUp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Given an array of integers, find the sum of its elements.
For example, if the array, array =[1,2,3]; 1 + 2 + 3 = 6, so return 6.
 */

public class _2_SimpleArraySum {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("/Users/afam/Desktop/")));

        int arrayCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> array = Stream.of(bufferedReader.readLine()
                                    .replaceAll("\\s+$", "")
                                    .split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        int result = _2_SimpleArraySum.result(array);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        System.out.println("Sum of given array is " + sum());
    }

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int arraySum[] = {1,2,3,4};

    // method for sum of elements in an array
    public static int sum() {
        int sum = 0; // initialize sum
        // Iterate through all elements and add them to sum
        for (int i = 0; i < arraySum.length; i++)
            sum +=  arraySum[i];
        return sum;
    }


}
