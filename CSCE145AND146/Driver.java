// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Driver {
    private Scanner scanner;
    private String[] options = new String[2];

    public Driver() {
        scanner = new Scanner(System.in);
        options[0] = "Quit";
        options[1] = "Choose Your Own Adventure";
    }

    public void runDriver() {
        System.out.print("Welcome to the CSCE145 and CSCE146 Driver");
        boolean quit = false;
        while(!quit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Goodbye!");
                    quit = true;
                    break;
                case 1:
                    chooseAdventure CYO = new chooseAdventure();
                    CYO.CYOAdventure();
                    break;
            }
        }
    }

    public void displayMenu() {
        System.out.println("What Would You Like To Do?");
        for (int i = 0; i < options.length; i++) {
            System.out.println("(" + i + ") " + options[i]);
        }
    }
    
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.runDriver();
    }
}
