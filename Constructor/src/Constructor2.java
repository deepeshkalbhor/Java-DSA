class Student2{
    private int rollNo;
    private String name;

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

public class Constructor2 {
    public static void main(String[] args) {
        Student2 stu = new Student2();
        stu.setName("Deepesh");
        stu.setRollNo(13);
        System.out.println(stu.getName());
        System.out.println(stu.getRollNo());
    }
}
