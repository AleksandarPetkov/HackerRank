package time.conversion;

import java.io.*;

public class TimeConversionMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        System.out.println(TimeConversion.timeConversion(s));

        bufferedReader.close();
    }
}
