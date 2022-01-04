package acm.icpc.team;

import java.util.*;

public class AcmIcpcTeam {

    private static int bestAchievedTopics;
    private static int bestTeamCombination;
    private static int currentTeamCombination;

    public static List<Integer> acmTeam(List<String> topics) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < topics.size() - 1; i++) {
            char[] currentTopic = topics.get(i).toCharArray();
            for (int j = i + 1; j < topics.size(); j++) {
                ++currentTeamCombination;
                char[] nextTopic = topics.get(j).toCharArray();
                checkTeamResult(currentTopic, nextTopic, currentTeamCombination);
            }
        }

        result.add(bestAchievedTopics);
        result.add(bestTeamCombination);
        return result;
    }

    private static void checkTeamResult(char[] currentTopic, char[] nextTopic, int teamCombination) {
        int topicAchieved = 0;
        for (int i = 0; i < currentTopic.length; i++) {
            if(currentTopic[i] == '1' || nextTopic[i] == '1'){
                topicAchieved++;
            }
        }

        if (topicAchieved >= bestAchievedTopics){
            bestAchievedTopics = topicAchieved;
            bestTeamCombination = teamCombination;
        }
    }
}
