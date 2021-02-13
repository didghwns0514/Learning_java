/**
 * 생활코딩 강의 27 ~ 29강
 */

package org.opentutorials.javatutorials.variables;

public class ConstantDemo {

    public static void main(String[] args){
        /*
        constant 대입시, 가장 가까운 data type으로 되기 때문에
        casting 필요할 수 있음
         */
        double a = 2.2; // int, float 2.2 상수 아님
        float b = 2.2F; // float 타입 명시적 지정
        long c = 2147483648L; // const가 int기 때문에 L로 casting

        // 자동 형변환
        ///////////////////////////////////////////////////////
        double k = 3.0F; // float to double is possible
        // float j = 3.0; // 오류가 안됨(넓은 의미의 형변환으로만 가능)

        int p =3;
        float q = 1.0F;
        double t = p + q; // + 연산위해 p가 float 형변환
                          // 이후 덧셈 계산 후 doule로 형변환
        System.out.println(t);


        // 명시적 형변환
        ///////////////////////////////////////////////////////
        //float t = 100.0; //error, 100.0 자체는 선언시 double임
        float t1 = (float)100.0; //가능
        int b1 = (int)100.0F; // constant 형변환 후 명시적 형변환
                              // 소수점 밑에 자리 버림으로 int 변환
        System.out.println(t1);
        System.out.println(b1);
    }
}
