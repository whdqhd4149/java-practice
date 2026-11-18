package day02;

/*
    날짜: 2026-11-18 수요일
    주제: 비교 연산자(ComparisonOperators)

    비교 연산자란?
    두 값을 비교해서 true 또는 false를 반환하는 연산자

    > : 크다
    < : 작다
    >= : 크거나 같다
    <= : 작거나 같다
    == : 같다
    != : 다르다

    [주의]
    = : 변수에 값을 저장하는 대입 연산자
    == : 두 값이 같은지 확인하는 비교 연산자
 */

public class ComparisonOperators {
    public static void main(String[] args){

        // 비교 연산자 기본
        int a = 10;
        int b = 5;

        System.out.println("크다: " + (a > b));
        System.out.println("작다: " + (a < b));
        System.out.println("크거나 같다: " + (a >= b));
        System.out.println("작거나 같다: " + (a <= b));
        System.out.println("같다: " + (a == b));
        System.out.println("다르다: " + (a != b));

        // 비교 결고를 boolean 변수에 저장
        boolean result = a > b;

        System.out.println("비교 결과: " + result);

        // 주식 매수금액 비교
        int stockPrice = 35000;
        int quantity = 5;
        int balance = 175000;

        // 총 매수금액 계산
        int totalPrice = stockPrice * quantity;

        // 보유 현금이 총 매수금액 이상인지 비교
        boolean canBuy = balance >= totalPrice;
        // boolean canBuy = balance > totalPrice;

        System.out.println("총 매수금액: " + totalPrice + "원");
        System.out.println("보유현금: " + balance + "원");
        System.out.println("매수 가능 여부: " + canBuy);
    }
}
