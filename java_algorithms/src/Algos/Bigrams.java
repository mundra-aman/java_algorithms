package Algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Bigrams {
    public static List<String> getBigrams(String input) {
        List<String> bigramList = new ArrayList<String>();

        if(input == null || input.length() == 0) {
            return bigramList;
        }

        for(int idx=0; idx<input.length(); ++idx) {
            if(idx == 0) {
                bigramList.add("$" + input.charAt(idx));
            }
            if(idx == input.length()-1) {
                bigramList.add(input.charAt(idx) + "$");
            }
            if(idx < input.length()-1) {
                bigramList.add("" + input.charAt(idx) + input.charAt(idx+1));
            }
        }
        return bigramList;
    }

    public static double getJaccardIndex(String input1, String input2) {
        List<String> bigramListInput1 = getBigrams(input1);
        List<String> bigramListInput2 = getBigrams(input2);

        Set<String> unionSet = new HashSet<String>();
        Set<String> intersectionSet = new HashSet<String>();

        Iterator iterator1 = null;
        Iterator iterator2 = null;
        if(bigramListInput1.size() < bigramListInput2.size()) {
            iterator1 = bigramListInput1.iterator();
            iterator2 = bigramListInput2.iterator();
        } else {
            iterator1 = bigramListInput2.iterator();
            iterator2 = bigramListInput1.iterator();
        }

        while(iterator1.hasNext()) {
            unionSet.add((String)iterator1.next());
        }
        while(iterator2.hasNext()) {
            String currentBigram = (String)iterator2.next();
            if(unionSet.contains(currentBigram)) {
                intersectionSet.add(currentBigram);
            } else {
                unionSet.add(currentBigram);
            }
        }

        double jaccardIndex = 0.0;
        if(unionSet.size() != 0) {
            jaccardIndex = (double)((double)intersectionSet.size()/(double)unionSet.size());
        }
        printBigrams(input1, bigramListInput1);
        printBigrams(input2, bigramListInput2);
        System.out.println("intersection count [" + intersectionSet.size() + "], union count [" + unionSet.size() + "]");
        System.out.println("jaccard index [" + jaccardIndex + "]");

        return jaccardIndex;
    }

    private static void printBigrams(String input, List<String> bigrams) {
        if(input == null || input.length() == 0) {
            System.out.println("empty or null input string");
        } else {
            System.out.print("input [" + input + "], bigrams => [ ");
            Iterator iterator = bigrams.iterator();
            while(iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        String[] inputTestData = {null, "", "a", "aa", "abc", "abcd", "abcde"};

        /*
        for(int idx = 0; idx < inputTestData.length; ++idx) {
            List<String> bigrams = getBigrams(inputTestData[idx]);
            printBigrams(inputTestData[idx], bigrams);
        }
        */

        getJaccardIndex(null, null);
        getJaccardIndex(null, "");
        getJaccardIndex("", null);
        getJaccardIndex("", "");
        getJaccardIndex("a", "");
        getJaccardIndex("", "a");
        getJaccardIndex("succint", "successful");

        getJaccardIndex("jaccard", "jackard");
        getJaccardIndex("dog", "cat");
        getJaccardIndex("cat", "dog");
        getJaccardIndex("jaccard", "jaccard");
    }
}
