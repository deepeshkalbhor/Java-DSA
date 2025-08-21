/*
Create a Car class that models a simple car. It should have the following private fields: make (String), model (String), and speed (int).

Create a constructor to initialize the make and model. The initial speed should be 0.

Provide public getter methods for all three fields.

Create a public accelerate(int amount) method that increases the speed, but not beyond a maximum of 200.

Create a public brake(int amount) method that decreases the speed, but not below 0.
 */
public class Car {
    private String make;
    private String model;
    private int speed = 0;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public void getMake(){
        System.out.println("Maker is: " + this.make);
    }

    public void getModel() {
        System.out.println("Model is: " + this.model);
    }

    public void getSpeed() {
        System.out.println("Speed of car is: " + speed);
    }

    public void acceleration(int amount) {
        speed += amount;
        if (speed > 200) {
            System.out.println("Exceeded speed limit. Slow down the vehicle");
        } else {
            System.out.println("Speed is: " + speed);
        }
    }

        public void brake(int amount){
            speed -= amount;
            if(speed < 0){
                System.out.println("Speed: 0. Accelerate to move the vehicle");
            }
            else{
                System.out.println("Press brake");
            }
        }


    public static void main(String[] args) {
        Car car = new Car("BMW", "M4 Compeition");

        car.getSpeed();
        car.getMake();
        car.getModel();
        car.acceleration(220);
        car.brake(100);
    }
}

