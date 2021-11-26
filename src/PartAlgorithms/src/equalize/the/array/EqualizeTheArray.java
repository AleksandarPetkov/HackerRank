package equalize.the.array;

import java.util.List;

public class EqualizeTheArray {
    // 1 2 2 3 => findEqualSequance =>

    /**
     Given an array of integers, determine the minimum number of elements to delete to leave
     only elements of equal value.

     1 2 3 1 2 3 3 3 => find Biggest Sequence (3) => count other numbers
     */

    public static int equalizeArray(List<Integer> numbers) {
         int biggerSequenceNumber = findBiggestSequence(numbers);

        return findNotEqualCount(biggerSequenceNumber, numbers);
    }

    private static Integer findBiggestSequence(List<Integer> numbers) {
        int biggestSequence = Integer.MIN_VALUE;
        int sequencesNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentNumber = numbers.get(i);
            int currentSequence = 0;
            for (int j = i + 1; j < numbers.size(); j++) {
                int nextNumber = numbers.get(j);
                if (currentNumber == nextNumber){
                    currentSequence++;
                }
            }

            if (currentSequence >= biggestSequence){
                biggestSequence = currentSequence;
                sequencesNumber = currentNumber;
            }
        }
        return sequencesNumber;
    }

    private static int findNotEqualCount(int biggestNumber, List<Integer> numbers) {
        int counter = 0;
        for (Integer number : numbers) {
            if (number != biggestNumber){
                counter++;
            }
        }
        return counter;
    }
}
