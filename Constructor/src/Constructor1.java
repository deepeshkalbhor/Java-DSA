class Student{
    private int rollNo;
    private String name;

    Student(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Student stu = new Student(13,"Deepesh");
        System.out.println(stu.getName());
        System.out.println(stu.getRollNo());
        System.out.println(stu.getName());
    }
}