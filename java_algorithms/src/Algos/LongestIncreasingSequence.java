package Algos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LongestIncreasingSequence {

    LongestIncreasingSequence() {
    }

    public void compute(int[] inputArray) throws Exception {
        if(inputArray == null || inputArray.length == 0) {
            throw new Exception("Invalid input array");
        }

        List<Integer> longestIncreasingSequenceList = new ArrayList<Integer>();
        longestIncreasingSequenceList.add(inputArray[0]);
        for(int idx = 1; idx < inputArray.length; ++idx) {
            int updateIndex = getUpdateIndex(longestIncreasingSequenceList, inputArray[idx]);
            if(updateIndex >= longestIncreasingSequenceList.size()) {
                //If last value is less than the current value, add it, else replace it
                if(longestIncreasingSequenceList.get(longestIncreasingSequenceList.size() - 1) > inputArray[idx]) {
                    longestIncreasingSequenceList.remove(longestIncreasingSequenceList.size() - 1);
                }
                longestIncreasingSequenceList.add(inputArray[idx]);
            } else {
                //Replace the index at current value
                longestIncreasingSequenceList.remove(updateIndex);
                longestIncreasingSequenceList.add(updateIndex, inputArray[idx]);
            }
        }

        Iterator iterator = longestIncreasingSequenceList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    private int getUpdateIndex(List<Integer> list, int value) {
        int idxStart = 0;
        int idxEnd = list.size() - 1;
        int idxMiddle;
        while(true) {
            idxMiddle = idxStart + (idxEnd - idxStart)/2;
            if(list.get(idxMiddle) == value) {
                return idxMiddle;
            }
            if(idxStart >= idxEnd) {
                if(list.get(idxStart) > value) {
                    return idxStart - 1;
                } else {
                    return idxStart + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            LongestIncreasingSequence longestIncreasingSequence = new LongestIncreasingSequence();
            int[] inputArray = {1, 3, 2, 12, 4, 18, 12};
            longestIncreasingSequence.compute(inputArray);
        } catch(Exception exception) {
            System.out.println("ERR: " + exception.getMessage());
        }
        System.out.println("Hello World!");
    }
}
