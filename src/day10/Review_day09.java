package day10;

/*
    날짜: 2026-11-27 금요일
    주제: Day 09 복습 - 생성자, 캡슐화, Getter, Setter

    [개념]
    - 생성자: 객체 생성 시 필드를 초기화
    - private: 클래스 외부에서 필드에 직접 접근하는 것을 제한
    - this: 현재 객체 자신을 참조
    - Getter: 객체 내부의 필드값을 조회
    - Setter: 객체 내부의 필드값을 변경

    [주의사항]
    - private 필드는 외부 클래스에서 직접 접근할 수 없음
    - 생성자 호출 시 매개변수의 자료형과 순서에 맞게 인자를 전달
    - Setter를 통해 변경된 값은 이후 Getter 호출 시 반영됨
    - private만으로 잘못된 데이터의 저장을 방지할 수 없음
 */

public class Review_day09 {
    public static void main(String[] args){

        // 생성자를 호출하여 객체의 필드 초기화
        Stock stock = new Stock("삼성전자", 70000, 80000, 10);

        // Getter를 통해 private 필드의 값을 조회
        System.out.println("종목명: " + stock.getName());
        System.out.println("매수가: " + stock.getBuyPrice() + "원");
        System.out.println("현재가: " + stock.getCurrentPrice() + "원");
        System.out.println("보유 수량: " + stock.getQuantity() + "주");
        System.out.println();

        // Setter를 통해 객체 내부의 현재가 변경
        stock.setCurrentPrice(85000);

        int totalBuyPrice = stock.getBuyPrice() * stock.getQuantity();
        int totalCurrentPrice = stock.getCurrentPrice() * stock.getQuantity();
        
        // Setter로 변경된 현재가를 기준으로 평가손익 계산
        int profit = totalCurrentPrice - totalBuyPrice;

        System.out.println("변경된 현재가: " + stock.getCurrentPrice() + "원");
        System.out.println("총 매수금액: " + totalBuyPrice + "원");
        System.out.println("총 평가금액: " + totalCurrentPrice + "원");
        System.out.println("평가손익: " + profit + "원");
    }
}
