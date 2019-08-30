package WarmUp_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
 Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.
 For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.
 Sample Input
 aba
 10
 Sample Output
 7
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        final long quotient = n/s.length();
        final long remainder = n%s.length();
        long aCount = 0;

        if((s.length() == 1) && (s.charAt(0) == 'a')){
            return n;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                aCount++;
            }
        }
        aCount = aCount * quotient;
        for(int i=0; i<remainder; i++){
            if(s.charAt(i) == 'a'){
                aCount++;
            }
        }
        return aCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        long n = Long.parseLong(reader.readLine());

        System.out.println(repeatedString(str ,n ));
    }
}
