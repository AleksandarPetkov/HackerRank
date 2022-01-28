package time.conversion;

public class TimeConversion {
    public static String timeConversion(String input) {
        String formattedTime = "";
        if (input != null){
            String format = input.substring(input.length() - 2);
            switch (format){
                case "AM":
                    formattedTime = formattingFromAM(input);
                    break;
                case "PM":
                    formattedTime = formattingFromPM(input);
                    break;
                default:
                    formattedTime += "Invalid Input!";
            }
        }
        return formattedTime;
    }

    private static String formattingFromPM(String input) {
        int format24Hour = Integer.parseInt(input.substring(0, 2)) + 12;
        String newFormat = input.substring(2, input.length() -2);
        if (Integer.parseInt(input.substring(0, 2)) == 12) {
            return 12 + newFormat;
        }
        return Integer.toString(format24Hour) + newFormat;
    }

    private static String formattingFromAM(String input) {
        int format24Hour = Integer.parseInt(input.substring(0, 2));
        String newFormat = input.substring(0, input.length() - 2);
        if (format24Hour == 12){
            return "00" + input.substring(2, input.length() - 2);
        }
        return newFormat;
    }
}
//    Sample Input 0
//
//        07:05:45PM
//        Sample Output 0
//
//        19:05:45