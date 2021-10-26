package circular.array.rotation;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> sequence, int rotations, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rotations; i++) {
            int currentIndex = sequence.get(sequence.size() -1);
            sequence.remove(sequence.size() -1);
            sequence.add(0,currentIndex);
        }

        for (int i = 0; i < queries.size(); i++) {
            result.add(sequence.get(queries.get(i)));
        }
        return result;
    }
}
