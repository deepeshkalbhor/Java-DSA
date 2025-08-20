public class Rectangle {
    int width;
    int height;

    public Rectangle(){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(int height, int width){
        int area = height*width;
        System.out.println("Area of rectangle is : " + area);
    }

    public void calculatePerimeter(int height, int width) {
        int perimeter = 2 * (height * width);
        System.out.println("Area of rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle area = new Rectangle();

        area.calculateArea(2,4);

        Rectangle perimeter = new Rectangle();

        perimeter.calculatePerimeter(4,6);
    }
}
