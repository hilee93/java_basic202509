package basic.loop;

public class WhileExample {
    public static void main(String[] args) {
        // 반복문의 필수 3요소 (begin - end - step)
        int i = 1; // begin

        while (i <= 10) { // end
            System.out.println("안녕하세요!");
            i++; // step
        }

        // for (begin; end; step)
        for (int j = 1; j <= 10; j++) {
            System.out.println("안녕하세요!");
        }

        System.out.println("==========================================");

        // 특정 값이 소수인지, 소수가 아닌지 판별하는 문제.
        int num = 23;
        int k = 1;
        int count = 0; // 나누어 떨어진 횟수를 세 줄 변수

        while (k <= num) {
            if (num % k == 0) {
                count++;
            }
            k++;
        }

        if (count == 2) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
