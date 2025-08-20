public class Student {
    int studentId;
    String name;

    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }

    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.studentId);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ashlesha", 121);
        student1.displayDetails();

        Student student2 = new Student("Aditya", 143);
        student2.displayDetails();

        Student student3 = new Student("Aayush", 483);
        student3.displayDetails();
    }
}
