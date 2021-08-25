package drawing.book;

import grade.students.Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DrawingBookMain {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> bookDetails = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int bookSize = bookDetails.get(0);
        int desiredPage = bookDetails.get(1);

        System.out.println(DrawingBook.pageCount(bookSize, desiredPage));
        bufferedReader.close();
    }
}
