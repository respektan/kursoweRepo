//package infoshare.Company;
//
//
//import java.io.IOException;
//
//public class MenuService {
//
//    private ConsoleInputReader consoleInputReader;
//    private InputHandler inputHandler;
//    private EmployeeService employeeService;
//
//    public MenuService() {
//        consoleInputReader = new ConsoleInputReader();
//        inputHandler = new InputHandler();
//        employeeService = new EmployeeService();
//    }
//
//
//    public void start() throws IOException {
//
//        printMenu();
//
//        String userChoice = consoleInputReader.readUserInput();
//
//        inputHandler.handleUserChoice(userChoice);
//    }
//    private void printMenu() {
//
//        System.out.println();
//        System.out.println("****** MENU ******");
//        System.out.println("1.\t Add employee.");
//        System.out.println("2.\t Display employees.");
//        System.out.println("3.\t Remove employees.");
//        System.out.println();
//        System.out.println("0.\t End program.");
//        System.out.print("Choice: ");
//    }
//    public void addAnotherEmployee() throws IOException  {
//        System.out.println("Do you want to add another employee? [Y/N]");
//        String input = consoleInputReader.readUserInput();
//        if (input.equals("Y")) {
//            EmployeeService.createNewEmployee();
//        } else if (input.equals("N")) {
//            start();
//        } else {
//            System.out.println("Wrong input!");
//            addAnotherEmployee();
//        }
//    }
//
//    public void printError() {
//        System.out.println("Error! Wrong choice. Reset program.");
//    }
//
//    public void printSuccess() {
//        System.out.println("OK!");
//    }
//
//
//
//}