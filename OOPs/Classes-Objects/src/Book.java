public class Book {

    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void displayDetails(){
        System.out.println("Book details: " + this.title + " by " + this.author);
    }

    public static void main(String[] args) {
        Book book = new Book("Bhagwat Geeta","Shri Krishna" );

        book.displayDetails();
    }
}

