package com.accenture.salsasyntax;

public class StringBasicMethods {

    public static void main(String[] args) {
        String bestString = new String("I am a good string");
        System.out.println(bestString);
        System.out.println("Contains method:");
        System.out.println(bestString.contains("am")); //true
        System.out.println(bestString.contains("Str")); //false
        System.out.println("Length method");
        System.out.println(bestString.length()); //length
        System.out.println("Split method");
        String[] result = bestString.split(" ");
        for (String s1 : result) {
            System.out.println(s1);
        }
        System.out.println("String comparison");
// Strings should not be compared like that:
// "a"=="a"
// == tests for reference equality (whether they are the same object)
//.equals() tests for value equality (whether they are logically "equal")
        System.out.println(new String("test") == new String("test")); // --> false
        System.out.println(bestString.equals("I am a good string"));//equals --> true



    }

}
