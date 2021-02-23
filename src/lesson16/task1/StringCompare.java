package lesson16.task1;

import java.util.Arrays;

public class StringCompare {

    public static void main(String[] args) {
        System.out.println(new String("abc") == new String("abc"));
        System.out.println(new String("abc").equals(new String("abc")));
        System.out.println("abc" == "abc");

        System.out.println("Abc".equals("abc"));

        String s1 = "test";
        String s2 = "test";

        System.out.println(s1 == s2);

        //intern - forces adding a string to string pool
        //intern usage example
        String s3 = new String("pppp");
        String s4 = "pppp";

        System.out.println(s3 == s4);
        s3 = s3.intern(); //important; s4 deleted with garbage collector
        System.out.println(s3 == s4);

        //bytes of String
        String str = "testStringVar";
        System.out.println(Arrays.toString(str.getBytes()));

        System.out.println(new String(str.getBytes()));
    }
}