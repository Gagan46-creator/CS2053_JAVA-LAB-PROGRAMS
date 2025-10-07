class Vehicle {
    String brand;
    int speed;

    
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

 
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int fuelCapacity;

    
    Car(String brand, int speed, int fuelCapacity) {
        super(brand, speed);  // Calls Vehicle constructor
        this.fuelCapacity = fuelCapacity;
    }

   
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}


class ElectricCar extends Car {
    int batteryCapacity;

  
    ElectricCar(String brand, int speed, int fuelCapacity, int batteryCapacity) {
        super(brand, speed, fuelCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    
    @Override
    void displayInfo() {
        super.displayInfo(); // Call Car class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Type: Electric Vehicle");
    }
}


public class ElectricCarDemo {
    public static void main(String[] args) {
        ElectricCar ecar = new ElectricCar("Tesla", 220, 0, 100);
        System.out.println("--- Vehicle Information ---");
        ecar.displayInfo();
    }
}
