package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{

    // protected는 다른 패키지의 접근을 허용하지 않음. (default랑 비슷)
    // 상속관계가 있다면 부분적으로 생성자 내부 접근을 허용.

    C() {
        this.m1();
//        this.m2(); -> default
        this.f1 = 10;
//        this.f2 = 20; -> default
    }
    void test() {
        A a = new A();

//        a.f1 = 10;
//        a.f2 = 20;

//        a.m1();

    }
}
