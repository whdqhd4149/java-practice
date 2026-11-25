package day08;

/*
    날짜: 2026-11-25 수요일
    주제: 배열을 활용한 수익률 계산 및 최댓값 찾기

    [개념]
    - 형변환: 자료형을 다른 자료형으로 변환하는 것
    - 최댓값: 여러 데이터 중 가장 큰 값

    [주의사항]
    - 정수끼리 나누면 소수점 이하가 버려짐
    - 수익률은 (현재가 - 매수가) / 매수가 * 100
    - 모든 수익률이 음수일 경우 최댓값을 0으로 초기화하면 정상적인 비교가 이루어지지 않을 수 있음
 */

public class Review_day07 {
    public static void main(String[] args){

        int [] buyPrices = {50000, 70000, 100000};
        int [] currentPrices = {45000, 63000, 95000};

        double maxReturnRate = 0;
        int maxStockNumber = 0;



        for (int i = 0; i < buyPrices.length; i++){

            // 정수 나눗셈으로 인한 소수점 손실을 방지하기 위해 double로 형변환
            double returnRate = (((double)(currentPrices[i] - buyPrices[i])) / buyPrices[i])* 100;

            System.out.println(i+1 + "번 수익률: " + returnRate + "%");

            // 첫 번째 종목의 수익률을 무조건 저장하여 비교 기준으로 설정
            // 이후 기존 최고 수익률보다 높은 경우에만 갱신
            if (i == 0 || returnRate > maxReturnRate){
                maxReturnRate = returnRate;
                maxStockNumber = i + 1;
            }
        }

        System.out.println("최고 수익률: " + maxReturnRate + "%");
        System.out.println("최고 수익률 종목: " + maxStockNumber);

    }
}
