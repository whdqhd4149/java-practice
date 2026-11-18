package day02;

/*
    날짜: 2026-11-18 수요일
    주제: 조건문(if / else if / else)

    조건문이란?
    조건의 참(true), 거짓(false)에 따라 실행할 코드를 결정하는 문법

    if : 조건이 true이면 실행
    else if : 이전 조건이 false이면 새로운 조건을 검사
    else : 앞의 조건들이 모두 false이면 실행

    [주의]
    if ~ else if ~ else는 위에서부터 검사하며, 처음 true가 된 분기만 실행한다
 */

public class IfStatements {
    public static void main(String[] args){

        // if문 기본 예제
        int age = 20;

        if(age >= 19){
            System.out.println("성인입니다.");
        }

        // if / else : 두 가지 경우 구분
        int balance = 100000;
        int totalPrice = 175000;

        if(balance >= totalPrice){
            System.out.println("매수 가능합니다.");
        }else{
            System.out.println("잔액이 부족합니다.");
        }

        // if/ else if/ else :  여러 조건 구분
        int score = 85;

        if(score >= 90){
            System.out.println("A등급");
        } else if(score >= 80){
            System.out.println("B등급");
        } else if(score >= 70){
            System.out.println("C등급");
        } else {
            System.out.println("D등급");
        }

        // 논리 연산자와 조건문 함께 사용
        boolean isMarketOpen = false;
        boolean hasEnoughMoney = true;

        if(!isMarketOpen){
            System.out.println("시장이 닫혀 있습니다.");
        } else if(isMarketOpen && !hasEnoughMoney) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("매수 가능합니다.");
        }



    }
}
