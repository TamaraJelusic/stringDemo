package com.accenture.salsasyntax;

public class StringBuilderDemo {

    //java.lang.StringBuilder

    /*the principal methods are INSERT and APPEND,
     which are overloaded to accept any data type and convert them to strings */

    //the append method adds characters to the end of the builder
    private static void appendDemo(){
        {
            StringBuilder builder = new StringBuilder();

            String s1 = "I am a ";
            String s2 = "string ";
            String s3 = "made with a ";
            String s4 = "builder.";

            builder.append(s1);
            builder.append(s2);
            builder.append(s3);
            builder.append(s4);

            System.out.println(builder);
        }

        {
            StringBuilder builder = new StringBuilder("This is my starting point.");

            String s1 = " And I can append to it";

            builder.append(s1);

            System.out.println(builder);
        }

    }


    private static void insertDemo() {
        StringBuilder builder = new StringBuilder();
        String s1 = "I am string";
        String s2 = "a ";

        builder.append(s1);
        System.out.println(builder);

        builder.insert(5,s2);
        System.out.println(builder);

    }

    public static void main(String[] args) {
        System.out.println("Append demo:");
        appendDemo();
        System.out.println("Insert demo:");
        insertDemo();
    }

        /*some other methods:

     reverse(), toString(), length()
     delete(int startIndex, int endIndex),
     replace(int startIndex, int endIndex, String str)

        */


}
