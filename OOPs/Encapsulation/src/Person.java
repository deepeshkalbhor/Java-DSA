/*
Create a class named Person. This class should have two private fields: name (String) and age (int).

Create a constructor that accepts name and age to initialize the object.

Provide a public getter method for the name.

Provide a public getter method for the age.

Provide a public setter method for the age that includes validation. The age should only be updated if the new value is greater than 0 and less than 120.


 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String name(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age > 0 && age <120){
            this.age = age;
            System.out.println("Age updated to " + this.age);
        }
        else{
            System.out.println("Invalid value. Please enter it again carefully!");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Deepesh", 23);

        person.setAge(24);
    }
}