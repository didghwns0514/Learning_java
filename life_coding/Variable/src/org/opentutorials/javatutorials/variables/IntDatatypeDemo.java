/**
 * 생활코딩 강의 26강
 */
package org.opentutorials.javatutorials.variables;

public class IntDatatypeDemo {

    public static void main(String[] args){
        /*
        >> 메모리 절약을 위해...

        ALL ARE SIGNED... for some reason
        byte   ::  -2^8/2 ~ 2^8/2 - 1
        short  ::  -2^16/2 ~ 2^16/2 - 1
        int        32
        long       64
        
        
        >>> for numberse:
        use int for 정수
        use double for 실수
         */
        short a = 128;
        System.out.println(a);
        byte b = 127;
        System.out.println(b);
    }

}
