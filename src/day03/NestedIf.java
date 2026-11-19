package day03;

/*
    날짜: 2026-11-19 목요일
    주제: 중첨 if문(Nested If)

    [개념]
    - if문 내부에 또 다른 if문을 작성하는 조건문
    - 첫 번째 조건이 참일 때 내부 조건을 추가로 검사
    - 여러 조건을 단계적으로 확인할 때 사용

    [주의사항]
    - 바깥쪽 if문이 false이면 내부 if문은 실행되지 않음
    - 내부 else와 외부 else는 각각 연결된 if문이 다름
    - 중괄호 { }를 사용하여 조건문의 범위를 구분
 */

public class NestedIf {
    public static void main(String[] args){

        int balance = 200000;
        int stockPrice = 45000;
        int quantity = 3;

        int totalPrice = stockPrice * quantity;
        
        if(balance >= totalPrice){
            
            if(quantity > 0){
                System.out.println("매수 가능");
                System.out.println("총 매수 금액: " + totalPrice);
            } else {
                System.out.println("수량 오류");
            }
        } else {
            System.out.println("잔액 부족");
        }
    }
}
