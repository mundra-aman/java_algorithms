package Algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumCoins {
    // C(P) = Min({ C(P-Vi) }) + 1
    // C(P) = minimumCost of total value P
    // Vi = Value of current coin denomination
    public static int getMinimumCoins(int total, Integer[] coinDenoms) {
        Set<Integer> coinDenomsSet = new HashSet<Integer>(Arrays.asList(coinDenoms));

        int[] minimumCost = new int[total + 1];
        for(int i = 0; i < minimumCost.length; ++i) {
            minimumCost[i] = Integer.MAX_VALUE - coinDenoms[coinDenoms.length - 1];
        }
        minimumCost[0] = 0;

        for(int i = 1; i <= total; ++i) {
            for(int j = 0; j < coinDenoms.length; ++j) {
                if(coinDenomsSet.contains(i)) {
                    minimumCost[i] = 1;
                } else {
                    if((coinDenoms[j] <= i) && ((minimumCost[i - coinDenoms[j]] + 1) < minimumCost[i])) {
                        minimumCost[i] = minimumCost[i - coinDenoms[j]] + 1;
                    }
                }
            }
        }
        return minimumCost[total];
    }

    public static void main(String[] args) {
        Integer[] coinDenoms = {1, 2, 3, 7, 13};
        System.out.println("Coin Denoms Array " + Arrays.toString(coinDenoms));
        for(int idx = 0; idx <= 15; ++idx) {
            System.out.println("Total [" + idx + "], Minimum Coins [" + getMinimumCoins(idx, coinDenoms) + "]");
        }
    }
}
