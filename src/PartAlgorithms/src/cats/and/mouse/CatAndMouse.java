package cats.and.mouse;

public class CatAndMouse {
    private static final String FIRST_CAT = "Cat A";
    private static final String SECOND_CAT = "Cat B";
    private static final String MOUSE = "Mouse C";

    // Complete the catAndMouse function below.
    static String catAndMouse(int firstCatPosition, int secondCatPosition, int mousePosition) {
        int firstCatSteps = calculateCatSteps(firstCatPosition, mousePosition);
        int secondCatSteps = calculateCatSteps(secondCatPosition, mousePosition);

        if (firstCatSteps == secondCatSteps){
            return MOUSE;
        }

        return firstCatSteps < secondCatSteps ? FIRST_CAT : SECOND_CAT;
    }

    private static int calculateCatSteps(int catPosition,int mousePosition){
        return Math.abs(catPosition - mousePosition);
    }
}
