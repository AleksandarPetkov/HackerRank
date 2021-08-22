package breaking.best.and.worst.records;

import java.util.List;

public class Records {

    private int highestScore;
    private int highestScoreCounter;
    private int lowestScore;
    private int lowestScoreCounter;

    String findHighestAndLowestScore(List<Integer> scores){
        for (Integer score : scores) {
            checkRecords(score);
        }
        return String.format("%d %d", highestScoreCounter, lowestScoreCounter);
    }

    private void checkRecords(Integer score) {
        if (highestScore == 0 && lowestScore == 0){
            applyFirstGameResults(score);
        } else {
            if (score > highestScore){
                highestScore = score;
                highestScoreCounter++;
            }
            else if (score < lowestScore){
                lowestScore = score;
                lowestScoreCounter++;
            }
        }
    }

    void applyFirstGameResults(int score){
        highestScore = score;
        lowestScore = score;
    }
}
