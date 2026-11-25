package day08;

/*
    날짜: 2026-11-25 수요일
    주제: 객체 생성 및 필드 접근

    [개념]
    - new: 새로운 객체를 생성하는 키워드
    - 참조 변수: 객체의 참조값을 저장하는 변수
    - 참조값: 객체를 가리키는 값

    [추가 실습]
    - 객체의 필드를 활용한 총 매수금액 계산
    - 종목별 평가금액 및 수익률 계산
    - 전체 종목의 평가금액 합산

    [주의사항]
    - Java는 클래스 이름의 대소문자를 구분함
    - 각각 new로 생성한 객체는 독립적임
    - 참조값을 복사하면 동일한 객체를 공유함
    - 동일한 객체를 공유하면 필드 변경이 양쪽에 반영됨
    - 객체의 필드 값이 변경되어도 이미 계산하여 다른 변수에 저장한 값은 자동으로 갱신되지 않음

    [추가 주의사항]
    - 객체 생성 후 값을 넣지 않은 int 필드의 기본값은 0
    - 필드에 값을 저장하기 전에 계산하면 잘못된 결과가 나올 수 있음
    - 실수형에서 0을 0으로 나누면 NaN이 발생함
    - 계산에 사용한 필드 값이 변경되면 다시 계산해야 함
 */

public class StockMain {
    public static void main(String[] args){

        // new를 통해 서로 독립적인 객체 생성
        Stock stock1 = new Stock();
        Stock stock2 = new Stock();

        // 점(.) 연산자를 사용하여 객체의 필드에 접근
        stock1.name = "삼성전자";
        stock1.buyPrice = 50000;
        stock1.currentPrice = 45000;
        stock1.quantity = 3;

        stock2.name = "SK하이닉스";
        stock2.buyPrice = 70000;
        stock2.currentPrice = 63000;
        stock2.quantity = 2;

        // 객체의 필드 값을 활용하여 매수금액과 평가금액 계산
        int totalPrice1 = stock1.buyPrice * stock1.quantity;
        int totalValuePrice1 = stock1.currentPrice * stock1.quantity;

        // 정수 나눗셈의 소수점 손실을 방지하기 위해 형변환
        double returnRate1 = (double)(totalValuePrice1 - totalPrice1) / totalPrice1 * 100;

        int totalPrice2 = stock2.buyPrice * stock2.quantity;
        int totalValuePrice2 = stock2.currentPrice * stock2.quantity;
        double returnRate2 = (double)(totalValuePrice2 - totalPrice2) / totalPrice2 * 100;

        int totalValuePrice = (totalValuePrice1 + totalValuePrice2);

        System.out.println("종목명: " + stock1.name);
        System.out.println("매수가: " + stock1.buyPrice + "원");
        System.out.println("현재가: " + stock1.currentPrice + "원");
        System.out.println("보유 수량: " + stock1.quantity + "주");
        System.out.println();
        System.out.println("종목명: " + stock2.name);
        System.out.println("매수가: " + stock2.buyPrice + "원");
        System.out.println("현재가: " + stock2.currentPrice + "원");
        System.out.println("보유 수량: " + stock2.quantity + "주");
        System.out.println();
        System.out.println("종목명: " + stock1.name);
        System.out.println("총 매수금액: " + totalPrice1 + "원");
        System.out.println("평가금액: " + totalValuePrice1 + "원");
        System.out.println("수익률: " + returnRate1 + "%");
        System.out.println();
        System.out.println("종목명: " + stock2.name);
        System.out.println("총 매수금액: " + totalPrice2 + "원");
        System.out.println("평가금액: " + totalValuePrice2 + "원");
        System.out.println("수익률: " + returnRate2 + "%");
        System.out.println();
        System.out.println("전체 평가금액: " + totalValuePrice + "원" );
    }
}
