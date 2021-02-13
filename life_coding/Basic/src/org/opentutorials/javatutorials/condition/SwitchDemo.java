/**
 * 생활코등 강의 39강
 */
package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

    public static void main(String[] args){

        System.out.println("switch(1)");
        /*
            밑에 switch 값으로
            byte, short, char, int, enum, string.. 등 몇개만 들어갈 수 있음
         */
        switch(1){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                // break 없어서 case2로 들어오면 case 3이 실행됨
            case 3:
                System.out.println("case 3");
            default:
                System.out.println("default");
                break;
        }

    }

}
