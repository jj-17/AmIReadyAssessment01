package com.stayready.assessment1.part1;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        
    
        ArrayList<String> letters = new ArrayList<>();

        //out string into list 
        for (int i = 0; i < str.length(); i++) 
        {
            letters.add(str.charAt(i)+"");
        }

        //check previous index to see if space exists; if it does set current index to capitals
        for (int i = 0; i < letters.size(); i++) 
        {
            if (i == 0)
            {
                letters.set(0, letters.get(i).toUpperCase());
            } else {

                if (i != 0 && letters.get(i-1).equals(" "))
                {
                    letters.set(i, letters.get(i).toUpperCase());
                };
            }
        }
        System.out.println(letters);
        String camelString = "";
        for (int i = 0; i < letters.size(); i++)
        {
            camelString = camelString + letters.get(i);
        }
        
        return camelString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }


    // public static String reverse(String str) {
    //     // StringBuilder rev = new StringBuilder();
    //     // rev.append(str);
    //     // rev = rev.reverse();
        
    //     // return rev.toString();

    //     String string = "";
        
    //     for(int i = 0;i<str.length();i++)
    //     {
    //         string += str.charAt(str.length()- 1 -i);
    //     }


    // public static String invertCasing(String str) {
    //     String result = "";
    //     for(int idx = 0; idx < str.length(); idx++){
    //         Character currChar = str.charAt(idx);
    //         if(Character.isUpperCase(currChar)){
    //             result += Character.toLowerCase(currChar);
    //         } else if (Character.isLowerCase(currChar)){
    //             result += Character.toUpperCase(currChar);
    //         } else {
    //             result += currChar;
    //         }
    //     }
    //     return result;
    // }
        

}
