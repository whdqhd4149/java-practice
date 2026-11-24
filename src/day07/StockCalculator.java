package day07;

/*
    날짜: 2026-11-24
    주제: Java 기초 문법 통합 실습

    [개념]
    - 매개변수: 메서드 호출 시 전달되는 값을 받는 변수
    - 인자: 메서드 호출 시 실제로 전달하는 값
    - 메서드 재사용: 하나의 메서드를 여러 곳에서 호출하여 사용
    - 스코프: 변수를 사용할 수 있는 유효 범위

    추가 실습
    - 정수 나눗셈: int / int 연산 시 소수점 이하 버림
    - 형변환: 자료형을 다른 자료형으로 변환
    - 최댓값,최솟값: 반복 비교를 통해 가장 크거나 작은 값 저장
    - OR(||): 두 조건 중 하나라도 참이면 참

    [주의사항]
    - 인자와 매개변수의 이름은 같을 필요가 없음
    - 인자와 배개변수의 개수, 순서, 자료형 호환 여부 확인
    - 배열 전체와 배열 요소의 자료형을 구분
    - 누적 변수는 반복문 밖에서 선언 및 초기화

    추가 실습
    - double 변수에 저장하더라도 정수 나눗셈은 소수점 이하가 버려짐
    - 실수 나눗셈을 하려면 연산 전에 형변환
    - 전체 수익률은 금액 누적이 완료된 후 계산
    - 최댓값.최솟값 비교 시 첫 번째 값을 최초 비교 기준으로 설정
    - 모든 값이 음수 또는 양수인 경우 초기값 0에 주의

    [실습]
    - 종목별 매수금액 및 평가금액 계산
    - 메서드 재사용을 통한 중복 코드 제거
    - 평가손익에 따른 수익, 보합, 손실 구분
    - 전체 매수금액, 평가금액, 평가손익 누적

    추가 실습
    - 종목별 수익률 계산
    - 메서드 재사용을 통한 전체 수익률 계산
    - 반복문과 조건문을 활용한 최고 수익률 종목 찾기
 */

public class StockCalculator {
    public static void main(String[] args){

        int [] buyPrices = {50000, 70000, 100000};
        int [] currentPrices = {60000, 65000, 110000};
        int [] quantities  = {3, 2, 5};
        int totalBuyAmount = 0;
        int totalMarketValue = 0;
        int totalProfitLoss = 0;

        // 추가 실습
        double maxReturnRate = 0;
        int maxStockNumber = 0;



        for (int i = 0; i < buyPrices.length; i++){

            int buyAmount = calculator(buyPrices[i], quantities[i]);
            int marketValue = calculator(currentPrices[i], quantities[i]);
            int profitLoss = marketValue - buyAmount;
            // double returnRate = ((double) profitLoss / buyAmount) * 100;
            double returnRate = calculateReturnRate(profitLoss, buyAmount);


            totalBuyAmount += buyAmount;
            totalMarketValue += marketValue;
            totalProfitLoss += profitLoss;

            System.out.println(i+1 + "번 종목");
            System.out.println("매수금액: " + buyAmount + "원");
            System.out.println("평가금액: " + marketValue + "원");
            System.out.println("평가손익: " + profitLoss + "원");
            System.out.println("수익률: " + returnRate + "%");

            if(profitLoss > 0){
                System.out.println("상태: 수익");
            } else if (profitLoss == 0) {
                System.out.println("상태: 보합(손익없음)");
            } else {
                System.out.println("상태: 손실");
            }

            // 추가 실습
            // 첫 번째 종목을 최초 비교 기준으로 저장
            // 이후 더 높은 수익률이 발견되면 기존 값 갱신
            if (i == 0 || returnRate > maxReturnRate){
                maxReturnRate = returnRate;
                maxStockNumber = i + 1;
            }
        }
        System.out.println("전체 매수금액: " + totalBuyAmount + "원");
        System.out.println("전체 평가금액: " + totalMarketValue + "원");
        System.out.println("전체 평가손익: " + totalProfitLoss + "원");

        // 추가 실습
        System.out.println("전체 수익률: " + calculateReturnRate(totalProfitLoss, totalBuyAmount) + "%");
        System.out.println("최고 수익률 종목: " + maxStockNumber + "번 종목");
        System.out.println("최고 수익률: " + maxReturnRate + "%");
    }

    public static int calculator(int price, int quantity){
        return price * quantity;
    }

    // 정수 나눗셈을 방지하기 위해 연산 전에 double로 형변환
    public static double calculateReturnRate(int profitLoss, int buyAmount){
        return  ((double) profitLoss / buyAmount) * 100;
    }
}
