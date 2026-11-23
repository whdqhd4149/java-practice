package day06;

/*
    날짜: 2026-11-23 월요일
    주제: 배열을 활용한 주식 최고가 및 최저가 계산

    [개념]
    - 배열: 같은 자료형의 여러 데이터를 하나의 이름으로 관리
    - for문: 배열의 요소를 순서대로 반복하여 확인
    - if문: 조건을 비교하여 참일 때 코드 실행
    - max/min: 비교 결과에 따라 최고가와 최저가 갱신

    [주의사항]
    - i는 인덱스, prices[i]는 실제 주식 가격
    - max는 더 큰 값, min은 더 작은 값일 때 갱신
    - 반복문 안에서 값을 비교하고, 밖에서 최종 결과 출력
 */

public class StockMinMax {
    public static void main(String[] args){

        int prices [] = {50000, 70000, 30000, 90000, 60000};
        int max = prices[0];
        int min = prices[0];

        for (int i = 0; i < prices.length; i++){

            if (prices[i] > max){
                max = prices[i];
            }
            if (prices[i] < min){
                min = prices[i];
            }
        }
        System.out.println("최고 주식 가격: " + max + "원");
        System.out.println("최저 주식 가격: " + min + "원");
    }
}
