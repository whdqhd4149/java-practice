package day11;

/*
    날짜: 2026-11-28 토요일
    주제: 주식 계좌 및 저축 계좌 상속 실습

    [개념]
    - 부모 클래스의 공통 기능을 여러 자식 클래스에서 재사용
    - 자식 클래스별 고유 필드 및 메서드 정의
    - printf(): 지정된 형식에 따라 데이터를 출력하는 메서드

    [주의사항]
    - 객체 생성 시 생성자의 매개변수 개수와 타입 일치
    - 부모 클래스의 유효성 검증 로직도 재사용 가능
    - %.0f는 실수를 소수점 없이 반올림하여 출력
    - %n은 줄바꿈을 의미
    - printf()는 출력 형식만 변경하며 실제 계산값은 변경하지 않음
 */

public class StockManagement {
    public static void main(String[] args){

        // 주식 계좌 객체 생성
        StockAccount stockAccount1 = new StockAccount(1001, 5000000, "삼성전자");
        StockAccount stockAccount2 = new StockAccount(1002, 3000000, "SK하이닉스");

        // 저축 계좌 객체 생성
        SavingsAccount savingsAccount = new SavingsAccount(2001, 10000000, 3.5);

        System.out.println("계좌번호: " + stockAccount1.getAccountNumber());
        System.out.println("예수금: " + stockAccount1.getBalance() + "원");
        System.out.println("종목명: " + stockAccount1.getStockName());
        System.out.println();
        System.out.println("계좌번호: " + stockAccount2.getAccountNumber());
        System.out.println("예수금: " + stockAccount2.getBalance() + "원");
        System.out.println("종목명: " + stockAccount2.getStockName());
        System.out.println();
        System.out.println("계좌번호: " + savingsAccount.getAccountNumber());
        System.out.println("잔액: " + savingsAccount.getBalance() + "원");
        System.out.println("이자율: " + savingsAccount.getInterestRate() + "%");

        // 부동소수점 오차가 표시되지 않도록 소수점 없이 반올림하여 출력
        // 실제 계산값은 변경되지 않음
        System.out.printf("연간 이자금액: %.0f원%n", + savingsAccount.calculateInterest());

    }
}
