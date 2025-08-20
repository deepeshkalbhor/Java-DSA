public class Circle {

    double radius;

    public Circle(){
        this.radius = radius;
    }

    public void calculateCircumference(double radius) {
        double circumference = (2 * Math.PI * radius);
        System.out.println("Circumference is " + circumference);
    }

    public static void main(String[] args) {
        Circle circumference = new Circle();

        circumference.calculateCircumference(20.00);
    }
}
