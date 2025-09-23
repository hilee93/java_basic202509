package oop.enum_;

public class Main {
    public static void main(String[] args) {
        Developer kim = new Developer();

        kim.setName("김춘식");
        kim.setCareer(3);
        kim.setLang(Language.JAVA);

        Developer park = new Developer();

        park.setName("박영희");
        park.setCareer(5);
        park.setLang(Language.JAVASCRIPT);

        System.out.println("춘식과 영희는 같은 언어를 쓰는가?: " + (kim.getLang() == park.getLang()));
        System.out.println("kim의 주력 언어: " + kim.getLang().getName());
        System.out.println("park의 언어는 컴파일 언어인가?: " + park.getLang().isCompileLang());

        System.out.println("============================================================");

        // values(): 열거형 타입에 존재하는 모든 상수를 배열에 담아 린턴
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value);
        }

        // ordinal(): 열거형 타입에 열거되어 있는 순서를 정수로 리턴 (zero-based)
        System.out.println(park.getLang().ordinal());

        // valueOf("str"): 매개값으로 전달된 문자열과 일치하는 요소를 리턴, 만약 일치하는 상수 없다면 에러.
        Language cpp = Language.valueOf("CPP");
        System.out.println(cpp.getName());
    }
}
