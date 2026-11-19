package day03;

/*
    날짜: 2026-11-19 목요일
    주제: day02 복습 및 요구사항을 보고 직접 코드 짜보기
 */

public class Review_day02 {
    public static void main(String[] args){

        int balance = 150000;
        int stockPrice = 35000;
        int quantity = 4;

        int totalPrice = stockPrice * quantity;

        if(totalPrice <= balance){
            System.out.println("매수 가능");
            System.out.println("총 매수금액 : " + totalPrice);
        } else {
            System.out.println("잔액 부족");
        }
    }
}
