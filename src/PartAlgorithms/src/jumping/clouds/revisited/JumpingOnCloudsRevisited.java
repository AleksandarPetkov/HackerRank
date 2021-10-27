package jumping.clouds.revisited;

public class JumpingOnCloudsRevisited {
    private static int energy = 100;


    static int jumpingOnClouds(int[] clouds, int jumps) {
        int index = 0;

        while (true){
            int currentStep = (index + jumps) % clouds.length;

            if (clouds[currentStep] == 1){
                energy -= 3;
            } else {
                energy--;
            }

            index = currentStep;

            if (index % clouds.length == 0){
                break;
            }
        }

        return energy;
    }
}
