/*
Interface can be implemented using the
implements keyword.
*/

/*
We cannot create the the object of interface because
it is incomplete but we can create the reference
type of the interace
 */
interface Calculator2{

    default void add(){
        System.out.println("Interface method add");
    }

    default void mul(){
        System.out.println("Interface method mul");
    }

}

class MyCalc2 implements Calculator2{

    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public void mul(int a, int b){
        int c = a * b;
        System.out.println(c);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        MyCalc2 cl = new MyCalc2();
        cl.add();                //this will execute method present in interface because of zero parameters
        cl.add(2,4);
        cl.mul(3,3);
    }
}
