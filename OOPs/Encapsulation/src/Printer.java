/*
Design a Printer class. It should manage the following private states: tonerLevel (int, from 0 to 100) and pagesInTray (int).

Create a constructor to set the initial tonerLevel and pagesInTray.

Provide public getter methods for both fields.

Create a public addToner(int amount) method that increases the toner level but does not allow it to exceed 100.

Create a public addPaper(int sheets) method that increases the number of pages in the tray but does not allow it to exceed a maximum of 500.

Create a public print(int pagesToPrint) method. This method should check if there is enough toner (1 unit of toner per page) and enough paper. If both conditions are met, it should decrease the tonerLevel and pagesInTray accordingly and print a success message. Otherwise, it should print an error message.
 */

public class Printer {
    private int tonerLevel;
    private int pagesInTray;

    public Printer(int tonerLevel, int pagesInTray){
        this.tonerLevel = tonerLevel;
        this.pagesInTray = pagesInTray;
    }

    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public int getPagesInTray(){
        return this.pagesInTray;
    }

    public void addToner(int amount){
        this.tonerLevel += amount;
        if(this.tonerLevel > 100){
            System.out.println("Toner level is aboove 100");
        }
        else
        {
            System.out.println("Toner level is: " + this.tonerLevel);
        }
    }

    public void addPaper(int sheets){
        this.pagesInTray += sheets;
        if(this.pagesInTray > 100){
            System.out.println("Pages in the tray is above 500");
        }
        else
        {
            System.out.println("Pages in tray is: " + this.pagesInTray);
        }
    }

    public  void print(int pagesToPrint){
        if(this.tonerLevel != pagesToPrint){
            pagesToPrint = this.tonerLevel;
            System.out.println("Success");
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer(100,500);

        printer.print(500);
    }
}
