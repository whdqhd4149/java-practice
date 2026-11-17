package day01;

/*
    날짜 : 2026-11-17 화요일
    주제 : 자료형(Data Types)

    [핵심 개념]
    1. int : 정수 저장(약 -21억 ~ +21억)
    2. long : int보다 큰 범위의 정수 저장
    3. double : 소수점이 있는 숫자 저장
    4. boolean : true 또는 false 저장
    5. String : 문자열 저장(큰따옴표 사용)

    [주의할 점]
    int 범위를 초과하는 정수 리터럴에는 L을 붙인다
    String은 기본 자료형이 아닌 참조 자료형이다
 */

public class DataTypes {
    public static void main(String[] args){

        // int : 정수형, 약 -21억 ~ +21억
        int price = 70000;

        // long : int보다 큰 범위의 정수, 큰 정수 리터럴에는 L 사용
        long totalMoney = 5000000000L;

        // double : 소수점이 있는 숫자
        double profitRate = 12.5;

        // boolean : 참(true) 또는 거짓(false)
        boolean canBuy = true;

        // String : 문자열, 큰따옴표 사용
        String stockName = "Samsung";

        System.out.println(price);
        System.out.println(totalMoney);
        System.out.println(profitRate);
        System.out.println(canBuy);
        System.out.println(stockName);

    }
}
