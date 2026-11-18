package day02;

/*
    날짜: 2026-11-18 수요일
    주제: 논리 연산자(Logical Operators)

    논리연산자란?
    여러 조건을 조합하거나 참/거짓을 반대로 바꾸는 연산자

    && : AND (그리고)
         두 조건이 모두 true 일 때 true
    || : OR (또는)
         두 조건 중 하나라도 true이면 true
    !  : NOT(부정)
         true는 false로, false는 true로 변경
 */

public class LogicalOperators {
    public static void main(String[] args){

        // AND 연산자 (&&)
        boolean a = true;
        boolean b = false;

        System.out.println("AND: " + (a && b));

        // OR 연산자 (||)
        System.out.println("OR: " + (a || b));

        // NOT 연산자 (!)
        System.out.println("NOT a: " + (!a));
        System.out.println("NOT b: " + (!b));

        // 주식 매수 조건에 논리 연산자 적용
        int balance = 200000;
        int totalPrice = 175000;
        boolean isMarketOpen = true;

        // 보유 현금이 매수금액 이상인지 비교
        boolean hasEnoughMoney=  balance > totalPrice;

        // 시작이 열려 있고, 돈도 충분해야 매수 가능
        boolean canBuy = isMarketOpen && hasEnoughMoney;

        System.out.println("매수 가능 여부: " + canBuy);

        // OR 연산자 활용
        boolean isWeekend = false;
        boolean isHoliday = true;

        // 주말이거나 공휴일이면 휴장일로 판단하는 단순 예제
        boolean isCloseDay = isWeekend || isHoliday;

        System.out.println("휴장일 여부: " + isCloseDay);

        // NOT 연산자 활용
        // 시장이 열려 있지 않으면 true
        boolean isMarketClosed = !isMarketOpen;

        System.out.println("시장 닫힘 여부: " + isMarketClosed);

    }
}
