package utopian.tree;

public class UtopianTree {

    public static int utopianTree(int cycles) {
        // Sapling with a height of 1 meter is planted at the onset of spring
        int treeHeight = 1;

        for (int c = 0; c < cycles; c++) {

            if (c % 2 == 0) {
                // Each spring, it doubles in height
                treeHeight *= 2;
            } else {
                // Each summer, its height increases by 1 meter.
                treeHeight++;
            }
        }
        return treeHeight;
    }
}
