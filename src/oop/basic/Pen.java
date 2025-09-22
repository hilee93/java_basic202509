package oop.basic;

// 객체 설계용 클래스에는 메인 함수를 작성하지 않습니다.
public class Pen {

    // 객체의 속성을 표현 -> 필드(멤버변수)라고 부릅니다.
    int price;
    String color;
    String penNo;

    // 객체의 기능을 표현한 함수 -> 메서드 라고 부릅니다.
    // 함수는 동작을 실행하고 실행 결과값을 돌려 줄 수 있는 기능이 있습니다.
    // 함수 이름 앞에 돌려주는 값의 타입을 작성하는데, 돌려줄 값이 없다면 void
    void write() {
        System.out.println(color + "색 글을 씁니다.");
    }

    void penInfo() {
        System.out.println("제품 번호: " + penNo);
        System.out.println(color + "색 펜의 가격은 " + price + "원 입니다.");
    }
}
