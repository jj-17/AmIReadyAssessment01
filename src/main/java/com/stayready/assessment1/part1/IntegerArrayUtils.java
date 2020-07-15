package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        
        int totalSum = 0;

        for (int index = 0; index < intArray.length; index++)
        {
            totalSum = totalSum + intArray[index];
        }
        
        return totalSum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        
        int totalProduct = 0;

        for (int index = 0; index < intArray.length; index++)
        {
            totalProduct = totalProduct * intArray[index];
        }
        
        return totalProduct;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double avg = (double)getSum(intArray) / intArray.length;
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        return null;
    }

    // public static Integer getLargest(Integer[] intArray) {
    //     int largest = 0;
    //     for (int i = 0; i < intArray.length; i++) {
    //         if (intArray[i] > largest) {
    //             largest = intArray[i];
    //         }
    //     }
    //     return largest;
    // }
}
