public class Product {
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void applyDiscounts(double percentage){
        double discountedPrice = price - (percentage * (price/100.00));
        System.out.println("The discounted price is : " + discountedPrice);
    }

    public static void main(String[] args) {
        Product discountedPrice = new Product("Parle G", 50);

        discountedPrice.applyDiscounts(20);
    }
}

