public class Smartphone {

    String brand;
    int phoneNumber;

    public Smartphone() {
        this.brand = brand;
        this.phoneNumber = phoneNumber;

    }

    public void makeCall(String numberToCall){
        System.out.println("Make call to " + numberToCall);
    }

    public void sendText(String numberToSend, String message){
        System.out.println("Send the text " + message + " to " + numberToSend);
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.makeCall("302937402");
        phone.sendText("854859475", "Hello!!!");

    }
}
