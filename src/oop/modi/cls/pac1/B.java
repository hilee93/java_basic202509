package oop.modi.cls.pac1;

// public 제한자는 접근 제한이 없는 형태 (어디에서나 접근이 가능)
public class B {
    // 클래스 A의 접근 제한이 default
    // 같은 패키지까지는 정보를 얻을 수 있음.
    A a = new A();
}
