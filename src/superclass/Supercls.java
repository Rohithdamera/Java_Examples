package superclass;

 class Supercls {

	 // Fields
    protected String brand;
    protected int year;

    // Constructor
    public Supercls(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println(brand + " " + year + " is starting.");
    }

    // Another method
    public void stop() {
        System.out.println(brand + " " + year + " is stopping.");
    }
}

// Define the Car subclass that extends Vehicle
 class Car extends Supercls {
    // Additional field
    private int doors;

    // Constructor
    public Car(String brand, int year, int doors) {
        super(brand, year); // Call the constructor of the superclass
        this.doors = doors;
    }

    // Method specific to Car
    public void honk() {
        System.out.println(brand + " " + year + " with " + doors + " doors is honking.");
    }
}

// Define the Bike subclass that extends Vehicle
 class Bike extends Supercls {
    // Additional field
    private boolean hasCarrier;

    // Constructor
    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year); // Call the constructor of the superclass
        this.hasCarrier = hasCarrier;
    }

    // Method specific to Bike
    public void ringBell() {
        System.out.println(brand + " " + year + " with carrier: " + hasCarrier + " is ringing the bell.");
    }


// Main class to test the Vehicle, Car, and Bike classes

    public static void main(String[] args) {
        // Create an instance of Car
        Car car = new Car("Toyota", 2020, 4);
        car.start();    // Output: Toyota 2020 is starting.
        car.honk();     // Output: Toyota 2020 with 4 doors is honking.
        car.stop();     // Output: Toyota 2020 is stopping.

        // Create an instance of Bike
        Bike bike = new Bike("Giant", 2021, true);
        bike.start();    // Output: Giant 2021 is starting.
        bike.ringBell(); // Output: Giant 2021 with carrier: true is ringing the bell.
        bike.stop();     // Output: Giant 2021 is stopping.
    }

	}


