package etc.api.lang.string;

public class StrTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        /*
        String str = "a";
        for (int i = 0; i < 500000; i++) {
            str += "a";
        }
        */


        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }


        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end - start) * 0.001 + "초");

        long result = Math.round(3.14159265);
        System.out.println("result = " + result);

    }
}
