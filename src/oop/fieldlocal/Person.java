package oop.fieldlocal;

public class Person {
    String name; // field
    int age; // field

    // 매개 변수(Parameter) -> 메서드를 호출할 때 전달해야 하는 값.
    String hello(String country) {
        int i = 30; // 지역 변수
        System.out.println("i의 값: " + i);
        System.out.println(name + "이(가) 인사를 합니다.");
        if(country.equals("한국")) {
            return "안녕하세요!";
        } else if (country.equals("미국")) {
            return "hello~!";
        } else if (country.equals("일본")) {
            return "곤니찌와~~";
        } else {
            // 리턴 타입을 String이라고 작성했으면
            // 어떤 상황에서도 이 메서드는 문자열을 리턴해야 합니다.
            return "그 나라 인사는 모르겠는데요...";
        }
    }
}
