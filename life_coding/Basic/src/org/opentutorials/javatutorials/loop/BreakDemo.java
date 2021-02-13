/**
 * 생활코딩 강좌 46강
 */
package org.opentutorials.javatutorials.loop;

public class BreakDemo {

    public static void main(String[] args){

        for(int i=0; i<10; i++){
            if(i==5) break;
            System.out.println("Hello, I will continue..." + i);
        }

        for(int i=0; i<10; i++){
            if(i==5){
                continue;

            }
            System.out.println("Hi, I will continue..." + i);
        }
    }
}
