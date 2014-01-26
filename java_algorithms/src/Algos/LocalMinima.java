package Algos;

public class LocalMinima {
    public static int findLocalMinima(int[] input) {
        if(input == null || input.length <= 0) {
            return -1;
        }
        if(input.length == 1) {
            return 0;
        }

        int startIdx = 0;
        int endIdx = input.length-1;
        while(startIdx < endIdx) {
            int midIdx = (startIdx+endIdx)/2;
            System.out.println("Mid Index [" + midIdx + "] :00");
            if(midIdx == 0 && input[midIdx] < input[midIdx+1]) {
                System.out.println("Mid Index [" + midIdx + "] :01");
                return midIdx;
            }
            System.out.println("Mid Index [" + midIdx + "] :02");
            if(midIdx == input.length-1 && input[midIdx] < input[midIdx-1]) {
                System.out.println("Mid Index [" + midIdx + "] :03");
                return midIdx;
            }
            System.out.println("Mid Index [" + midIdx + "] :04");
            if(input[midIdx] < input[midIdx-1] && input[midIdx] < input[midIdx+1]) {
                System.out.println("Mid Index [" + midIdx + "] :05");
                return midIdx;
            }
            System.out.println("Mid Index [" + midIdx + "] :06");
            if(input[midIdx] < input[endIdx] && input[midIdx] > input[startIdx]) {
                System.out.println("Mid Index [" + midIdx + "] :07");
                startIdx = midIdx + 1;
            } else if(input[midIdx] > input[endIdx] && input[midIdx] < input[startIdx]) {
                System.out.println("Mid Index [" + midIdx + "] :08");
                endIdx = midIdx - 1;
            } else {
                System.out.println("Mid Index [" + midIdx + "] :09");
                startIdx = midIdx + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] inputArray = {1, 3, 4, 5, 12, 10, 14, 9};
        //int[] inputArray = {1};
        //int[] inputArray = {1, 2};
        //TODO: int[] inputArray = {2, 1};
        int[] inputArray = {10, 5, 1};
        //int[] inputArray = {1, 3, 4};
        //int[] inputArray = {5, 3, 4};
        int localMinimaIdx = findLocalMinima(inputArray);
        if(localMinimaIdx == -1) {
            System.out.println("Local minima does not exist");
        } else {
            System.out.println("Local minima [" + inputArray[localMinimaIdx] + "]");
        }
    }
}

