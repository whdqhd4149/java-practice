package day04;

/*
    날짜: 2026-11-20 금요일
    주제: switch문과 while문 응용

    [개념]
    - while문은 조건이 true인 동안 코드를 반복 실행하는 반복문
    - switch문은 하나의 값을 기준으로 실행할 코드를 선택하는 조건문
    - break는 가장 가까운 반복문 또는 switch문을 종료하는 제어문
    - 중첩 구조는 하나의 제어문 안에 다른 제어문이 포함된 구조

    [주의사항]
    - switch문 안의 break는 바깥쪽 while문을 종료하지 않음
    - while문의 조건이 계속 true이면 무한 반복이 발생할 수 있음
    - 반복문을 종료하려면 조건이 false가 되도록 제어해야 함
    - switch문의 case에 break가 없으면 다음 case까지 실행될 수 있음
 */
public class StockMenu {
    public static void main(String[] args){

        int menu = 3;
        int count = 0;

        while (count < 3){
            count++;
            switch (menu){
                case 1:
                    System.out.println("주식 매수");
                    break;
                case 2:
                    System.out.println("주식 매도");
                    break;
                case 3:
                    System.out.println("보유 주식 조회");
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}
