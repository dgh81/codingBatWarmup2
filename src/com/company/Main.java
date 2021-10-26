package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //String str = "xxaxxx";
        String str = "fiskeri";
        System.out.println(stringTimes("Hi", 4));
        System.out.println(doubleX(str));

        System.out.println(frontTimes(str,7));
        System.out.println(countXX(str));
        System.out.println(stringBits(str));
        System.out.println(stringSplosion(str));
    }

    public static String stringTimes(String str, int n) {
        String myString = "";
        for (int i = 0; i < n; i++) {
            myString = myString + str;
        }
        return myString;
    }

    public static boolean doubleX(String str) {

            int i = str.indexOf("x");
            if (i == -1) return false; // no "x" at all

            // Is char at i+1 also an "x"?
            if (i + 1 >= str.length()) return false; // check i+1 in bounds?
            //System.out.println(str.substring(i + 1, i + 2));
        return str.substring(i + 1, i + 2).equals("x");

    }

    public static String frontTimes(String str, int n) {
        String result = "";
        if (str.length()>3) {
            str = str.substring(0,3);
        } else {
            str = str.substring(0,str.length());
        }

        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    public static int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i+2>str.length()) {
            } else {
                if (str.substring(i,i+1).equals("x") && str.substring(i+1,i+2).equals("x")) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0,i+1);
        }
        return result;
    }
}
