/**
 * 생활코딩 강의 47강
 */
package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

    public static void main(String[] args){

        for(int i = 0; i<10 ; i++){

            for(int j=0; j<10; j++){
                System.out.println(Integer.toString(i) +" __and__ " +
                        Integer.toString(j));
            }
        }

    }
}
