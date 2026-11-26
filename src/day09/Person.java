package day09;

/*
    날짜: 2026-11-26 목요일
    주제: 생성자, this, 접근 제어자 및 캡슐화

    [개념]
    - 생성자: 객체 생성 시 초기화를 담당
    - this : 현재 객체 자신을 가리키는 키워드
    - public: 외부 접근을 허용하는 접근 제어자
    - private: 외부의 직접 접근을 제한하는 접근 제어자
    - 캡슐화: 객체 내부 데이터를 보호하고 접근 방식을 제어하는 객체지향 개념
    - Getter: 필드값 조회
    - Setter: 필드값 변경

    [주의사항]
    - 생성자 이름은 클래스 이름과 반드시 동일해야 한다
    - 생성자는 반환 타입을 선언하지 않는다
    - 필드명과 매개변수명이 같으면 this를 사용하여 구분한다
    - Getter는 조회할 필드의 값을 반환해야 한다
    - Setter는 일반적으로 반환 타입을 void로 선언한다
    - 모든 필드에 Getter와 Setter를 만들 필요는 없다
 */

public class Person {

    // 객체의 데이터를 저장하는 필드
    // private을 사용하여 외부의 직접 접근 제한
    private String name;
    private int age;

    // 객체 생성 시 호출되는 생성자
    Person(String name, int age){
        // this.필드명 = 매개변수
        this.name = name;
        this.age = age;
    }

    // Getter: 객체에 저장된 이름 반환
    public String getName() {
        return name;
    }

    // Getter: 객체에 저장되 나이 반환
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Setter: 전달받은 값으로 객체의 나이 변경
    public void setAge(int age) {
        this.age = age;
    }
}
