package day03;

/*
    날짜: 2026-11-19 목요일
    주제: 반복문(for문)

    [개념]
    - 특정 코드를 정해진 횟수만큼 반복 실행하는 문법
    - 초기식, 조건식, 증감식으로 구성
    - 조건식이 true인 동안 반복 실행
    - 조건식이 false가 되면 반복문 종료

    [주의사항]
    - 초기식은 반복문 시작 시 한 번 실행
    - i++는 변수i를 1 증가시키는 연산
    - 조건식이 계속 true이면 무한 반복될 수 있음
 */

public class ForLoop {
    public static void main(String[] args){

        int stockPrice = 30000;

        for (int i = 1; i <= 5; i++){
            System.out.println(i + "주 매수금액: " + stockPrice * i + "원");
        }

        /*
            [누적 합계 계산]
            - 반복문이 실행될 때마다 계산한 값을 계속 더하는 방식
            - 합계를 저장할 변수는 0으로 초기화
            - 기존 합계에 새로운 값을 더한 후 다시 저장

            [주의사항]
            - 누적 변수는 for문 밖에서 선언
            - for문 안에서 누적 변수를 0으로 초기화하면 이전에 더한 값이 사라짐
         */
        int sum = 0;

        for (int i = 1; i <= 5; i++){
            sum += i * 30000;
        }
        System.out.println("합계: " + sum);

        // for + if
        // 1부터 100까지 짝수의 합계 구하기

        sum = 0;

        for (int i = 1; i <= 100; i++){

            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("짝수 합계: " + sum);

        /*
            for문 + if문 응용 : 최대 매수 가능 수량

            [개념]
            - for문을 사용해 매수 수량을 하나씩 증가
            - if문으로 보유 현금과 총 매수금액을 비교
            - 매수 가능한 경우 수량을 변수에 저장
            - 반복문 종료 후 최대 매수 가능 수량 출력

            [주의사항]
            - 최대 매수 가능 수량을 저장할 변수는 반복문 밖에서 선언
            - 매수금액이 보유 현금 이하인 경우에만 수량 갱신
            - 반복문이 끝난 뒤 최종 결과 출력
         */

        int balance = 200000;
        stockPrice = 35000;

        int maxQuantity = 0;


        for (int i = 1; i <= 10; i++){

            if ((stockPrice * i) <= balance){
                maxQuantity = i;

            }
        }
        int totalPrice = stockPrice * maxQuantity;
        int remainingBalance = balance - totalPrice;

        System.out.println("최대 매수 가능 수량: " + maxQuantity + "주");
        System.out.println("필요한 매수금액: " + totalPrice + "원");
        System.out.println("남은 금액: " + remainingBalance + "원");

        /*
        [for문 응용 : 구구단 출력]

        [개념]
        - for문을 이용하여 일정한 숫자를 반복해서 곱하는 방식
        - 고정된 숫자와 반복 변수를 곱하여 결과 계산
        - 반복 변수는 1부터 9까지 증가

        [주의사항]
        - 반복 변수 i는 매 반복마다 1씩 증가
        - 곱셈 결과는 반복할 때마다 새롭게 계산
        - 출력문은 for문 안에 작성해야 매번 출력됨
     */
        int seven = 7;
        for (int i = 1; i <= 9; i++){
            System.out.println(seven + " x " + i + " = " + seven * i);

        }
    }
}
