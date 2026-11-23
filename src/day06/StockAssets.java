package day06;

/*
    날짜: 2026-11-23 월요일
    주제: 배열을 활용한 주식 보유자산 계산

    [개념]
    - 배열: 같은 자료형의 여러 데이터를 하나의 이름으로 관리
    - Scope(유효 범위): 변수를 사용할 수 있는 코드의 범위
    - Scope(유효 범위): 변수를 선언한 위치에 따라 사용할 수 있는 범위가 달라짐
    - 누적 합계: 반복문에서 계산한 값을 변수에 계속 더하는 방식

    [주의사항]
    - totalAssets는 for문 밖에서 선언하여 누적값 유지
    - asset은 for문 안에서 선언하여 반복할 때마다 계산
    - 누적 계산은 for문 안에서, 최종 출력은 밖에서 실행
    - for문 안에서 선언한 변수는 for문 밖에서 사용 불가
 */

public class StockAssets {
    public static void main(String[] args){

        int prices [] = {50000, 70000, 100000};
        int quantity [] = {3, 2, 5};
        int totalAssets = 0; // 1. for문 밖에서 선언. 누적값 유지, 그리고 for문 안과 밖에서 사용 가능

        for (int i = 0; i < prices.length; i++){

            int asset = prices[i] * quantity[i]; // for문 안에서 선언 -> for문 밖에서는 사용 불가
            System.out.println(i+1 + "번 종목 평가금액: " + asset + "원");

            totalAssets += asset; // 2. 반복문 안에서 누적
        }
            System.out.println("전체 보유자산: " + totalAssets + "원"); // 3. 반복문 밖에서 출력
    }
}
