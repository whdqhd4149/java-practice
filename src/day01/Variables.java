package day01;

/*
    날짜 : 2026-11-17 화요일
    주제 : 변수(Variable)

    [핵심 개념]
    1. 변수는 데이터를 저장하고 이름을 붙여 사용하는 공간이다.
    2. 변수 선언 : 자료형 변수명 = 값;
    3. 초기화는 변수에 처음으로 값을 저장하는 것이다.
    4. 이미 선언한 변수는 자료형을 다시 적지 않고 값을 변경한다.
    5. 연산할 때는 변수에 마지막으로 저장된 값을 사용한다.
 */

public class Variables {
    public static void main(String[] args){

        // int : 정수를 저장하는 자료형
        // price 변수를 선언하고 50000으로 초기화
        int price = 50000;

        // quantity 변수를 선언하고 3으로 초기화
        int quantity = 3;

        // 기존 price 값을 50000에서 70000으로 변경
        price = 70000;

        // 기존 quantity 값을 3에서 5로 변경
        quantity = 5;

        // * : 곱셈 연산자
        // 변경된 값인 70000 * 5를 계산하여 출력
        System.out.println(price * quantity);

    }
}
