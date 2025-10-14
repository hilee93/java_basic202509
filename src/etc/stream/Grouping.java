package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        // 채식요리와 아닌 요리로 메뉴를 나눠보자
        // 두 분류로 나누어 줌. (분류 기준을 논리값으로 전달해 주어야 함)
        Map<Boolean, List<Dish>> veggieMenu = Menu.MENU_LIST.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian)); // (Dish::isVegetarian)

        System.out.println("--- 채식 메뉴 ---");
        System.out.println(veggieMenu.get(true));

        System.out.println("--- 일반 메뉴 ---");
        System.out.println(veggieMenu.get(false));
//        System.out.println("veggieMenu = " + veggieMenu);

        PrintUtil.printLine();

        // 요리를 종류(Type)별로 그룹화 해 보자!
        Map<Dish.Type, List<Dish>> menuByType = Menu.MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType)); // ( Dish::getType)

        System.out.println("--- 육류 메뉴 ---");
        System.out.println(menuByType.get(Dish.Type.MEAT));

        PrintUtil.printLine();

        // 종류별로 나눈 메뉴를 칼로리 기준(500 넘으면 고칼로리, 나머지 저칼로리)으로 한번 더 그룹화 해줘!
        Map<Dish.Type, Map<String, List<Dish>>> detailedMenu = Menu.MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType,  // 1차 분류: Type
                        Collectors.groupingBy(d -> {
                            if (d.getCalories() > 500) {
                                return "고칼로리";
                            } else {
                                return "저칼로리";
                            }
                        }) // 2차 분류: 칼로리
                ));

        System.out.println(detailedMenu); // 타입 별로 나눈 후 나뉜 타입에서 고칼로러 저칼로리 나눠짐
        System.out.println(detailedMenu.get(Dish.Type.MEAT)); // 위의 리스트에서 고기만 뽑아서 볼 수 있다.
        PrintUtil.printLine();
        System.out.println(detailedMenu.get(Dish.Type.MEAT).get("고칼로리")); // 위 리스트에서 고기 중 고칼로리만

        PrintUtil.printLine();

        // 종류별 요리 개수
        Map<Dish.Type, Long> dishCount = Menu.MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));// ( Dish::getType)
        System.out.println(dishCount);

        // 종류별 요리 총 칼로리
        Map<Dish.Type, Integer> totalCalByType = Menu.MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));
        System.out.println(totalCalByType);

        PrintUtil.printLine();

        Map<Dish.Type, IntSummaryStatistics> calorieStats = Menu.MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.summarizingInt(Dish::getCalories)));

        // 요리 종류별 통계 꾸러미가 리턴됨 (개수, 평균, 합계, 최댓값, 최솟값)
        System.out.println(calorieStats);
    }
}
