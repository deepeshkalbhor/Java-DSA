package main;

import services.EngineeringGraphics;

public class LaunchSpring {
    public static void main(String[] args) {

        CodingClasses cc = new CodingClasses();
        cc.setCourse(new EngineeringGraphics());

        if(true){
            System.out.println("Registered Successfully !!");
        }
        else{
            System.out.println("Not registered :(");
        }

    }
}
