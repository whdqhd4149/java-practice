package day04;

/*
    날짜: 2026-11-20 금요일
    주제: While 반복문

    [개념]
    - 조건이 true인 동안 특정 코드를 반복 실행하는 문법
    - 반복문 실행 전에 조건식을 검사
    - 조건이 false가 되면 반복문 종료
    - 초기화, 조건식, 증감식을 사용하여 반복 제어

    [주의사항]
    - 반복에 사용할 변수는 미리 초기화해야 함
    - 조건이 계속 true이면 무한 반복이 발생할 수 있음
    - 증감식이 실행되면서 변수의 값이 변경됨
    - 조건이 false가 되면 반복문 내부 코드는 실행되지 않음
 */
public class WhileLoop {
    public static void main(String[] args){

        int stockPrice = 20000;
        int quantity = 1;

        while (quantity <= 5){
            System.out.println(quantity + "주 매수금액: " + (quantity * stockPrice));
            quantity++;
        }
    }
}
