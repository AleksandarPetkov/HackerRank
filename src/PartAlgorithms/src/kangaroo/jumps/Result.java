package kangaroo.jumps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Result {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int firstKangarooStartingPosition = Integer.parseInt(firstMultipleInput[0]);

        int  firstKangarooJumpDistance = Integer.parseInt(firstMultipleInput[1]);

        int secondKangarooStartingPosition = Integer.parseInt(firstMultipleInput[2]);

        int secondKangarooJumpDistance = Integer.parseInt(firstMultipleInput[3]);

        KangarooCompetition.calculateKangarooDistance(firstKangarooStartingPosition, firstKangarooJumpDistance, secondKangarooStartingPosition,
                secondKangarooJumpDistance);
    }
}
