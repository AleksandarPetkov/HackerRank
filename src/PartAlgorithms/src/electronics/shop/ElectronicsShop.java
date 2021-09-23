package electronics.shop;

public class ElectronicsShop {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(Integer[] keyboards, Integer[] drives, int budget) {
        int bestTotalCoast = -1;

        for (int index = 0; index < keyboards.length; index++) {
            int keyBoardPrice = keyboards[index];
            for (int position = 0; position < drives.length; position++) {
                int usbPrice = drives[position];
                int currentCoast = keyBoardPrice + usbPrice;
                if (currentCoast <= budget && bestTotalCoast < currentCoast){
                    bestTotalCoast = currentCoast;
                }
            }
        }
        return bestTotalCoast;
    }

}
