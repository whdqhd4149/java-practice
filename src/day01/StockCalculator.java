package day01;

/*
    날짜 : 2026-11-17 화요일
    주제 : 주식 매수금액 계산

    [핵심 개념]
    1. 변수를 활용하여 데이터를 관리한다
    2. * 연산자를 사용하여 곱셈을 수행한다
    3. 계산 결과를 새로운 변수에 저장할 수 있다
    4. + 연산자로 문자열과 변수 값을 연결할 수 있다

    [계산 공식]
    총 매수 금액 = 1주 가격 * 매수 수량
 */

public class StockCalculator {
    public static void main(String[] args){

        // Stirng : 주식 종목명 저장
        String stockName = "Samsung";

        // int: 주식 1주의 가격 저장
        int price = 85000;

        // int : 매수할 주식 수량 저장
        int quantity = 15;

        // price와 quantity를 곱한 결과를 totalPrice에 저장
        // 85000 * 15 = 1275000
        int totalPrice = price * quantity;

        // + 연산자로 문자열과 변수 값을 연결하여 출력
        System.out.println("종목명: " + stockName);
        System.out.println("1주 가격: " + price);
        System.out.println("매수 수량: " + quantity);
        System.out.println("총 매수금액: " + totalPrice);
    }
}
