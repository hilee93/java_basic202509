package oop.inter;

// '조종 가능한' 자격증
// 이 자격증을 따려면 아래에 명시한 모든 기능들을 반드시 만들어야 한다. (약속)
public interface Controllable extends Parent {
    // 인터페이스에 변수를 선언하면 상수(static final)로 인식한다.
    int NUM = 5;

//    public Controllable(); {
    // 인터페이스는 생성자를 가질 수 없어요. -> 객체화 될 수 없는 개념.
//}

    // 인터페이스는 메서드를 선언하면 추상 메서드로 지정됩니다.
    void turnOn();
    void turnOff();
    void moveForward();
    void moveBackward();
}
