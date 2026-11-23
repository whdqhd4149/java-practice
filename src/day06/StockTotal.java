package day06;

/*
    날짜: 2026-11-23 월요일
    주제: 배열과 for문을 활용한 주식 가격 합계 계산

    [개념]
    - 배열: 같은 자료형의 여러 데이터를 하나의 이름으로 관리
    - for문: 조건이 참인 동안 코드를 반복 실행
    - length: 배열의 전체 요소 개수
    - 누적 합계: 기존 합계에 새로운 값을 계속 더하는 방식

    [주의사항]
    - 배열 인덱스는 0부터 시작
    - 반복 조건은 i < prices.length로 설정
    - total은 반복문 실행 전에 0으로 초기화
    - 전체 합계 출력은 반복문 종료 후 실행
 */

public class StockTotal {
    public static void main(String[] args){

        int prices [] = {50000, 70000, 100000};
        int total = 0;

        for (int i = 0; i < prices.length; i++){
            total += prices[i];
            System.out.println("주식 가격: " + prices[i] + "원");

        }

        System.out.println("전체 주식 가격 합계: " + total + "원");
    }
}
