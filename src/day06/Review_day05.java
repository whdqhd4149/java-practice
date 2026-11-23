package day06;

/*
    날짜: 2026-11-23 월요일
    주제: Day 05 메서드 복습

    [개념]
    - 메서드: 특정 기능을 수행하는 코드 묶음
    - 배개변수: 메서드가 전달받는 값을 저장하는 변수
    - return: 메서드의 실행 결과를 반환
     [복습]
     - 주식 가격과 수량을 메서드에 전달
     - 가격 * 수량으로 총 매수금액 계산
     - 반환된 결과를 main에서 출력
 */

public class Review_day05 {
    public static void main(String[] args){

        int stockPrice = 50000;
        int quantity = 3;
        int totalPrice = calculate(stockPrice, quantity);

        System.out.println("총 매수금액: " + totalPrice + "원");
    }

    public static int calculate(int stockPrice, int quantity){
        return stockPrice * quantity;
    }
}
