package beautiful.days.at.movies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulDaysAtTheMoviesMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        System.out.println(BeautifulDaysAtTheMovies.beautifulDays(i, j, k));

        bufferedReader.close();
    }
}
