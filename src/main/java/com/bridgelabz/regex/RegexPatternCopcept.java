package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternCopcept{
    public static void main(String[] args) {
        /**
         * + -> atleast one or more than one
         * ^___$ -> entire string
         */
        /*Pattern pattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcher = pattern.matcher("SanJana"); // false
        Matcher matcher = pattern.matcher("Sanjana"); // true
        System.out.println(matcher.find());*/

        /*Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher("SanJana"); // true
        System.out.println(matcher.find());*/

        /*Pattern pattern = Pattern.compile("boy");
        Matcher matcher = pattern.matcher("This is a boy"); //true
        System.out.println(matcher.find());*/

        /*Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher = pattern.matcher("abcd");
        System.out.println(matcher.find());*/

        //Quantifiers
        /*Pattern pattern = Pattern.compile("[a-zA-Z0-9@%]");
        Matcher matcher = pattern.matcher("2"); //true
        System.out.println(matcher.find());*/

        //Quantifiers { }
        //fixed
        /*Pattern pattern = Pattern.compile("^[A-Z]{3}[a-z]{3}$");
        Matcher matcher = pattern.matcher("ABCdef"); //true
        System.out.println(matcher.find());*/

        //minimum 3
        /*Pattern pattern = Pattern.compile("^[A-Z]{3,}[a-z]{3,}$");
        Matcher matcher = pattern.matcher("ABCDCdefhd"); //true
        System.out.println(matcher.find());*/

        //maximum
        /*Pattern pattern = Pattern.compile("^[A-Z]{1,3}[a-z]{0,3}$");
        Matcher matcher = pattern.matcher("Adef"); //true
        System.out.println(matcher.find());*/

        //+ -> atleast one or more than one
        // * -> Zero or more
        // ? -> Zero o one
        /*Pattern pattern = Pattern.compile("^[ABC]*$");
        Matcher matcher = pattern.matcher("ABCBCCBA"); //true
        System.out.println(matcher.find());*/

        /*Pattern pattern = Pattern.compile("^[ABC]?$");
        Matcher matcher = pattern.matcher("A"); //true
        System.out.println(matcher.find());*/

        /**
         * +919898989898
         * 09898989898
         * 9898989898
         */
        /*Pattern pattern = Pattern.compile("^(\\+91|0)?[9876][0-9]{9}$");
        Matcher matcher = pattern.matcher("9898989898"); //true
        System.out.println(matcher.find());*/

        Pattern pattern = Pattern.compile("^[1-9][0-9]{5}$");
        Matcher matcher = pattern.matcher("089898"); //true
        System.out.println(matcher.find());

        boolean matches = Pattern.matches("^[1-9][0-9]{5}$", "111111" );
        System.out.println(matches);

    }

    public boolean isValid(String input){
        Pattern pattern = Pattern.compile("^[1-9][0-9]{5}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public boolean isValidMobileNumber(String input) throws Exception {
        if (input != null) {
            Pattern pattern = Pattern.compile("^(\\+91|0|91)?[9876][0-9]{9}$");
            Matcher matcher = pattern.matcher(input);
            return matcher.find();
        }else {
            throw new Exception("Null is invalid input");
        }
    }
}

/**
 * 1> first Character capital
 */