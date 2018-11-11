package infoshare.Company;

import java.util.List;
import java.util.Scanner;

public class InputHandler {
}

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public handleUserChoice (String choice) {
        switch (choice) {
            case "1": {
                createNewEmployee();
                break;
            }
            case "2": {

                List<String> fileLines = readLinesFromFile();
                User[] employeeArray = generateEmployeeArray(fileLines);
                printEmployeeFromArray(employeeArray);

                start();
                break;
            }
            case "3": {

                EmployeeService.deleteEmployee();
                break;
            }
            case "0": {
                break;
            }
            default: {
                printError();
                break;
            }
        }
    }

    public void createNewEmployee(){
        User employee = generateEmployeFromUserInput();
        MenuService.saveToFile(employee);
        MenuService.printSuccess();
        MenuService.shouldAddAnotherEmployee();
    }
    public void deleteEmployee(){

        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the first name of the employee you want to delete from the list")
        String name = scaner.nextLine();

        for (int i = 0; i < employeArray.length; i++) {
            if (Employee[i] != null && Employees[i].getName().equals(name)){
                Employees[i] = null;
                break;
            }

            if (i == employees.length - 1) {
                System.out.println("That requested person is not employed at this company.")
            }
        }