package day02;
/*
    날짜: 2026-11-18 수요일
    주제: 주식 매수 가능 여부 판단

    학습 목표
    1. 총 매수금액 계산
    2. 시장 개장 여부 확인
    3. 잔액 부족 여부 확인
    4. 매수 후 잔액 계산
 */

public class StockPurchase {
    public static void main(String[] args){

        // 주식 및 계좌 정보
        String stockName = "Samsung";
        int stockPrice = 35000;
        int quantity = 5;
        int balance = 200000;
        boolean isMarketOpen = true;

        // 1. 총 매수금액 계산
        int totalPrice = stockPrice * quantity;

        System.out.println("종목명: " + stockName);
        System.out.println("총 매수금액: " + totalPrice + "원");

        // 2. 매수 가능 여부 판단
        /*
            1. if : 시장이 닫혀 있으면 매수 불가능
            2. else if : 시장은 열려 있지만 잔액이 부족하면 매수 불가능
            3. else : 위 조건에 해당하지 않으면 매수 가능

            [조건문 핵심]
            if / else if / else는 위에서부터 조건을 검사한다.
            처음 true가 된 분기의 중괄호 {} 안에 있는 코드만 실행한다.
            else는 앞의 모든 조건이 false일 때 실행된다.
            조건문 밖에 작성한 코드는 조건문이 끝난 후 실행된다.
         */
        if(!isMarketOpen){
            System.out.println("시장이 닫혀 있습니다.");
        } else if(balance < totalPrice) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("매수 가능합니다.");

            // 매수가 가능할 때만 잔액을 계산하고 출력
            int remainingBalance = balance - totalPrice;
            System.out.println("매수 후 잔액: " + remainingBalance + "원");
        }
    }
}
