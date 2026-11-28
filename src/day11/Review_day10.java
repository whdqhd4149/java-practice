package day11;

/*
    날짜: 2026-11-28 토요일
    주제: 생성자 오버로딩 및 유효성 검증 테스트

    [개념]
    - 전달하는 인자에 따라 해당 생성자 호출
    - Getter를 통한 객체 내부 데이터 조회

    [주의사항]
    - 생성자 내부의 메서드는 객체 생성 시 즉시 실행
    - 입력값과 실제 저장된 값은 다를 수 있음
    - 출력문을 통해 의도한 초기화 및 유효성 검증 결과 확인
 */

public class Review_day10 {
    public static void main(String[] args){

        // 정상적인 예수금 입력
        Account account1 = new Account(1001, 5000000);

        // 음수 입력으로 유효성 검증 실패, 기본값 0 유지
        Account account2 = new Account(1002, -3000000);

        // 생성자 오버로딩을 통한 계좌 생성, 예수금 0원
        Account account3 = new Account(1003);

        // Getter를 통해 각 계좌에 실제 저장된 데이터 확인
        System.out.println("계좌번호: " + account1.getAccountNumber());
        System.out.println("예수금: " + account1.getBalance() + "원");
        System.out.println();
        System.out.println("계좌번호: " + account2.getAccountNumber());
        System.out.println("예수금: " + account2.getBalance() + "원");
        System.out.println();
        System.out.println("계좌번호: " + account3.getAccountNumber());
        System.out.println("예수금: " + account3.getBalance() + "원");

    }
}
