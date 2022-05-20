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

            System.out.println(builder); //I am a string made with a builder.
        }

        {
            StringBuilder builder = new StringBuilder("This is my starting point.");

            String s1 = " And I can append to it.";

            builder.append(s1);

            System.out.println(builder); //This is my starting point. And I can append to it.
        }

    }


    private static void insertDemo() {
        StringBuilder builder = new StringBuilder();
        String s1 = "I am string.";
        String s2 = "a ";

        builder.append(s1);
        System.out.println(builder); //I am string.

        builder.insert(5,s2);
        System.out.println(builder); //I am a string.

    }

    //amount of characters storage size in string builder.
    //An empty StringBuilder class contains the default 16 character capacity
    //If the number of the character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2
    private static void capacityDemo(){
        StringBuilder sb=new StringBuilder();//16
        System.out.println(sb.capacity());
        sb.append("Hello. ");
        System.out.println(sb.capacity());//16
        sb.append("I am a longer string. ");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.append("blabla");
        System.out.println(sb.capacity());//now (34*2)+2=70

        //StringBuilder(int capacity) - we can set the initial capacity
    }

    public static void main(String[] args) {
        System.out.println("Append demo:");
        appendDemo();
        System.out.println("Insert demo:");
        insertDemo();
        System.out.println("Capacity demo: ");
        capacityDemo();
    }


        /*some other methods:

     reverse(), toString(), length()
     delete(int startIndex, int endIndex), (the endIndex is excluded)
     replace(int startIndex, int endIndex, String str)

     .equals() is not overriden; we can use toString() and then use equals() to compare two StringBuilder objects;

        */


}
