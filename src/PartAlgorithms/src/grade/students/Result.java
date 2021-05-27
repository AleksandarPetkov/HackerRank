package grade.students;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private static final int MIN_GRADE_REQUIRED_FOR_ROUNDING = 38;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundingGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < MIN_GRADE_REQUIRED_FOR_ROUNDING){
                roundingGrades.add(grade);
            } else {
                roundGrade(grade, roundingGrades);
            }
        }
        return roundingGrades;
    }

    private static void roundGrade(Integer grade, List<Integer> roundingGrades) {
        int roundedGrade = 0;
        String wholeGrade = String.valueOf(grade);
        char secondCharNumber = wholeGrade.charAt(1);
        int secondNumber = Integer.parseInt(String.valueOf(secondCharNumber));

        if (secondNumber > 0 && secondNumber < 5){
            roundedGrade = (grade / 10) * 10 + 5;
            checkForRounding(roundedGrade, grade, roundingGrades);
        } else if (secondNumber > 5 && secondNumber < 10){
            roundedGrade = (grade / 10) * 10 + 10;
            checkForRounding(roundedGrade, grade, roundingGrades);
        } else {
            roundingGrades.add(grade);
        }
    }

    private static void checkForRounding(Integer roundedGrade, Integer grade, List<Integer> roundingGrades) {
        if (roundedGrade - grade < 3){
            roundingGrades.add(roundedGrade);
        } else {
            roundingGrades.add(grade);
        }
    }
}
