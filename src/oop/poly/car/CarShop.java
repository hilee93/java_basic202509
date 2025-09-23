package oop.poly.car;

/*
    Mammals
       |
     Person
       |
    Student

    Mammals m = new Student();
    m instanceof Person -> true
 */


public class CarShop {
    public void carPrice(Car c) {
        if (c instanceof Sonata) {
            System.out.println("쏘나타의 가격은 3000만원 입니다.");
        } else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격은 7000만원 입니다.");
        } else {
            System.out.println("포르쉐의 가격은 1.5억원 입니다.");
        }
    }
}
