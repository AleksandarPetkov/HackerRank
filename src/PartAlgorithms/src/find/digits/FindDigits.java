package find.digits;

public class FindDigits {
    private static int divisorsCount;

    public static int findDigits(int input) {
        divisorsCount = 0;
        if (input == 0){
            return 0;
        }
        int initialInput = input;
        while (input > 0){
            int currentNumber = input % 10;
            input /= 10;
            if (currentNumber != 0){
                checkForDivisor(currentNumber, initialInput);
            }
        }
        return divisorsCount;
    }

    private static void checkForDivisor(int currentNumber, int initialInput) {
        if (initialInput % currentNumber == 0){
            divisorsCount++;
        }
    }
}
