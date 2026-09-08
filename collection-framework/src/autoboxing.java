public class autoboxing {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num; //autboxing integer(primitive type -> wrapper class)

        Integer obj2 = 10;
        int num2 = 10; //unboxing wrapper class -> primitive datatype

        // used in collection framework while storing data
        // data structures like arraylist and hashmap does no work with primitive datatypes
        // so autoboxing is used

    }
}