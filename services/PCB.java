package services;

public class PCB implements ICourse{
    @Override
    public boolean registerCourse() {
        System.out.println("Enrolled to PCB course");
        return true;
    }
}
