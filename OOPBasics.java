// Object-Oriented Programming Basics in Java
public class OOPBasics {

    // A simple class with properties and methods
    String brand;
    String color;
    int speed;

    // Constructor
    OOPBasics(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand + " | Color: " + color + " | Speed: " + speed + " km/h");
    }

    void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated! New speed: " + speed + " km/h");
    }

    void brake(int decrease) {
        speed = Math.max(0, speed - decrease);
        System.out.println(brand + " braked! New speed: " + speed + " km/h");
    }

    public static void main(String args[]) {
        System.out.println("=== OOP Basics - Cars ===\n");

        // Creating objects
        OOPBasics car1 = new OOPBasics("Toyota", "White", 120);
        OOPBasics car2 = new OOPBasics("BMW", "Black", 180);

        // Using methods
        car1.displayInfo();
        car2.displayInfo();

        System.out.println();
        car1.accelerate(30);
        car2.brake(50);
    }
}
