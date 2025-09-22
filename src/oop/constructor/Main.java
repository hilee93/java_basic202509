package oop.constructor;

public class Main {
    public static void main(String[] args) {
        Phone basic = new Phone();
        basic.showSpec();

        System.out.println("===========================================================");

        Phone galaxy = new Phone("갤럭시s25");
        galaxy.showSpec();

        System.out.println("===========================================================");

        Phone iphone = new Phone("아이폰 17프로", "미드나잇 그레이");
        iphone.showSpec();

    }
}
