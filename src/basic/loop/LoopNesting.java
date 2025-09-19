package basic.loop;

public class LoopNesting {
    public static void main(String[] args) {
        int total = 0; // 소수의 개수를 세 줄 변수.
        // 30 ~ 100 사이의 소수가 몇 개 있는지 세봐! (for)
        for (int i = 30; i <= 100; i++) {
            int count = 0; // i가 바뀔 때 마다 숫자를 새로 세야 하기 때문에 여기다 선언!
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                total++;
            }
        }
        System.out.println("total = " + total);

    }
}
