package day11;

/*
    날짜: 2026-11-28 토요일
    주제: 상속받은 메서드를 활용한 이자금액 계산

    [개념]
    - 상속: 부모 클래스의 기능을 재사용하고 새로운 기능을 확장
    - 인스턴스 변수: 객체별로 데이터를 저장하는 변수
    - 지역 변수: 선언된 블록 내부에서만 사용하는 변수
    - 반환값: 메서드 실행 결과를 호출한 곳으로 전달
    - 부동소수점 오차: 실수를 이진수로 표현할 때 발생하는 근사값 오차

    [주의사항]
    - 부모의 private 필드는 Getter를 통해 접근
    - 이자율과 이자금액은 서로 다른 변수로 관리
    - 계산 결과를 기존 필드에 저장하면 원본 데이터가 변경됨
    - 외부에서 전달받을 값이 없다면 매개변수 선언 불필요
    - double 타입은 실수 계산 시 미세한 오차가 발생할 수 있음
 */

public class SavingsAccount extends Account{

    private double interestRate;

    SavingsAccount(int accountNumber, int balance, double interestRate){

        // 부모 생성자를 호출하여 공통 필드 초기화
        super(accountNumber, balance);

        // 자식 클래스의 고유 필드 초기화
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest(){

        // 기존 이자율을 보존하기 위한 지역 변수 선언
        double interest;

        // 부모 클래스의 Getter를 활용하여 연간 이자금액 계산
        interest = getBalance() * (interestRate / 100);

        // 기존 필드를 변경하지 않고 계산 결과만 반환
            return interest;
    }

}
