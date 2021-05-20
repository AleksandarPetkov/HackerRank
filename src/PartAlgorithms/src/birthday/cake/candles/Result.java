package birthday.cake.candles;

import java.util.List;

public class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int countOfCandles = 0;
        int tallestCandle = findTallestCandle(candles);
        for (Integer candle : candles) {
            if (candle == tallestCandle ){
                countOfCandles++;
            }
        }
        return countOfCandles;
    }

    private static int findTallestCandle(List<Integer> candles) {
        int tallestCandle = Integer.MIN_VALUE;
        for (Integer candle : candles) {
            if (candle > tallestCandle) {
                tallestCandle = candle;
            }
        }
        return tallestCandle;
    }
}
