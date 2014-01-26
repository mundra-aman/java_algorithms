package Algos;

public class LongestSubsequenceString {
    LongestSubsequenceString() {
    }

    public void compute(String inputString1, String inputString2) throws Exception {
        if(inputString1 == null || inputString2 == null) {
            throw new Exception("Input string cannot be null");
        }

        int inputString1Length = inputString1.length();
        int inputString2Length = inputString2.length();

        if((inputString1Length == 0) || (inputString2Length == 0)) {
            throw new Exception("Input string cannot be empty");
        }

        int[][] matrix = new int[inputString1Length + 1][inputString2Length + 1];
        int longestIncreasingSubsequenceLength = 0;
        String longestCommonSubsequence = "";
        for(int idxI = 0; idxI < inputString1Length; ++idxI) {
            for(int idxJ = 0; idxJ < inputString2Length; ++idxJ) {
                if(inputString1.charAt(idxI) == inputString2.charAt(idxJ)) {
                    matrix[idxI + 1][idxJ + 1] = matrix[idxI][idxJ] + 1;
                    if(matrix[idxI + 1][idxJ + 1] > longestIncreasingSubsequenceLength) {
                        longestIncreasingSubsequenceLength = matrix[idxI + 1][idxJ + 1];
                        longestCommonSubsequence = inputString1.substring(idxI - longestIncreasingSubsequenceLength + 1, idxI + 1);
                    }
                }
            }
        }
        System.out.println("Input Word 1: [" + inputString1 + "]");
        System.out.println("Input Word 2: [" + inputString2 + "]");
        System.out.println("LCS: [" + longestCommonSubsequence + "]");
    }

    public static void main(String[] args) {
        LongestSubsequenceString longestSubsequenceString = new LongestSubsequenceString();
        try {
            longestSubsequenceString.compute("philologist", "lollipop");
            longestSubsequenceString.compute("philosopher", "philanderer");
            longestSubsequenceString.compute("aaaaataatttaaaaaaaat", "taaaaaaaaataaaaataaaatattaaaaattaaattaaaaaaaaaaaaa");
            longestSubsequenceString.compute("UOVRSMOYOULDPGXQOHQY", "TXQGTDFMPOZZILDAOXKA");
            longestSubsequenceString.compute("deliverycarrier", "diverycart");
            longestSubsequenceString.compute(
                    "DZFPTRTZTWXPIWAXCGDRCXAAGZYZCGCUVLZLGJRFACFHYHFEIZNUEXUIHAJABQPUFKFOSUPYFYIJLAXCJZPNEHQZYWYSKYGGVACR",
                    "ZOKSRFYIKGISAQVQIMXKKFJYEXDXSTYABFCDARVUSHANCNVKDXRBUWXCHHSOUVIORYMTYEOWXLLBWGXQIZXTFHQEUWQRHBLUGRBN"
                    );
        } catch(Exception exception) {
            System.out.println("ERR: " + exception.getMessage());
        }
        System.out.println("Hello World!");
    }
}
