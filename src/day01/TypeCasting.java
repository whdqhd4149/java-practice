package day01;

/*
    날짜 : 2026-11-17 화요일
    주제 : 형변환(Type Casting)

    [핵심 개념]
    1. 형변환은 자료형을 다른 자료형으로 변환하는 것이다
    2. 자동 형변환 : int -> double처럼 자동으로 변환되는 경우
    3. 강제 형변환 : (int)처럼 변환할 자료형을 직접 지정

    [주의할 점]
    double을 int로 변환하면 소수점 이하가 버려진다
    강제 형변환 시 데이터 손실이 발생할 수 있다
 */

public class TypeCasting {
    public static void main(String[] args){

        // 자동 형변황 : int -> double
        int price = 85000;

        // 자동 형변환 : int -> double
        // 정수 85000이 실수 85000.0으로 변환
        double doublePrice = price; // 결과: 85000.0

        // double 자료형에 소수점이 있는 값 저장
        double profit = 12500.75;

        // 강제 형변환 : double -> int
        // (int)를 사용하여 소수점 이하 .75를 버림
        int intProfit = (int)profit; // 결과 : 12500

        System.out.println(doublePrice);
        System.out.println(intProfit);
    }
}
