package min.max.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing
 * exactly four!!! of the five integers. Then print the respective minimum and maximum values as a single
 * line of two space-separated long integers.
 *
 */
public class MinMaxSum {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        calculateMinMaxSequences(numbers);
    }

    private static void calculateMinMaxSequences(int[] numbers) {
        int lowestNumber = findLowestNumberInSequence(numbers);
        int highestNumber = findHighestNumberInSequence(numbers);

        if (lowestNumber == highestNumber) {
            calculateEqualNumbersInSequenceCase(numbers);
        } else {
            String lowestResult = calculateSequence(highestNumber, numbers);
            String highestResult = calculateSequence(lowestNumber, numbers);
            System.out.printf("%s %s%n",lowestResult, highestResult);
        }
    }

    private static int findHighestNumberInSequence(int[] numbers) {
        int highestNumber = Integer.MIN_VALUE;

        for (int position = 0; position < numbers.length; position++) {
            if(numbers[position] >= highestNumber) {
                highestNumber = numbers[position];
            }
        }
        return highestNumber;
    }

    private static int findLowestNumberInSequence(int[] numbers) {
        int lowestNumber = Integer.MAX_VALUE;
        for (int position = 0; position < numbers.length; position++) {
            if(numbers[position] <= lowestNumber) {
                lowestNumber = numbers[position];
            }
        }
        return lowestNumber;
    }

    private static String calculateSequence(int currentNumber, int[] numbers) {
        long highestResult = 0;
        for (int position = 0; position < numbers.length; position++) {
            if (currentNumber != numbers[position]){
                highestResult += numbers[position];
            }
        }
        return Long.toString(highestResult);
    }

    private static void calculateEqualNumbersInSequenceCase(int[] numbers) {
        long sum = 0;
        for (int position = 0; position < numbers.length - 1; position++) {
            sum += numbers[position];
        }
        String sumString =  Long.toString(sum);
        System.out.printf("%s %s%n",sumString, sumString);
    }
}
