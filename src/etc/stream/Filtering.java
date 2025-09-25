package etc.stream;

import oop.static_.utils.PrintUtil;

import static etc.stream.Menu.*;
import java.util.*;

public class Filtering {
    public static void main(String[] args) {
        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = MENU_LIST.stream().filter(Dish::isVegetarian).toList();

        dishList.forEach(System.out::println);

//        for (Dish dish : dishList ) {
//            System.out.println(dish);
//        }

        PrintUtil.printLine();

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리를 필터링 해서 출력
        MENU_LIST.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT
                        && d.getCalories() < 600)
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();

        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링 해서 출력해줘.
        MENU_LIST.stream()
                .filter(d -> d.getName().length() == 4)
                .toList()
                .forEach(System.out::println);


        PrintUtil.printLine();

        // 칼로리가 300칼로리보다 큰 요리중에 앞에 3개만 가져와
        Menu.MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) // 최대 3개
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();

        // 300칼로리보다 높은 요리 중 처음 2개 제끼고 필터링
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 두개 제외
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6, 7, 7, 8, 8, 7, 9, 1, 3);

        // 리스트에서 짝수만 필터링 (중복은 제거해서)
        numbers.stream()
                .filter( number -> number % 2 == 0)
                .distinct()
                .toList()
                .forEach(System.out::println);

    }
}
