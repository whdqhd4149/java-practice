package day05;

/*
    날짜: 2026-11-21 토요일
    주제: for문과 조건문을 활용한 주식 매수 수량 계산

    [개념]
    - for문: 초기식 -> 조건식 -> 실행문 -> 증감식 순으로 반복
    - 초기식: 반복을 시작할 변수의 초기값 설정
    - 조건식: 참이면 반복하고, 거짓이면 종료
    - 증감식: 반복할 때마다 변수의 값을 증가 또는 감소
    - 누적 변수: 기존 값에 새로운 값을 더하거나 갱신하여 유지
    - 변수의 범위: 선언된 블록 {} 안에서 사용 가능

    [주의사항]
    - for문은 실행문을 먼저 실행한 수 증감식이 실행된다
    - 반복문 안에서 선언한 변수는 반복문 밖에서 사용할 수 없다
    - 누적값을 유지하려면 변수를 반복문 밖에서 초기화해야 한다
    - 최종 결과만 출력할 경우 출력문을 반복문 밖에 작성한다
    - 서로 다른 실습의 변수를 혼동하여 사용하지 않도록 주의한다
 */

public class Review_day04 {
    public static void main(String[] args){

        int stockPrice = 10000;

        for(int i = 1; i <=5; i++){
            System.out.println(i + "주 매수금액: " + i * stockPrice + "원");
        }

        int stockPrice1 = 10000;
        int total = 0;

        for (int i = 1; i <= 5; i++){
            total += stockPrice1;
            System.out.println(i + "회 매수 / 누적 매수금액: " + total + "원");
        }

        int stockPrice2 = 10000;
        int balance = 35000;

        for (int i = 1; i <= 5; i++){
            int totalPrice = stockPrice2 * i;

            System.out.print(i + "주: " + totalPrice + "원 - ");

            if (balance >= totalPrice){
                System.out.println("매수 가능");
            } else {
                System.out.println("매수 불가능");
            }
        }

        int stockPrice3 = 10000;
        int balance1 = 35000;

        int maxQuantity = 0;


        for (int i = 1; i <= 5; i++){
            int totalPrice = i * stockPrice3;

            if(balance >= totalPrice){
                maxQuantity = i;
            }
        }
        System.out.println("최대 매수 가능 수량: " + maxQuantity + "주");
        System.out.println("남은 예산: " + (balance1 - stockPrice3 * maxQuantity) + "원");
    }
}
