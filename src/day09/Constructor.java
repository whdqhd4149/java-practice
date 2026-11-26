package day09;

/*
    날짜: 2026-11-26 목요일
    주제: 생성자를 활용한 객체 생성 및 캡슐화

    [개념]
    - 생성자: 객체 생성 시 필드의 초기값을 설정
    - Getter: 객체 내부의 필드값을 반환하는 메서드
    - Setter: 객체 내부의 필드값을 변경하는 메서드

    [주의사항]
    - 생성자에 정의된 매개변수의 개수, 자료형, 순서를 맞춰야 한다
    - 참조변수와 생성자의 이름을 혼동하지 않는다
    - private 필드는 외부 클래스에서 직접 접근할 수 없다
    - void 메서드는 반환값이 없으므로 출력문에서 사용할 수 없다
    - Setter로 값을 변경한 후 Getter로 변경된 값을 조회한다
 */

public class Constructor {
    public static void main(String[] args) {

        // 동일한 생성자를 호출하여 서로 독립적인 객체 생성
        Person person1 = new Person("철수", 30);
        Person person2 = new Person("영희", 25);

        // Getter를 호출하여 private 필드의 값을 조회
        System.out.println("이름: " + person1.getName());
        System.out.println("나이: " + person1.getAge() + "세");
        System.out.println();
        System.out.println("이름: " + person2.getName());
        System.out.println("나이: " + person2.getAge() + "세");

        // Setter를 호출하여 객체 내부의 age 값을 변경
        // 반환 타입이 void이므로 출력문과 분리하여 실행
        person1.setAge(31);

        System.out.println();

        // Getter를 호출하여 변경된 필드값을 조회 및 출력
        System.out.println("변경된 철수의 나이: " + person1.getAge() + "세");
        }
}
