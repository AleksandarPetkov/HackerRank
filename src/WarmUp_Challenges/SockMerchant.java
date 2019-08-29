package WarmUp_Challenges;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 Function Description
 Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
 sockMerchant has the following parameter(s):
 n: the number of socks in the pile
 ar: the colors of each sock
 Input Format
 The first line contains an integer , the number of socks represented in .
 The second line contains  space-separated integers describing the colors  of the socks in the pile.
 Constraints
 where
 Output Format
 Return the total number of matching pairs of socks that John can sell.
 Sample Input
 9
 10 20 20 10 10 30 50 10 20
 */
public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> existingNumbers = new HashSet<>();

        int pairs = 0;
        int counter = 1;
        for(int i = 0; i < ar.length - 1 ; i++){
            counter = 1;

            for(int j = i + 1; j < ar.length ; j++){
                if(existingNumbers.contains(ar[i])){
                    break;
                }

                if(ar[i] == ar[j]){
                    counter++;
                }
            }
            existingNumbers.add(ar[i]);

            //If I have even counter just delete on 2
            if(counter % 2 == 0){
                pairs += counter / 2;

             // If I have odd counter I using Math.Floor to take the pairs. If counter is 0 just skip it
            } else if(counter % 2 == 1 && counter != 0)  {
                pairs += Math.floor(counter / 2);
            }

        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int result = sockMerchant(ar.length, ar);
        System.out.println(result);
    }
}
