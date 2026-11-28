package day11;

/*
    날짜: 2026-11-28 토요일
    주제: 생성자 오버로딩 및 유효성 검증 복습

    [개념]
    - 생성자: 객체 생성 시 필드를 초기화하는 특수한 구조
    - 생성자 오버로딩: 매개변수의 개수 또는 타입이 다른 생성자를 정의
    - 유효성 검증: 잘못된 데이터의 저장을 방지
    - 캡슐화: 객체의 내부 데이터를 보호하고 접근을 제어

    [주의사항]
    - 생성자에서 Setter를 호출하여 유효성 검증 로직 재사용
    - 예수금은 0원도 정상적인 값이므로 >= 0 조건 사용
    - 유효성 검증 실패 시 기존 필드값 유지
    - int 타입의 인스턴스 변수는 기본값 0으로 초기화
 */

import day10.StockAccount;

public class Account {

    private int accountNumber;
    private int balance;

    Account(int accountNumber, int balance){

        this.accountNumber = accountNumber;
        //this.balance = balance;

        // Setter를 호출하여 유효성 검증 후 예수금 저장
        setBalance(balance);
    }

    Account(int accountNumber){

        this.accountNumber = accountNumber;
        // 예수금을 전달받지 않으므로 int 필드의 기본값 0 유지
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        // 0 이상의 예수금만 저장
        // 음수 입력 시 기존 필드값 유지
        if (balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("에수금은 음수가 될 수 없습니다.");
        }
    }




}
