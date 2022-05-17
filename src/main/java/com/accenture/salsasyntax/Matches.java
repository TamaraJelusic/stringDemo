package com.accenture.salsasyntax;

public class Matches {
    //public boolean matches(String regex)

    public static void main(String[] args) {
        String s = "I ";

        // ^ starting of string
        // . any character
        System.out.println(s.matches("^I."));

        String s1 = "I am a string";

        // * zero or more of .
        System.out.println(s1.matches("^I.*"));

        // $ end of string
        System.out.println(s1.matches("^I.*f$")); //false
        System.out.println(s1.matches("^I.*g$")); //true

    }

}
