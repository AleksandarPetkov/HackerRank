package beautiful.days.at.movies;

public class BeautifulDaysAtTheMovies {
    private static int beautifulDay = 0;

    public static int beautifulDays(int firstDay, int lastDay, int divisor) {

        for (int day = firstDay; day <= lastDay; day++) {
            double reversedNumber = getReversedAndFormattedNumber(Integer.toString(day));
            checkForBeautifulDay(reversedNumber, day, divisor);
        }
        return beautifulDay;
    }

    private static void checkForBeautifulDay(double reversedNumber, int day, int divisor) {
        double difference = day - reversedNumber;
        double divisorResult = difference / divisor;

        //Is number is whole or float Check
        if (divisorResult == Math.ceil(divisorResult)){
            beautifulDay++;
        }
    }

    public static Double getReversedAndFormattedNumber(String orig)
    {
        //Reverse
        char[] charArray = orig.toCharArray();
        int length = charArray.length;
        int halfLength = length / 2;
        for (int position = 0; position < halfLength ; position++)
        {
            char temp = charArray[position];
            charArray[position] = charArray[length-1-position];
            charArray[length-1-position] = temp;
        }

        //Remove all zeroes at the beginning
        String number = new String(charArray);
        String regex = "^0+(?!$)";
        number = number.replaceAll(regex, "");
        return Double.parseDouble(number);
    }
}