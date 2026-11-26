package day09;

/*
    날짜: 2026-11-26 목요일
    주제: 생성자와 캡슐화를 활용한 주식 객체 설계

    [개념]
    - 생성자: 객체 생성 시 필드의 초기값을 설정
    - this: 현제 객체 자신을 가리키는 키워드
    - 캡슐화: 객체 내부 데이터를 보호하고 접근 방식을 제어
    - Getter: 필드값을 반환하는 메서드
    - Setter: 필드값을 변경하는 메서드

    [주의사항]
    - 생성자 이름은 클캐스 이름과 동일해야 한다
    - private 필드는 외부 클래스에서 직접 접근할 수 없다
    - 필요한 필드에만 setter를 작성한다
 */

public class StockInfo {

    // private을 사용하여 외부의 직접 접근 제한
    private String name; // 종목명
    private int buyPrice; // 매수가
    private int currentPrice; // 현재가
    private int quantity; // 보유 수량

    // 객체 생성 시 종목 정보 초기화
    StockInfo(String name, int buyPrice, int currentPrice, int quantity){
        this.name = name;
        this.buyPrice = buyPrice;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
    }

    // 객체 내부의 필드값 반환
    public String getName() {
        return name;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    // 전달받은 값으로 현재가 변경
    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}

