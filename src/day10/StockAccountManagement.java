package day10;

/*
    날짜: 2026-11-27 금요일
    주제: 주식 계좌 관리 종합 실습

    [개념]
    - 생성자 오버로딩을 활용한 계좌 객체 생성
    - Getter를 통한 계좌 정보 조회
    - Setter를 통한 예수금 변경 및 유효성 검증

    [주의사항]
    - 음수 입력 시 기존 예수금 유지
    - 최초 초기화 시 음수가 전달되면 기본값 0 유지
    - 생성자 내부에서 호출한 메서드는 생성자가 종료되기 전에 실행됨
 */

public class StockAccountManagement {
    public static void main(String[] args) {
        StockAccount stockAccount1 = new StockAccount("1001-01", "홍길동", 1000000);
        StockAccount stockAccount2 = new StockAccount("1001-02", "김철수");

        // 생성자 내부에서 유효성 검증이 실행되어 음수 저장 거부
        StockAccount stockAccount3 = new StockAccount("1001-03", "이영희", -500000);

        System.out.println("[계좌 1]");
        System.out.println("계좌번호: " + stockAccount1.getAccountNumber());
        System.out.println("소유자 : " + stockAccount1.getOwnerName());
        System.out.println("예수금 : " + stockAccount1.getBalance() + "원");
        System.out.println();
        System.out.println("[계좌 2]");
        System.out.println("계좌번호: " + stockAccount2.getAccountNumber());
        System.out.println("소유자: " + stockAccount2.getOwnerName());
        System.out.println("예수금: " + stockAccount2.getBalance() + "원");
        System.out.println();

        // 정상적인 예수금 변경
        stockAccount1.setBalance(1500000);
        System.out.println("변경된 예수금: " + stockAccount1.getBalance() + "원");
        System.out.println();

        // 음수 입력으로 변경이 거부되어 기존 예수금 유지
        stockAccount1.setBalance(-500000);
        System.out.println("예수금: " + stockAccount1.getBalance() + "원");
        System.out.println();

        // 예수금은 0원도 허용되므로 정상적으로 변경
        stockAccount1.setBalance(0);
        System.out.println("변경된 예수금: " + stockAccount1.getBalance() + "원");
        System.out.println();
        System.out.println("[계좌 3]");
        System.out.println("계좌번호: " + stockAccount3.getAccountNumber());
        System.out.println("소유자: " + stockAccount3.getOwnerName());
        System.out.println("예수금: " + stockAccount3.getBalance());

    }
}
