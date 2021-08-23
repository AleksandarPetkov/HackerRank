package migration.birds;

import java.util.List;

public class MigrationBirds {

    public static int migratoryBirds(List<Integer> birds) {
        int birdType = 0;
        int birdFrequency = 0;

        for (int index = 0; index < birds.size() - 1; index++) {
            int currentBirdType = birds.get(index);
            int currentBirdFrequency = 0;

            for (int i = index + 1; i < birds.size(); i++) {
                int nextBirdType = birds.get(i);
                if (currentBirdType == nextBirdType){
                    currentBirdFrequency++;
                }
            }

            if (currentBirdFrequency > birdFrequency){
                birdFrequency = currentBirdFrequency;
                birdType = currentBirdType;
            }
        }
        return birdType;
    }
}
