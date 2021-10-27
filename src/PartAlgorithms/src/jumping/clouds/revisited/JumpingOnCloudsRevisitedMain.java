package jumping.clouds.revisited;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnCloudsRevisitedMain {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println(JumpingOnCloudsRevisited.jumpingOnClouds(c,k));

        scanner.close();
    }
}
