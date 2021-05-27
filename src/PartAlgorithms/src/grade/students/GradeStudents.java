package grade.students;
import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * HackerLand University has the following grading policy:
 *
 * Every student receives a  in the inclusive range from  to .
 * Any  less than  is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 *
 * If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
 * If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 */
public class GradeStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> grades = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        result.forEach(System.out::println);
        bufferedReader.close();
    }
}
