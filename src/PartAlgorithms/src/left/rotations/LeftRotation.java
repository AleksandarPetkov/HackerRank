package left.rotations;

import java.util.List;

public class LeftRotation {

    private static final int FIRST_INDEX = 0;

    /** Example:
     * 1 2 3 4 5 -> 2 3 4 5 1 -> 3 4 5 1 2 -> 4 5 1 2 3
     */

    public static List<Integer> rotLeft(List<Integer> sequence, int rotations) {
        int lastIndex = sequence.size() - 1;
        for (int index = 0; index < rotations; index++) {
            //Save first element
            int temp = sequence.get(FIRST_INDEX);
            //Rotate the rest of the elements
            rotateRestOfTheElements(sequence);
            //Rotate a first element on the end of the sequence
            sequence.set(lastIndex, temp);
        }
        return sequence;
    }

    private static void rotateRestOfTheElements(List<Integer> sequence) {
        for (int index = 0; index < sequence.size() - 1 ; index++) {
            sequence.set(index, sequence.get(index + 1));
        }
    }
}
