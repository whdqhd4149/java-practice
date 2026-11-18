package day02;

/*
    날짜: 2026-11-18 수요일
    주제: 산술 연산자

    + : 덧셈
    - : 뺼셈
    * : 곱셈
    / : 나눗셈(정수끼리 계산하면 소수점 이하 버림)
    % : 나눗셈의 나머지
 */

public class Operators {
    public static void main(String[] args){

        int a = 10;
        int b = 3;

        System.out.println("덧셈: " + (a + b));
        System.out.println("뺄셈: " + (a - b));
        System.out.println("곱셈: " + (a * b));
        System.out.println("나눗셈: " + (a / b));
        System.out.println("나머지: " + (a % b));

        /*
            정수와 실수 나눗셈의 차이
            정수 / 정수 : 결과가 정수 (소수점 이하 버림)
            실수 / 정수 : 결과가 실수
         */
        System.out.println("정수 나눗셈: " + (17 / 5));
        System.out.println("실수 나눗셈: " + (17.0 / 5));

        /*
            연산자 우선순위
            1순위 : 괄호 ()
            2순위 : 곱셈(*), 나눗셈(/), 나머지(%)
            3순위 : 덧셈(+), 뺄셈(-)
            우선순위가 같으면 왼쪽부터 계산
         */
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("우선순위 1: " + result1);
        System.out.println("우선순위 2: " + result2);
    }
}
