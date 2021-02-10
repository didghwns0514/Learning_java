package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

    public static void main(String[] args){

        // 문자열
        // 문자열 형식은 .equals Method 사용
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println("\n");

    }
}
