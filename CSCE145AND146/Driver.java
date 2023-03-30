// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;
/*
 * This set of code is any work I can pull from my freshman year Algorithmic Desing I & II classes.
 * As of working on this, I am a sophomore.
 * These works are all pulled from Eclipse. However, some of them
 * do not read files the same way since I believe they read files
 * differently.
 * In summary, this is a collection of my early works with a UI
 * that allows you to run any assignment from the same program.
 */
public class Driver {
    private Scanner scanner;
    private String[] options = new String[71];

    public Driver() {
        scanner = new Scanner(System.in);
        options[0] = "Quit";
        options[1] = "Choose Your Own Adventure";
        options[2] = "Payroll";
        options[3] = "Rock Paper Scissors";
        options[4] = "Apple";
        options[5] = "Word Sorter (FILE ERROR)";
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
        options[20] = "Showcase Showdown (FILE ERROR))";
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
        options[39] = "Min Heap";
        options[40] = "Max Heap";
        options[41] = "Fun Sorting Example";
        options[42] = "Searching Algorithms";
        options[43] = "Towers of Hanoi";
        options[44] = "SierpinskisCarpet";
        options[45] = "Simple Recursion";
        options[46] = "Robot Commands (FILE ERROR)";
        options[47] = "Triangles Fractals";
        options[48] = "Shapes";
        options[49] = "Process Queue";
        options[50] = "Inheritance";
        options[51] = "Clock";
        options[52] = "Reverse Polish Calculator";
        options[53] = "Draw A Box";
        options[54] = "Even In List";
        options[55] = "Exam Average";
        options[56] = "Guess The Value";
        options[57] = "Matrix Multiplication";
        options[58] = "Selection Sort";
        options[59] = "Calculator";
        options[60] = "Sorting Algorithms";
        options[61] = "Vending Machine";
        options[62] = "Triangle";
        options[63] = "Gas Price";
        options[64] = "Subtracting Matricies";
        options[65] = "Zodiac Symbol";
        options[66] = "Library Points";
        options[67] = "Word Game";
        options[68] = "Diamond Drawer";
        options[69] = "Animal Inheritance";
        options[70] = "Shape Tree (FILE ERROR)";
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
                case 39:
                    MinHeapTester minheap = new MinHeapTester();
                    minheap.MinHeapTesterMain();
                    break;
                case 40:
                    Tester maxheap = new Tester();
                    maxheap.MaxHeapTester();
                    break;
                case 41:
                    FunLittleExample funlittleexample = new FunLittleExample();
                    funlittleexample.FunLittleExampleMain();
                    break;
                case 42:
                    SearchAlgorithms searchalgorithms = new SearchAlgorithms();
                    searchalgorithms.SearchAlgorithmsMain();
                    break;
                case 43:
                    TowersOfHanoi hanoi = new TowersOfHanoi();
                    hanoi.TowersOfHanoiMain();
                    break;
                case 44:
                    SierpinskisCarpet sierpinski = new SierpinskisCarpet();
                    sierpinski.SierpinskisCarpetMain();
                    break;
                case 45:
                    SimpleRecursion simplerecursion = new SimpleRecursion();
                    simplerecursion.SimpleRecursionMain();
                    break;
                case 46:
                    RobotCommandsFE robotcommands = new RobotCommandsFE();
                    robotcommands.RobotCommandsFEMain();
                    break;
                case 47:
                    TrianglesFractals trianglesfractals = new TrianglesFractals();
                    trianglesfractals.TrianglesFractalsMain();
                    break;
                case 48:
                    ShapesDemo shapes = new ShapesDemo();
                    shapes.ShapesDemoMain();
                    break;
                case 49:
                    ProcessSchedulerSimulator processqueue = new ProcessSchedulerSimulator();
                    processqueue.ProcessSchedulerSimulatorMain();
                    break;
                case 50:
                    UgradDemo inheritance = new UgradDemo();
                    inheritance.UgradDemoMain();
                    break;
                case 51:
                    Clock24Tester clock = new Clock24Tester();
                    clock.Clock24TesterMain();
                    break;
                case 52:
                    ReversePolishCalculatorFrontEnd revpolcalc = new ReversePolishCalculatorFrontEnd();
                    revpolcalc.ReversePolishCalculatorFrontEndMain();
                    break;
                case 53:
                    DrawABox drawabox = new DrawABox();
                    drawabox.DrawABoxMain();
                    break;
                case 54:
                    EvenInList eveninlist = new EvenInList();
                    eveninlist.EvenInListMain();
                    break;
                case 55:
                    ExamAverage examaverage = new ExamAverage();
                    examaverage.EvamAverageMain();
                    break;
                case 56:
                    GuessTheValue guessvalue = new GuessTheValue();
                    guessvalue.GuessTheValueMain();
                    break;
                case 57:
                    MatrixMultiplication matrixmult = new MatrixMultiplication();
                    matrixmult.MatrixMultiplicationMain();
                    break;
                case 58:
                    SelectionSort selectsort = new SelectionSort();
                    selectsort.SelectionSortMain();
                    break;
                case 59:
                    CalculatorDemo calculator = new CalculatorDemo();
                    calculator.CalculatorDemoMain();
                    break;
                case 60:
                    SortingAlgorithms sortingalg = new SortingAlgorithms();
                    sortingalg.SortingAlgorithmsMain();
                    break;
                case 61:
                    lab10 vending = new lab10();
                    vending.lab10Main();
                    break;
                case 62:
                    Lab11 triangle = new Lab11();
                    triangle.Lab11Main();
                    break;
                case 63:
                    Lab12 gas = new Lab12();
                    gas.Lab12Main();
                    break;
                case 64:
                    Lab13 submatrix = new Lab13();
                    submatrix.Lab13Main();
                    break;
                case 65:
                    Lab7 zodiac = new Lab7();
                    zodiac.Lab7Main();
                    break;
                case 66:
                    Lab8 library = new Lab8();
                    library.Lab8Main();
                    break;
                case 67:
                    wordGame wordgame = new wordGame();
                    wordgame.wordGameMain();
                    break;
                case 68:
                    DiamondDrawer diamond = new DiamondDrawer();
                    diamond.DiamondDrawerMain();
                    break;
                case 69:
                    AnimalFrontEnd animal = new AnimalFrontEnd();
                    animal.AnimalFrontEndMain();
                    break;
                case 70:
                    ShapeTreeFE shapetree = new ShapeTreeFE();
                    shapetree.ShapeTreeFEMain();
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
