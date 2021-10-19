package viral.advertising;
/**
 *
 Day Shared Liked Cumulative
 1      5     2       2
 2      6     3       5
 3      9     4       9
 4     12     6      15
 5     18     9      24

 1st day=> 5(liked) /2(shared) = 2(like) 2(Cumulative)
 2nd day=> 2(liked) * 3(shared) = 2 * 3 = 6 -> 6/2 = 3(liked) (2 + 3)days = 5 (Cumulative)
 3th day=> 3(liked) * 3(shared) = 9(shared) => 9/2 = 4(like) => (2 + 3 + 4 )days = 9 (Cumulative)
 4th day=> 4(liked) * 3(shared) = 12 (shared) => 12/2 6(like) => (2 + 3 + 4 + 6) = 15 (Cumulative)
 */
public class ViralAdvertising {

    private static final int SHARES_WITH_FRIENDS = 3;
    private static final int HALF_PERCENT = 2;
    private static int likesPerDay = 2;
    private static int cumulative = 2;

    public static int viralAdvertising(int days) {

        if (days == 1){
           return likesPerDay;
        }

        for (int day = 2; day <= days ; day++) {
            int currentLikes = (likesPerDay * SHARES_WITH_FRIENDS) / HALF_PERCENT;
            cumulative += currentLikes;
            likesPerDay = currentLikes;
        }
        return cumulative;
    }
}
