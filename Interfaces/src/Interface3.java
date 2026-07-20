/*
A class can implement multiple interfaces at the same time
 */

interface Cal1{
    default void add(){
        System.out.println("Cal1 interface method call");
    }
}

interface Cal2{
    default void mul(){
        System.out.println("Cal2 interface method call");
    }
}

class MyCal3 implements Cal1, Cal2{
    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public void mul(int a, int b){
        int c = a * b;
        System.out.println(c);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        MyCal3 cl = new MyCal3();
        cl.add(2,4);
        cl.mul(3,3);
        cl.add();
    }
}
