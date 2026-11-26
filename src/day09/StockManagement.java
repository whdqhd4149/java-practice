package day09;

/*
    날짜: 2026-11-26 목요일
    주제: Getter와 Sette를 활용한 주식 정보 관리

    [개념]
    - 생성자를 통한 객체 생성 및 초기화
    - Getter를 통한 객체 내부 데이터 조회
    - Setter를 통한 객체 내부 데이터 변경

    [주의사항]
    - 생성자의 매개변수 개수, 자료형, 순서를 맞춰야 한다
    - 출력 항목에 해당하는 Getter를 호출해야 한다
    - void 메서드는 반환값이 없으므로 출력문과 분리하여 호출한다
    - Setter 호출 이후 Getter를 사용하면 변경된 값을 가져온다
    - 평가손익 계산 시 보유 수량을 반영해야 한다
 */

public class StockManagement {
    public static void main(String[] args){

        // 생성자를 호출하여 서로 독립적인 주식 객체 생성
        StockInfo stockInfo1 = new StockInfo("삼성전자", 70000, 80000, 10);
        StockInfo stockInfo2 = new StockInfo("SK하이닉스", 150000, 140000, 5);

        // Getter를 통해 private 필드의 값을 간접적으로 조회
        System.out.println("종목명: " + stockInfo1.getName());
        System.out.println("매수가: " + stockInfo1.getBuyPrice() + "원");
        System.out.println("현재가: " + stockInfo1.getCurrentPrice() + "원");
        System.out.println("보유 수량: " + stockInfo1.getQuantity() + "주");
        System.out.println();
        System.out.println("종목명: " + stockInfo2.getName());
        System.out.println("매수가: " + stockInfo2.getBuyPrice() + "원");
        System.out.println("현재가: " + stockInfo2.getCurrentPrice() + "원");
        System.out.println("보유 수량: " + stockInfo2.getQuantity() + "주");

        // Setter를 호출하여 삼성전자 객체의 현재가 변경
        // 반환값이 없으므로 출력문과 분리하여 호출
        stockInfo1.setCurrentPrice(85000);
        System.out.println();
        // Getter를 통해 변경됨 현재가 조회
        System.out.println("현재가: " + stockInfo1.getCurrentPrice() + "원");

        // 변경된 현재가를 기준으로 총 평가금액 계산
        System.out.println("총 평가금액: " + stockInfo1.getCurrentPrice() * stockInfo1.getQuantity() + "원");

        // 1주당 손익에 보유 수량을 곱하여 총 평가손익 계산
        System.out.println("평가손익: " + (stockInfo1.getCurrentPrice() - stockInfo1.getBuyPrice()) * stockInfo1.getQuantity() + "원");
    }
}
