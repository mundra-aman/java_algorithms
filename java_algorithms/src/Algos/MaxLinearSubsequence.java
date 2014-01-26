package Algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class MaxLinearSubsequence {
    MaxLinearSubsequence() {
    }

    public void getMaxLinearSubsequence(int[] array) {
        if(array == null || array.length <= 0) {
            System.out.println("Error: Input Invalid");
            return;
        }
        System.out.println("Input Array => " + Arrays.toString(array));

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<array.length; ++i) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }

        BitSet bitSet = new BitSet(maxValue - minValue);
        for(int i=0; i<array.length; ++i) {
            bitSet.set(array[i]-minValue+1);
        }

        List<Integer> maxContiguousList = new ArrayList<Integer>();
        List<Integer> currentContiguousList = new ArrayList<Integer>();
        currentContiguousList.add(minValue);
        for(int i=2; i<bitSet.length(); ++i) {
            if(!(bitSet.get(i) && bitSet.get(i-1))) {
                currentContiguousList.clear();
            } else {
                currentContiguousList.add(i+minValue-1);
            }
            if(currentContiguousList.size() > maxContiguousList.size()) {
                maxContiguousList = new ArrayList<Integer>(currentContiguousList);
            }
        }
        System.out.println("Max Contiguous Array => " + maxContiguousList.toString());
    }

    public static void main(String[] args) {
        int[] inputArray = {6, 10, 4, 7, 9, 5, 12, 13, 11, 14};
        //int[] inputArray = {10};
        MaxLinearSubsequence maxLinearSubsequence = new MaxLinearSubsequence();
        maxLinearSubsequence.getMaxLinearSubsequence(inputArray);
    }
}
