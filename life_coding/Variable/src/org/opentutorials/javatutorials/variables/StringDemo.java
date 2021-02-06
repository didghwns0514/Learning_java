/**
 * 생활코딩 강의 22강
 */
package org.opentutorials.javatutorials.variables;

public class StringDemo {

    /*
    > static
        어디서든 참조 가능
        저걸 선언 안하면 instance로 되며 사용을 원하면
        클래스 할당 이후 인스턴스로 접근해야함

        많이 사용하면 메모리 낭비됨(garbage collector가 안건드린다)
        고로 공용사용하는 유틸같은 경우가 유용할 것

    > main
        자바에서 code를 가장 먼저 loading하는 곳은 main()

    > String[] args
        python sys arg[1], arg[2] 등과 동일, interface 제공자
        -----------------------
            class 파일이 생성된 디렉토리를 찾아가 다음과 같이 명령어를 주면
            String[] args 형태의 파라미터 값을 넘겨줄 수 있다.
            >> java -cp bin step08.Test01_1 aaa bbb ccc 111 222
            main 코드 안
            >> System.out.println(args[0], args[1], args[2], args[3], args[4]);
            실행 결과
            >> aaa, bbb, ccc, 111, 222
        -----------------------
    */
    public static void main(String[] args){

        String first;
        first = "coding";

        // or
        // cant do : String first = "new coding";
        first = "new coding";

        System.out.println(first + "__is my text");
    }
}
