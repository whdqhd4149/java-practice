package day04;

/*
    날짜: 2026-11-1-20 금요일
    주제: day03 복숩 - if 조건문과 for 반복문
 */
public class Review_day03 {
    public static void main(String[] args){

        int balance = 100000;
        int stockPrice = 23000;
        int maxQuantity = 10;

        int buyQuantity = 0; // 결고를 기억할 변수

        for (int i = 1; i <= maxQuantity; i++){ // 수량검사

            if (balance >= (i * stockPrice)){ // 구매 가능한가?

                buyQuantity = i; // 가능하면 수량 기억

                System.out.println(i + "주 매수 가능 : " + i * stockPrice);

            }
        }
        // 반복문 종료 후 최종 결과 출력
        System.out.println("매수 가능 수량: " + buyQuantity);
        System.out.println("금액: " + (buyQuantity * stockPrice));
    }
}
