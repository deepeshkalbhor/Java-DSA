/*
Methods inside interfaces are
specialized with default keyword
as well as they are public and abstract in nature
*/

interface Calculate1{
    default void add(int a, int b){
    }

    default void mul(int a, int b){
    }
}

class MyCal implements Calculate1{
    public void add(int a, int b){
        int c = a + b;
    }

    public void mul(int a, int b){
        int c = a * b;
    }

}

public class Interface1 {
    public static void main(String[] args) {

    }
}