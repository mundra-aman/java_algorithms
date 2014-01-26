package Algos;

import java.util.HashSet;
import java.util.Set;

public class PairAddsToSum {
    private int[] _inputArray;
    private int _sum;

    PairAddsToSum(int[] inputArray, int sum) {
        this._inputArray = inputArray;
        this._sum = sum;
    }

    public void compute() {
        Set<Integer> set = new HashSet<Integer>();
        for(int idx = 0; idx < this._inputArray.length; ++idx) {
            if(set.contains(this._sum - this._inputArray[idx])) {
                System.out.println(this._inputArray[idx] + ", " + (this._sum - this._inputArray[idx]));
            } else {
                set.add(this._inputArray[idx]);
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 6, 8, 1, 3, 0, 2, 5};
        int sum = 8;
        PairAddsToSum pairAddsToSum = new PairAddsToSum(inputArray, sum);
        pairAddsToSum.compute();
    }
}
