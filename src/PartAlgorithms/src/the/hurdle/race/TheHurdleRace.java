package the.hurdle.race;

import java.util.Comparator;
import java.util.List;

public class TheHurdleRace {

    public static int hurdleRace(int maximumJumpHeight, List<Integer> heights) {
        int magicPotionDoses = 0;

        int maxHurdleHeight = heights.stream()
                .sorted(Comparator.reverseOrder()).findFirst().orElse(0);

        if (maxHurdleHeight > maximumJumpHeight){
            magicPotionDoses = maxHurdleHeight - maximumJumpHeight;
        }

        return magicPotionDoses;
    }
}
