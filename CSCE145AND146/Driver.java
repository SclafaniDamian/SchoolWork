// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Driver {
    private Scanner scanner;
    private String[] options = new String[39];

    public Driver() {
        scanner = new Scanner(System.in);
        options[0] = "Quit";
        options[1] = "Choose Your Own Adventure";
        options[2] = "Payroll";
        options[3] = "Rock Paper Scissors";
        options[4] = "Apple";
        options[5] = "Word Sorter //NEEDS FIXED!!!";
        options[6] = "Book";
        options[7] = "Decision Game";
        options[8] = "Drivers License Eligibility";
        options[9] = "Even Or Not";
        options[10] = "Outdoor Exercise";
        options[11] = "Positive Or Not";
        options[12] = "Sports";
        options[13] = "String Methods";
        options[14] = "User Input";
        options[15] = "Video Game Database";
        options[16] = "Fleet of Vehicles";
        options[17] = "Vector";
        options[18] = "Taco";
        options[19] = "Species";
        options[20] = "Showcase Showdown //NEEDS FIXED";
        options[21] = "Products";
        options[22] = "Pick A Card";
        options[23] = "Pets";
        options[24] = "Fun With Variables";
        options[25] = "Double Double Linked List";
        options[26] = "Dimension Converter";
        options[27] = "CSCE Exam Question 1";
        options[28] = "CSCE Exam Question 2";
        options[29] = "CSCE Exam Question 3";
        options[30] = "Box";
        options[31] = "Bubble Sorter";
        options[32] = "Coffee";
        options[33] = "Concert";
        options[34] = "CSCE146 Exam Question 1";
        options[35] = "CSCE146 Exam Question 2";
        options[36] = "CSCE146 Exam Question 3";
        options[37] = "Ships";
        options[38] = "LinkedBST";
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
                case 2:
                    Payroll payroll = new Payroll();
                    payroll.checkPayroll();
                    break;
                case 3:
                    RockPaperScissors RPS = new RockPaperScissors();
                    RPS.RPS();
                    break;
                case 4:
                    AppleTester aTest = new AppleTester();
                    aTest.testApple();
                    break;
                case 5:
                    WordSorterFrontEnd wsfe = new WordSorterFrontEnd();
                    wsfe.frontEnd();
                    break;
                case 6:
                    BookDemo bDem = new BookDemo();
                    bDem.bDemo();
                    break;
                case 7:
                    DecisionGame decision = new DecisionGame();
                    decision.game();
                    break;
                case 8:
                    DriversLicenseEligibility DLE = new DriversLicenseEligibility();
                    DLE.dle();
                    break;
                case 9:
                    EvenOrNot EoN = new EvenOrNot();
                    EoN.evenornot();
                    break;
                case 10:
                    OutdoorExercise outdoor = new OutdoorExercise();
                    outdoor.outdoors();
                    break;
                case 11:
                    PositiveOrNot pos = new PositiveOrNot();
                    pos.PosOrNot();
                    break;
                case 12:
                    Sports sports = new Sports();
                    sports.sport();
                    break;
                case 13:
                    StringMethods stringMethod = new StringMethods();
                    stringMethod.stringMethod();
                    break;
                case 14:
                    UserInput userInp = new UserInput();
                    userInp.userinp();
                    break;
                case 15:
                    VideoGameFrontEnd videoGame = new VideoGameFrontEnd();
                    videoGame.videogame();
                    break;
                case 16:
                    FleetOfVehicles.fleetMain();
                    break;
                case 17:
                    VectorMain vector = new VectorMain();
                    vector.VectorMainMethod();
                    break;
                case 18:
                    TacoDemo taco = new TacoDemo();
                    taco.TacoDemoMain();
                    break;
                case 19:
                    SpeciesDemo species = new SpeciesDemo();
                    species.SpeciesDemoMain();
                    break;
                case 20:
                    ShowdownMain showdown = new ShowdownMain();
                    showdown.ShowdownMainMain();
                    break;
                case 21:
                    ProductsDemo products = new ProductsDemo();
                    products.ProductsDemoMain();
                    break;
                case 22:
                    PickACardFE deck = new PickACardFE();
                    deck.PickACardFEMain();
                    break;
                case 23:
                    PetDemo pets = new PetDemo();
                    pets.PetDemoMain();
                    break;
                case 24:
                    FunWithVariables variablesFun = new FunWithVariables();
                    variablesFun.FunWithVariablesMain();
                    break;
                case 25:
                    DoubleLinkedListTester doubledoublelinkedlist = new DoubleLinkedListTester();
                    doubledoublelinkedlist.DoubleLinkedListTesterMain();
                    break;
                case 26:
                    DimensionDemo dimension = new DimensionDemo();
                    dimension.DimensionDemoMain();
                    break;
                case 27:
                    Question01.Question01Main();
                    break;
                case 28:
                    Question02.Question02Main();
                    break;
                case 29:
                    Question03.Question03Main();
                    break;
                case 30:
                    BoxSorter boxsorter = new BoxSorter();
                    boxsorter.BoxSorterMain();
                    break;
                case 31:
                    BubbleSorterComplete bubbsort = new BubbleSorterComplete();
                    bubbsort.BubbleSorterCompleteMain();
                    break;
                case 32:
                    CoffeeTester coffee = new CoffeeTester();
                    coffee.CoffeeTesterMain();
                    break;
                case 33:
                    ConcertPromoter concert = new ConcertPromoter();
                    concert.ConcertPromoterMain();
                    break;
                case 34:
                    CSCE146Question01 csce146question01 = new CSCE146Question01();
                    csce146question01.CSCE146Question01Main();
                    break;
                case 35:
                    CSCE146Question02 csce146question02 = new CSCE146Question02();
                    csce146question02.CSCE146Question02Main();
                    break;
                case 36:
                    CSCE146Question03 csce146question03 = new CSCE146Question03();
                    csce146question03.CSCE146Question03Main();
                    break;
                case 37:
                    ShipNavigator ships = new ShipNavigator();
                    ships.ShipNavigatorMain();
                    break;
                case 38:
                    Tester linkedBST = new Tester();
                    linkedBST.TesterLinkedBSTMain();
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
