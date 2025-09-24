package oop.poly.player;

public class Hunter extends Player {
    String pet;

    public Hunter(String nickname, String pet) {
        super(nickname);
        this.pet = pet;
    }

    /*
    사냥꾼의 고유 기술인 magicArrow()를 완성해 주세요.
    타겟은 단일 타겟이고, 어떤 직업이든 매직 애로우를 맞출 수 있습니다.

    각 직업별로 데미지가 다르게 들어갑니다.
    전사는 10, 마법사는 20, 사냥꾼은 15
    타겟의 직업이 무엇이냐에 따라 각각 다른 데미지를 적용해 주세요.
    %s가 %d의 피해를 입었고, 남은 체력은 얼마다 라는 정보도 출력해 주시고
    Main 클래스에서 메서드를 호출해 보세요.
     */

    public void magicArrow(Player p) {
        int damage = 0;
        String job = "";
        System.out.printf("%s님에게 %s님이 매직애로우를 시전하였습니다.\n",this.nickname, p.nickname);
        if ( p instanceof Warrior ) {
            damage = 10;
            job = "전사";
        } else if ( p instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if ( p instanceof Hunter ) {
            damage = 15;
            job = "궁수";
        } else {
            System.out.println("공격할 대상이 없습니다.\n");
        }
            p.hp -= damage;
            System.out.printf("%s(%s)가 %d의 피해를 입었습니다. 남은 체력: %d\n", p.nickname,job, damage, p.hp);
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("pet = " + pet);
    }
}
