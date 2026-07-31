public class Car {
    // attributes
    String make = "Toyota";
    String model = "Corolla";
    int year = 2025;
    String color = "Race Red";
    double price = 30000.00;
    void drive() {
    System.out.println("The car is driving.");
    }
    void brake (){
    System.out.println("The car is breaking.");
    }
}
// attributes: make, model, year, color, price
// methods: drive(), break()

public class Main {
    public static void Main(String[] args) {
        Car myCar = new Car();
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);
        System.out.println("Price: $" + myCar.price);
        myCar.drive();
        myCar.brake();
    }
}
// Output:
// Make: Toyota 
