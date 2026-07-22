package services;

public class EngineeringGraphics implements ICourse {
    @Override
    public boolean registerCourse() {
        System.out.println("Enrolled to Engineering Graphics course");
        return true;
    }
}
