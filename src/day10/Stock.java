package day10;

/*
    날짜: 2026-11-27 금요일
    주제: 생성자 오버로딩 및 캡슐화

    [개념]
    - 생성자 오버로딩: 매개변수의 개수, 자료형, 순서를 다르게 하여 여러 생성자를 정의하는 것
    - this(): 같은 클래스 내부의 다른 생성자를 호출
    - 유효성 검증: 데이터가 정해진 조건에 적합한지 확인

    [주의사항]
    - 매개변수의 이름만 다른 경우 오버로딩 불가능
    - Java 17/21에서 this()는 생성자의 첫 번째 실행문에 작성
    - Setter에서 저장을 거부하면 기존 필드값이 유지됨
    - 생성자에도 유효성 검증이 필요함
 */

public class Stock {

    private String name;
    private int buyPrice;
    private int currentPrice;
    private int quantity;

    Stock(String name, int buyPrice, int currentPrice, int quantity){

        this.name = name;
        this.buyPrice = buyPrice;
        //this.currentPrice = currentPrice;

        // Setter를 호출하여 초기화 시에도 유효성 검증 적용
        setCurrentPrice(currentPrice);
        this.quantity = quantity;
    }

    Stock(String name, int currentPrice){
//        this.name = name;
//        this.buyPrice = 0;
//        this.currentPrice = currentPrice;
//        this.quantity = 0;

        // 기존 생성자를 호출하여 초기화 코드 중복 방지
        this(name, 0, currentPrice,0);
    }


    public String getName() {
        return name;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        if (currentPrice > 0){
            this.currentPrice = currentPrice;
        } else {
            // 유효성 검증 실패 시 기존 현재가 유지
            System.out.println("현재가는 0보다 커야 합니다.");
        }

    }

    public int getQuantity() {
        return quantity;
    }
}
