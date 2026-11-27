package day10;

/*
    날짜: 2026-11-27 금요일
    주제: 주식 계좌 클래스 설계 및 데이터 보호

    [개념]
    - 캡슐화: 객체 내부의 데이터 접근 및 변경을 제어
    - 생성자 오버로딩을 통한 다양한 초기화 방식 제공
    - this()를 통한 생성자 초기화 로직 재사용
    - Setter 호출을 통한 유효성 검증 로직 재사용

    [주의사항]
    - 예수금은 0 이상이어야 함
    - 생성자에서 직접 값을 저장하면 Setter의 검증을 거치지 않음
    - 유효성 검증 실패 시 새로운 값은 저장되지 않음
 */

public class StockAccount {

    private String accountNumber;
    private String ownerName;
    private int balance;

    StockAccount(String accountNumber, String ownerName, int balance){

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        //this.balance = balance;

        // 객체 생성 시에도 Setter의 유효성 검증 로직 재사용
        setBalance(balance);
    }

    StockAccount(String accountNumber, String ownerName){

        // 초기 예수금을 0원으로 설정하여 기존 생성자 호출
        this(accountNumber, ownerName, 0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        // 예수금은 0원을 허용하므로 >= 0 조건 사용
        if(balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("에수금은 음수가 될 수 없습니다.");
        }
    }
}
