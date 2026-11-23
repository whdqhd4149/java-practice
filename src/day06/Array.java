package day06;

/*
    날짜: 2026-11-23 월요일
    주제: 배열(Array) 기초

    [개념]
    - 배열: 같은 자료형의 여러 데이터를 하나의 이름으로 관리하는 자료구조
    - 인덱스: 배열 요소의 위치를 나타내는 번호
    - length: 배열의 길이를 나타내는 속성

    [주의사항]
    - 배열의 인덱스는 0부터 시작
    - 배열의 마지막 인덱스는 length - 1
    - 배열 범위를 벗어나 접근하면 오류 발생
 */

public class Array {
    public static void main(String[] args){

        int [] prices = {50000, 70000, 100000};

        System.out.println("첫 번째 주식 가격: " + prices[0]);
        System.out.println("세 번째 주식 가격: " + prices[2]);
        System.out.println("전체 종목 수: " + prices.length);

        prices[1] = 90000;
        System.out.println("변경된 두 번째 주식 가격: " + prices[1] + "원");
        System.out.println("두 종목 가격 합계: " + (prices[0] + prices[1]) + "원");




    }
}
