import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.assertj.core.api.Assertions.*;

public class VehicleTest {
    Car car = new Car("Honda", "Civic", 2012);
    Motocycle motocycle = new Motocycle("SUzuki", "SV", 1999);

    @Test
        // 1. Проверить, что экземпляр объекта Car также является экземпляром транспортного средства.
    void carIsVehicle() {
        assertEquals(car.getClass().getSuperclass().getName(), Vehicle.class.getName());
//        System.out.println(Vehicle.class.getName());
//        System.out.println(car.getClass().getSuperclass().getName());
    }

    @Test
        // 2. Проверить, что объект Car создается с 4-мя колесами.
    void carHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
        // 3. Проверить, что объект Motorcycle создается с 2-мя колесами.
    void motocycleHasTwoWheels() {
        assertEquals(motocycle.getNumWheels(), 2);
    }

    @Test
        // 4. Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    void carTestDrive() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
        // 5. Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    void motocycleTestDrive() {
        motocycle.testDrive();
        assertEquals(motocycle.getSpeed(), 75);
    }

    @Test
        // 6. Проверить, что в режиме парковки (сначала testDrive, потом park,
        // т.е. эмуляция движения транспорта) машина останавливается (speed = 0)
    void carPark() {
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
        // 7. Проверить, что в режиме парковки (сначала testDrive, потом park,
        // т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    void motocyclePark() {
        motocycle.park();
        assertEquals(motocycle.getSpeed(), 0);
    }


}



