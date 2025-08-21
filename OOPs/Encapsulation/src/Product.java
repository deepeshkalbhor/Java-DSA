/*
Create a Product class for an inventory system. It should include these private fields: productId (String), price (double), and stockQuantity (int).

Create a constructor to initialize all the fields.

Provide public getter methods for all fields.

Provide a public setter for price that only allows positive values.

Create a public method sell(int quantity) that decreases the stockQuantity. This method should only execute if the requested quantity is positive and does not exceed the current stockQuantity.

Create a public method restock(int quantity) that increases the stockQuantity. This method should only accept a positive quantity.
 */

public class Product {
    private String productId;
    private double price;
    private int stockQuantitiy;

    public Product(String productId, double price, int stockQuantity){
        this.productId = productId;
        this.price = price;
        this.stockQuantitiy = stockQuantity;
    }

    public void getPrice(){
        System.out.println("The price is " + this.price);
    }

    public void getProductId(){
        System.out.println("The product ID is " + this.productId);
    }

    public void getStockQuantity(){
        System.out.println("The stock quantity is " + this.stockQuantitiy);
    }

    public void setPrice(double amount){
        if(amount > 0){
             this.price = amount;
        }
        else{
            System.out.println("The amount should not be negative or 0");
        }
    }

    public void sell(int quantity){
        if(quantity > 0 && quantity <= this.stockQuantitiy){
            this.stockQuantitiy -= quantity;
            System.out.println("The current stock is : " + this.stockQuantitiy);
        }
        else{
            System.out.println("The quantity should be above 0 and less than the current stock.");
        }
    }

    public void restock(int quantity){
        if(quantity > 0){
            this.stockQuantitiy += quantity;
        }
        else{
            System.out.println("The quantity should be above 0.");
        }
    }

    public static void main(String[] args) {
        Product product = new Product("123A1", 100.00, 20);

        product.getStockQuantity();

        product.sell(20);
    }
}
