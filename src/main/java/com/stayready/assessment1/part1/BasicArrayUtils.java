package com.stayready.assessment1.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    //static String[] input = {"The", "quick", "brown"};
    //static String[] expected = {"brown", "quick", "The"};
    public static String[] reverse(String[] stringArray) {

        List<String> list = new ArrayList<String>();
        
        for (int i = 0; i < stringArray.length; i++)
        {
            list.add(stringArray[i]);
        }

        Collections.reverse(list);

        String[] reversedArray = new String[stringArray.length]; 
        for (int i = 0; i < stringArray.length; i++)
        {
            reversedArray[i] = list.get(i);
        }
        
        return reversedArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        
        String firstLetterOfEachIndex = "";
        
        for (int i = 0; i < stringArray.length; i++)
        {
            firstLetterOfEachIndex = firstLetterOfEachIndex + stringArray[i].charAt(0);
        }
        
        return firstLetterOfEachIndex;
    }
}
