package day10;

/*
    날짜: 2026-11-27 금요일
    주제: 생성자 오버로딩 및 주식 현재가 검증 실습

    [개념]
    - 전달하는 인자에 따라 호출되는 생성자가 결정됨
    - Setter를 통해 데이터 변경 과정 통제
    - int 타입 인스턴스 변수의 기본값은 0

    [주의사항]
    - 0도 하나의 인자로 취급됨
    - 유효성 검증 실패 시 기존 필드값이 유지됨
    - 현재 검증 방식은 잘못된 객체의 생성 자체를 막지는 못함
 */

public class ConstructorPractice {
    public static void main(String[] args){

        // 인자 4개를 전달하여 보유 종목 생성
        Stock stock1 = new Stock("삼성전자", 70000, 80000, 10);
        // 인자 2개를 전달하여 관심 종목 생성
        Stock stock2 = new Stock("SK하이닉스", 150000);
        // 음수인 현재가의 초기화가 거부되어 기본값 0 유지
        Stock stock3 = new Stock("현대자동차", 200000, -250000, 5);

        System.out.println("종목명: " + stock1.getName());
        System.out.println("매수가: " + stock1.getBuyPrice() + "원");
        System.out.println("현재가: " + stock1.getCurrentPrice() + "원");
        System.out.println("보유 수량: " + stock1.getQuantity() + "주");
        System.out.println();
        stock1.setCurrentPrice(85000);
        System.out.println("변경된 현재가: " + stock1.getCurrentPrice() + "원");
        System.out.println();
        stock1.setCurrentPrice(-50000);
        System.out.println("현재가: " + stock1.getCurrentPrice() + "원");
        System.out.println();
        stock1.setCurrentPrice(0);
        System.out.println("현재가: " + stock1.getCurrentPrice() + "원");
        System.out.println();
        System.out.println("종목명: " + stock2.getName());
        System.out.println("매수가: " + stock2.getBuyPrice() + "원");
        System.out.println("현재가: " + stock2.getCurrentPrice() + "원");
        System.out.println("보유 수량: " + stock2.getQuantity() + "주");
        System.out.println();
        System.out.println("종목명: " + stock3.getName());
        System.out.println("매수가: " + stock3.getBuyPrice() + "원");
        System.out.println("현재가: " + stock3.getCurrentPrice() + "원");
        System.out.println("보유 수량: " + stock3.getQuantity() + "주");
    }
}
