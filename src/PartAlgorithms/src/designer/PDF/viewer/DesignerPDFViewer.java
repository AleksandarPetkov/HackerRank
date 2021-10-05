package designer.PDF.viewer;

import java.util.List;

public class DesignerPDFViewer {

    private static final int ASCII_INDEX = 97;
    private static int tallestHeightLetter;

    public static int designerPdfViewer(List<Integer> heightsOfLetter, String wordString) {
        char[] word = wordString.toCharArray();

        for (char letter : word) {
            findHeightOfCurrentLetter(letter, heightsOfLetter);
        }
        return tallestHeightLetter * word.length;
    }

    private static void findHeightOfCurrentLetter(char letter, List<Integer> heightsOfLetters) {
        int heightOfLetter = 0;
        int charPosition = findCharPositionInSequence(letter);

        if (charPosition >= 0 && charPosition <= heightsOfLetters.size()){
            heightOfLetter = heightsOfLetters.get(charPosition );
        }

        if (tallestHeightLetter < heightOfLetter){
            tallestHeightLetter = heightOfLetter;
        }
    }

    private static int findCharPositionInSequence(char letter) {
        return  letter - ASCII_INDEX;
    }
}
