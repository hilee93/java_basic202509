package etc.stream.comparator;

import oop.static_.utils.PrintUtil;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 15, 79));
        studentList.add(new Student("오로라핑", 18, 98));
        studentList.add(new Student("대길이", 30, 40));
        studentList.add(new Student("춘식이", 7, 20));

        // 리스트를 나이순으로 오름차 정렬 ( 나이 적은 순서)
        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("studentList = " + studentList);

        PrintUtil.printLine();

        // 이름 가나다순 정렬
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("studentList = " + studentList);

        PrintUtil.printLine();

        // 성적 오름차 정렬
        studentList.sort(Comparator.comparing(s -> s.getScore())); // (Student::getScore)

        // 성적 내림차 정렬
        studentList.sort(Comparator.comparing(Student::getScore).reversed()); // (Student::getScore)

        // 이름 오름차 정렬
        studentList.sort(Comparator.comparing(s -> s.getName()));

        studentList.forEach(System.out::println);
    }
}
