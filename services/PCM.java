package services;

public class PCM implements ICourse{
    @Override
    public boolean registerCourse() {
        System.out.println("Enrolled to PCM course");
        return true;
    }
}
