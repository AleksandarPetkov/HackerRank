package save.the.prisoner;

public class SaveThePrisoner {

    public static int saveThePrisoner(int prisoners, int sweets, int startingChairNumber) {
        // Write your code here

        //Edge cases
        if (startingChairNumber < 0 || startingChairNumber > prisoners){
            return 0;
        }

        int warnPrisoner = startingChairNumber - 1;
        for (int chair = 0; chair < sweets; chair++) {

            if (warnPrisoner == prisoners){
                warnPrisoner = 1;
            } else {
                warnPrisoner++;
            }
        }
        return warnPrisoner;
    }
}
