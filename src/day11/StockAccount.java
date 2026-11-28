package day11;

/*
    날짜: 2026-11-28 토요일
    주제: 상속 및 부모 클래스 생성자 호출

    [개념]
    - 상속: 기존 클래스의 기능을 재사용하고 확장하는 객체지향 개념
    - extends: 부모 클래스를 상속받기 위한 키워드
    - super(): 부모 클래스의 생성자를 호출
    - this: 현재 객체를 참조하는 키워드

    [주의사항]
    - 부모 클래스의 private 필드는 자식 클래스에서도 직접 접근 불가
    - 부모 클래스의 생성자는 상속되지 않음
    - super() 호출 시 부모 생성자의 매개변수 개수와 타입 일치
    - 상속받은 메서드는 중복 작성할 필요 없음
 */

// Account 클래스의 기능을 상속받아 재사용
public class StockAccount extends Account{

    private String stockName;

    StockAccount(int accountNumber, int balance, String stockName){

        // 부모 생성자를 호출하여 계좌번호와 예수금 초기화
        // 부모 클래스의 유효성 검증 로직도 실행
        super(accountNumber, balance);

        // 자식 클래스의 고유 필드 초기화
        this.stockName = stockName;
    }

    public String getStockName() {
        return stockName;
    }
}
