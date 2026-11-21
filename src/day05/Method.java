package day05;

/*
    날짜: 2026-11-21 토요일
    주제: 메서드 선언과 활용

    [개념]
    - 메서드: 특정 기능을 묶어 필요할 때 호출하여 재사용
    - 매개변수: 메서드가 호출될 때 전달받는 값을 저장
    - void: 반환값이 없음 / int: 정수값을 반환
    - return: 값을 호출한 곳으로 돌려주고 메서드 종료
    - return과 println은 다름: 값 반환 / 화면 출력
    - 반환값은 변수에 저장하거나 다른 메서드에 전달 가능

    [주의사항]
    - void 메서드에서는 return으로 값을 반환할 수 없다
    - 반환 자료형이 int라면 정수값을 반환해야 한다
    - 메서드 호출 시 인자의 개수와 자료형을 맞춰야 한다
    - return은 값을 반환할 뿐 화면에 출력하지 않는다
    - 메서드의 반환값을 사용하려면 변수에 저장하거나 다른 곳에 전달해야 한다
    - 선언한 변수를 사용하려면 숫자를 직접 입력하지 않고 해당 변수를 전달한다
 */
public class Method {
    public static void main(String[] args){

        int total = calculate(10000, 3);

        int total1 = calculate(10000, 3);
        int total2 = calculate(5000, 4);
        int total3 = calculate(20000, 2);

        int balance = 100000;
        int stockPrice = 15000;
        int quantity = 4;
        int totalPrice = calculate(stockPrice, quantity);

        System.out.println("총 매수금액: " + total + "원");

        System.out.println("1회 매수금액: " + total1 + "원");
        System.out.println("2회 매수금액: " + total2 + "원");
        System.out.println("3회 매수금액: " + total3 + "원");
        System.out.println("총 매수 금액: " + (total1 + total2 + total3) + "원");

        System.out.println("총 매수금액: " + totalPrice + "원");
        System.out.println("남은 예산: " + calculateBalance(balance, totalPrice) + "원");
    }

    public static int calculate(int stockPrice, int quantity){
        return stockPrice * quantity;
    }

    public static int calculateBalance(int balance, int totalPrice){
        return balance - totalPrice;
    }
}
