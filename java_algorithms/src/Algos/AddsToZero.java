package Algos;


public class AddsToZero {
    // inputArray = {3, -2, -1, 4, 5, 6}
    public static boolean sumAddsToZero(int[] inputArray) {
        if(inputArray == null || inputArray.length <= 0) {
            return false;
        }

        for(int i=0; i<inputArray.length; ++i) {
            int sum = 0;
            for(int j=i; j<inputArray.length; ++j) {
                sum += inputArray[j];
                if(sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sumAddsToZero2(int[] inputArray) {
        //TODO: Complete this part of the code
        //sum(i, j) = sum(0, j) - sum(0, i-1)
        return false;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, -2, 1, 4, 5, 6};
        System.out.println(sumAddsToZero(inputArray));
    }
}
