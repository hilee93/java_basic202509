package etc.inner;

public class Car {
    private int fuel; // 자동차의 연료량
    private static int establishedYear = 1985;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    // 주유 기능
    public void refuel(int amount) {
        this.fuel += amount;
        System.out.println("주유 후 현재 연료: " + fuel);
    }

    // 인스턴스 내부 클래스 (Car 객체의 상태와 긴밀하게 연결되어 있는 부품)
    public class Engine {
        public void start() {
            System.out.println(">> 엔진을 켭니다. (인스턴스 내부 클래스)");
            // 바깥쪽 클래스의 private 필드에 자유롭게 접근 가능!
            if ( fuel > 0 ) {
                System.out.println("시동이 걸렸습니다. 부르릉~");
                fuel -= 5;
            } else {
                System.out.println("연료가 부족합니다. 시동 실패!");
            }
        }
    }

    // 정적 내부 클래스 (Static Inner Class)
    // Car와 논리적으로는 관련 있지만, 특정 Car 객체에 종속되지 않는 독립적인 정보 묶음.
    public static class TireSpec {
        public void printInfo() {
            System.out.println(">> 타이어 스펙을 확인합니다. (정적 내부 클래스)");

            // static 멤버는 사용 가능.
            System.out.println("이 자동차 브랜드는 " + establishedYear + "년에 설립되었습니다.");

            // static 클래스는 바깥의 멤버를 참조할 수 없습니다.
//            System.out.println("현재 연료: " + fuel);

        }
    }

    // 지역 내부 클래스 (Local Inner Class)
    // 일회용 도우미 (drive가 호출되면 그 때에만 로직을 처리하는 용도의 클래스를 만들고 싶다.)
    public void drive(int distance) {
        System.out.println(">> " + distance + "km 주행을 시작합니다.");

        // 메서드 안엥서만 정의되고 사용하는 클래스
        class TripLogger {
            private String tripName;

            public TripLogger(String tripName) {
                this.tripName = tripName;
            }

            public void log() {
                System.out.println(tripName + " 여행 기록(지역 내부 클래스): 총 " + distance + "km");
                System.out.println("연료량: " + fuel);
            }
        }

        // drive 메서드 안에서만 생성하고 사용이 가능!
        TripLogger logger = new TripLogger("부산");
        logger.log();
    }
}
