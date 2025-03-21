package praticeAbstract;

//Define the abstract class
abstract class Vehicle {
 // Abstract method (no implementation)
 public abstract void startEngine();

 // Concrete method
 public void stopEngine() {
     System.out.println("Engine stopped.");
 }

 // Another concrete method
 public void fuelUp(int fuelAmount) {
     System.out.println("Fueled up with " + fuelAmount + " liters.");
 }
}

//Define a subclass that extends the abstract class
 class Car extends Vehicle {
 // Implement the abstract method
 @Override
 public void startEngine() {
     System.out.println("Car engine started.");
 }

 // Additional methods specific to Car
 public void openTrunk() {
     System.out.println("Trunk opened.");
 }
}

//Define another subclass that extends the abstract class
 class Motorcycle extends Vehicle {
 // Implement the abstract method
 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine started.");
 }

 // Additional methods specific to Motorcycle
 public void kickStand() {
     System.out.println("Kickstand used.");
 }


//Main class to test the abstract class and its subclasses

 public static void main(String[] args) {
     // Cannot instantiate the abstract class
     // Vehicle vehicle = new Vehicle(); // This will cause a compilation error

     // Instantiate the subclasses
     Car car = new Car();
     car.startEngine();
     car.stopEngine();
     car.fuelUp(50);
     car.openTrunk();

     Motorcycle motorcycle = new Motorcycle();
     motorcycle.startEngine();
     motorcycle.stopEngine();
     motorcycle.fuelUp(15);
     motorcycle.kickStand();
 }
}
