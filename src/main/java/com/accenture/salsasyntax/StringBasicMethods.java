package com.accenture.salsasyntax;

public class StringBasicMethods {

    public static void main(String[] args) {
        String bestString = new String("I am a good string");
        System.out.println(bestString.contains("am")); //contains
        System.out.println(bestString.contains("Str"));
        System.out.println(bestString.length()); //length
        // Strings should not be compared like that:
        // "a"=="a"
        // == tests for reference equality (whether they are the same object)
        //.equals() tests for value equality (whether they are logically "equal")
        System.out.println(new String("test") == new String("test")); // --> false
        System.out.println(bestString.equals("I am a good string"));//equals --> true

    }

}
