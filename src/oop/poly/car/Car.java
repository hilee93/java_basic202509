package oop.poly.car;

import java.util.UUID;

public class Car {

    // 범용 고유 식별자
    private UUID carId;

    public Car() {
        // 랜덤한 36자리의 식별자가 생성되어 carId에 저장됩니다.
        this.carId = UUID.randomUUID();
    }
    public void run() {
        System.out.println("자동차가 달립니다~!");
    }
}
