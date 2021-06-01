package kangaroo.jumps;

public class KangarooCompetition {

    public static void calculateKangarooDistance(int firstKangarooStartingPosition, int firstKangarooJumpDistance,
                                          int secondKangarooStartingPosition ,int secondKangarooJumpDistance){

        int firstKangarooCurrentDistance = firstKangarooStartingPosition + firstKangarooJumpDistance;
        int secondKangarooCurrentDistance = secondKangarooStartingPosition + secondKangarooJumpDistance;

        for (int jump = 0; jump < Integer.MAX_VALUE; jump++) {
            if (secondKangarooStartingPosition > firstKangarooStartingPosition && secondKangarooJumpDistance > firstKangarooCurrentDistance){
                System.out.println("NO");
                break;
            }

            if (firstKangarooCurrentDistance == secondKangarooCurrentDistance) {
                System.out.println("YES");
                break;
            }

            firstKangarooCurrentDistance +=  firstKangarooJumpDistance;
            secondKangarooCurrentDistance += secondKangarooJumpDistance;
        }
    }
}
