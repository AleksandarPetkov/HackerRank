package WarmUp_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2 . She must avoid the thunderheads.
 Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
 Sample Input
 7
 0 0 1 0 0 1 0
 Sample Output
 4
 */
public class JumpingOnTheClouds {
    private static final int ONE_STEP = 1;
    private static final int TWO_STEPS = 2;

    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int cloud = 0;

        //Jump until end of sequences
        while (cloud != c.length - 1){
            //Cannot go out of the array
            if (c.length - 2 == cloud){
                steps++;
                break;
            }

            //First check if she can make two steps
            if (c[cloud + TWO_STEPS] != 1){
                cloud += TWO_STEPS;
                steps++;

            //Second check if she can make one step
            } else if(c[cloud + ONE_STEP] != 1){
                 cloud += ONE_STEP;
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int[] ar = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println( jumpingOnClouds(ar));
    }
}
