public class LightBulb {
    boolean isOn;

    public LightBulb() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Turning on the light");
    }

    public void turnOff() {
        System.out.println("Turning off the light");
        this.isOn = false;
    }
    public boolean isSwitchedOn() {
        return this.isOn;
    }

    public static void main(String[] args) {
        LightBulb ceilingLight = new LightBulb();
        System.out.println("Is the light on? " + ceilingLight.isSwitchedOn());

        ceilingLight.turnOn();

        System.out.println("Is the light on now? " + ceilingLight.isSwitchedOn());

        ceilingLight.turnOff();

        System.out.println("Is the light on now? " + ceilingLight.isSwitchedOn());
    }
}






