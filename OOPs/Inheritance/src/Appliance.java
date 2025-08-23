public class Appliance {
    private String brand;

    public Appliance(String brand){
        this.brand = brand;
        System.out.println("Appliance constructor called.");
    }
}

class Refrigerator extends Appliance{
    private int volume;

    public Refrigerator(String brand, int  volume){
        super(brand);
        System.out.println("Refrigerator constructor called");
    }

    public static void main(String[] args) {
        Appliance myAppliance = new Refrigerator("Washing Machine", 10);
    }
}
