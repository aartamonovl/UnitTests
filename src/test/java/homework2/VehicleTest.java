package homework2;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    void testCar(){
        Car car = new Car("Lada", "Priora", 2017);

        assertTrue(car instanceof Vehicle,"The object is not instance of Vehicle");

        assertEquals(4, car.getNumWheels(),"Error number Wheels");

        car.testDrive();
        assertEquals(60, car.getSpeed(),"Error of speed in testDrive()");

        car.park();
        assertEquals(0, car.getSpeed(),"Error of speed in park()");
    }

    @Test
    public void testMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2020);

        //проверка класса
        assertTrue(motorcycle instanceof Vehicle,"The object is not instance of Vehicle");

        //проверка количества колес
        assertEquals(2, motorcycle.getNumWheels(),"Error number Wheels");

        //проверка движения
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(),"Error of speed in testDrive()");

        //проверка парковки
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(),"Error of speed in park()");
    }
}
