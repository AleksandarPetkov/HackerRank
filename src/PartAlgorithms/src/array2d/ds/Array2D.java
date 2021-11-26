package array2d.ds;
import java.util.ArrayList;
import java.util.List;

public class Array2D {
    private static boolean inMatrix = true;
    private static int highestHourglass = 0;
    private static byte row = 0;
    private static byte col = 0;

    /**
     1 1 1 0 0 0 -> 1 1 1
     0 1 0 0 0 0      1
     1 1 1 0 0 0    1 1 1
     0 0 2 4 4 0
     0 0 0 2 0 0
     0 0 1 2 4 0
     */
    public static int hourglassSum(List<List<Integer>> values) {

        while (inMatrix){
            if (isHourglassPatternMatch(row, col, values)){
                inMatrix = false;
            }
            checkNextHourglass(row, col, values);
        }

        return 0;
    }

    private static void checkNextHourglass(byte row, byte col, List<List<Integer>> values) {
        int upperPart = findPartOfHourglassSum(row, values);
        int middlePart = values.get(row + 1).get(col + 1);
        int lowerPart = findPartOfHourglassSum(row + 2, values);

        int currentSum = upperPart + middlePart + lowerPart;

        if (currentSum > highestHourglass){
            highestHourglass = currentSum;
        }
    }

    private static boolean isHourglassPatternMatch(byte row, byte col, List<List<Integer>> values) {
        return true;
    }

    private static int findPartOfHourglassSum(int row, List<List<Integer>> values) {
        int sum = 0;
        for (int index = 1; index <= 3; index++) {
            int number = values.get(row).get(col + index);
            sum += number;
        }
        return sum;
    }
}
