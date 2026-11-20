package day04;

/*
    날짜: 2026-11-20 금요일
    주제: Switch 조건문

    [개념]
    - 하나의 값을 기준으로 실행할 코드를 선택하는 조건문
    - switch는 변수의 값을 검사
    - case는 일치하는 값부터 코드 실행
    - break는 switch문을 즉시 종료
    - default는 일치하는 case가 없을 때 실행 시작

    [주의사항]
    - break가 없으면 다음 case의 코드까지 계속 실행됨
    - 다음 case의 값은 다시 비교하지 않음
    - default도 break 없이 실행이 이어질 수 있음
 */

public class Switch {
    public static void main(String[] args){

        int menu = 3;

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
