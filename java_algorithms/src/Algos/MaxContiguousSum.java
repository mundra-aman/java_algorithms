package Algos;

public class MaxContiguousSum {
    MaxContiguousSum() {
    }

    public void compute(int[] inputArray) {
        if((inputArray != null) && (inputArray.length <= 0)) {
            return;
        }

        int sum = 0;
        int maxSum = 0;
        int idxStart = 0;
        int idxEnd = 0;
        boolean sumReset = false;

        System.out.print("Input Array [ ");
        for(int idx = 0; idx < inputArray.length; ++idx) {
            System.out.print(inputArray[idx] + " ");
            sum += inputArray[idx];
            if(maxSum < sum) {
                maxSum = sum;
                if(sumReset == true) {
                    idxStart = idx;
                    sumReset = false;
                }
                idxEnd = idx;
            } else if(sum < 0) {
                sum = 0;
                sumReset = true;
            }
        }
        System.out.println("]");

        System.out.print("Max Contiguous Series [ ");
        for(int idx = idxStart; idx <= idxEnd; ++idx) {
            System.out.print(inputArray[idx] + " ");
        }
        System.out.println("]");
        System.out.println("Max Sum [ " + maxSum + " ]");
    }

    public static void main(String[] args) {
        int[] inputArray = {2, -8, 3, -2, 4, -10, -1, 30, -4, -6, -9, 21, -12};
        MaxContiguousSum maxContiguousSum = new MaxContiguousSum();
        maxContiguousSum.compute(inputArray);
    }
}
