package Algos;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BinarySearch {
    private Integer[] _inputArray;

    BinarySearch(List<Integer> inputList) throws Exception {
        if((inputList == null) || (inputList.size() <= 0)) {
            throw new Exception("Error: Input List NULL or Empty!");
        }
        Collections.sort(inputList);
        _inputArray = new Integer[inputList.size()];
        inputList.toArray(_inputArray);
    }

    public Integer binarySearchClosestMatch(Integer inputMatch) throws Exception {
        System.out.print("Search Number [" + inputMatch + "], ");
        if((_inputArray == null) || (_inputArray.length <= 0)) {
            throw new Exception("Error: Input Array NULL or Empty!");
        }
        if(_inputArray.length == 1) {
            return _inputArray[0];
        }
        int idxStart = 0;
        int idxEnd = _inputArray.length - 1;
        while(true) {
            int idxMiddle = idxStart + (idxEnd - idxStart)/2;
            //System.out.println(idxStart + ", " + idxEnd + ", " + idxMiddle + ", " + _inputArray[idxMiddle]);
            if(_inputArray[idxMiddle] == inputMatch) {
                return inputMatch;
            }
            if(idxStart == idxEnd) {
                if(idxStart == 0) {
                    if(Math.abs(_inputArray[idxStart] - inputMatch) < Math.abs(_inputArray[idxStart + 1] - inputMatch)) {
                        return _inputArray[idxStart];
                    } else {
                        return _inputArray[idxStart + 1];
                    }
                }
                if(idxStart == (_inputArray.length - 1)) {
                    if(Math.abs(_inputArray[idxStart] - inputMatch) < Math.abs(_inputArray[idxStart - 1] - inputMatch)) {
                        return _inputArray[idxStart];
                    } else {
                        return _inputArray[idxStart - 1];
                    }
                }
            }
            if(idxStart > idxEnd) {
                if(Math.abs(_inputArray[idxStart] - inputMatch) < Math.abs(_inputArray[idxEnd] - inputMatch)) {
                    return _inputArray[idxStart];
                } else {
                    return _inputArray[idxEnd];
                }
            }
            if(_inputArray[idxMiddle] < inputMatch) {
                idxStart = idxMiddle + 1;
            } else {
                idxEnd = idxMiddle - 1;
            }
        }
    }

    public Integer binarySearchClosestDistance(Integer inputMatch) throws Exception {
        //System.out.print("Search Number [" + inputMatch + "], ");
        if((_inputArray == null) || (_inputArray.length <= 0)) {
            throw new Exception("Error: Input Array NULL or Empty!");
        }
        if(_inputArray.length == 1) {
            return Math.abs(_inputArray[0] - inputMatch);
        }
        int idxStart = 0;
        int idxEnd = _inputArray.length - 1;
        while(true) {
            int idxMiddle = idxStart + (idxEnd - idxStart)/2;
            //System.out.println(idxStart + ", " + idxEnd + ", " + idxMiddle + ", " + _inputArray[idxMiddle]);
            if(_inputArray[idxMiddle] == inputMatch) {
                return 0;
            }
            if(idxStart == idxEnd) {
                if(idxStart == 0) {
                    return Math.min(Math.abs(_inputArray[idxStart] - inputMatch), Math.abs(_inputArray[idxStart + 1] - inputMatch));
                }
                if(idxStart == (_inputArray.length - 1)) {
                    return Math.min(Math.abs(_inputArray[idxStart] - inputMatch), Math.abs(_inputArray[idxStart - 1] - inputMatch));
                }
            }
            if(idxStart > idxEnd) {
                return Math.min(Math.abs(_inputArray[idxStart] - inputMatch), Math.abs(_inputArray[idxEnd] - inputMatch));
            }
            if(_inputArray[idxMiddle] < inputMatch) {
                idxStart = idxMiddle + 1;
            } else {
                idxEnd = idxMiddle - 1;
            }
        }
    }

    /*
    public static void main(String[] args) {
        //Integer[] inputArray = {10};
        Integer[] inputArray = {10, 12, 3, 4, 15, 90, 2};
        //Integer[] inputArray = null;
        //Integer[] inputArray = {};
        try {
            BinarySearch binarySearch = new BinarySearch(new ArrayList<Integer>(Arrays.asList(inputArray)));
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(12) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(12) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(2) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(2) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(90) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(90) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(1) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(1) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(45) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(45) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(51) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(51) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(52) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(52) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(53) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(53) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(54) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(54) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(55) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(55) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(70) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(70) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(100) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(100) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(1100) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(1100) + "]");
            System.out.println("Closest Match [" + binarySearch.binarySearchClosestMatch(-100) + "]");
            System.out.println("Closest Distance [" + binarySearch.binarySearchClosestDistance(-100) + "]");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
    */
}

