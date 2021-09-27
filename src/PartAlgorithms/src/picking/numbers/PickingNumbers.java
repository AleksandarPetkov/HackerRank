package picking.numbers;
import java.util.Collections;
import java.util.List;


public class PickingNumbers {
    private static int biggestNumberInSubArray;
    private static int  longestSubArray;
    private static int currentSubArray;

    public static int pickingNumbers(List<Integer> sequence) {
        Collections.sort(sequence);

        for (int index = 0; index < sequence.size() - 1; index++) {
            int currentNumber = sequence.get(index);
            currentSubArray = 1;

            for (int position = index + 1; position < sequence.size(); position++) {
                int nextPosition = sequence.get(position);

                if (isAbsoluteConditionLessThanOne(currentNumber, nextPosition)){
                    currentSubArray++;
                }
            }

            if (currentSubArray > longestSubArray){
                longestSubArray = currentSubArray;
            }
        }
        return longestSubArray;
    }

    private static boolean isAbsoluteConditionLessThanOne(int currentPosition, int nextPosition){

        if (isAbsoluteDifferenceLessThanOne(currentPosition, nextPosition)){
            biggestNumberInSubArray = Math.max(biggestNumberInSubArray, nextPosition);
            if (isAbsoluteDifferenceLessThanOne(biggestNumberInSubArray, nextPosition)){
                return true;
            } else {
                biggestNumberInSubArray = 0;
                return false;
            }
        }
        return false;
    }

    private static boolean  isAbsoluteDifferenceLessThanOne (int currentPosition, int nextPosition){
        return Math.abs(currentPosition - nextPosition ) == 1 || Math.abs(currentPosition - nextPosition ) == 0;
    }
}
