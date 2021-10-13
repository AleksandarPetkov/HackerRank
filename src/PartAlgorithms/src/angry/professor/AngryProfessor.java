package angry.professor;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int threshold , List<Integer> studentsArrivalTime) {
        int arrivalsOnTime = 0;

        for (Integer studentTime : studentsArrivalTime) {
            //If student is on time
            if (studentTime <= 0){
                arrivalsOnTime++;
            }
        }

        return arrivalsOnTime >= threshold ? "NO" : "YES";
    }
}
