package climbing.the.eaderboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {
    private static List<Integer> playerRecordsPosition = new ArrayList<>();


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> playerRecords) {
        List<Integer> records = ranked.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        for (Integer player : playerRecords) {
            int position = findPlayerRecords(player, records);
            playerRecordsPosition.add(position);
        }
        return playerRecordsPosition;
    }

    private static int findPlayerRecords(int playerRecord,  List<Integer> records){
        int previousRecord = -1;
        int position = 0;

        for (int index = 0; index < records.size(); index++) {
            int currentRecord = records.get(index);
            if (index >= 1){
                previousRecord = records.get(index - 1);
            }

            if (!(previousRecord == currentRecord)){
                position++;
            }

            if (playerRecord >= currentRecord){
                return position;
            }
        }
        return position + 1;
    }
}
