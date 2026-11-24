package day07;

/*
    날짜: 2026-11-24 화요일
    주제: 배열 복습
 */

public class Review_day06 {
    public static void main(String[] args){

        int prices [] = {50000, 70000, 100000};
        int totalPrice = 0;

        for (int i = 0; i < prices.length; i++){

            System.out.println(i+1 + "번 종목: " + prices[i] + "원");

            totalPrice += prices[i];
        }
        System.out.println("합계: " + totalPrice + "원");
    }
}
