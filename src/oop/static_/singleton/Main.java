package oop.static_.singleton;

import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        // new Singleton(); (x)
        Singleton s1 = Singleton.getInstance();
        s1.method1();
        s1.method2();

        // Singleton.s = null; (x)
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
