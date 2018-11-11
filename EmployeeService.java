package infoshare.Company;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    public void createNewEmployee() throws IOException {

        MenuService menuService = new MenuService();
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();

        Employee employee = generateEmployeeFromUserInput();
        new FileService().saveToFile(employee);
        menuService.printSuccess();
        menuService.addAnotherEmployee();
    }


    public Employee[] generateEmployeeArray(List<Employee> linesFromFile) {

        Employee[] employeeArray = new Employee[][linesFromFile.size()];

        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i] = generateEmployeFromFileInput(linesFromFile.get(i));
        }
        return employeeArray;
    }

    public Employee generateEmployeeFromFileInput(String lineFromFile) {
        String[] employeeSplitted = lineFromFile.split(";");
        return new Employee(employeeSplitted[0], employeeSplitted[1], employeeSplitted[2], employeeSplitted[3]);
    }

    public Employee generateEmployeeFromUserInput() {

        ConsoleInputReader consoleInputReader = new ConsoleInputReader();

        return new Employee()
                consoleInputReader.getFieldFromUserInput("name");
        consoleInputReader.getFieldFromUserInput("lastName");
        consoleInputReader.getFieldFromUserInput("departament");
        consoleInputReader.getFieldFromUserInput("earnings");
        );
    }

    public void printEmployeeFromArray(Employee[] employeeArray) {
        for (Employee employee : employeeArray) {
            System.out.println("Name: " + employee.getName()
                    + "\t" + "Last name: " + employee.getLastName()
                    + "\t" + "Departament: " + employee.getDepartament()
                    + "\t" + "Earnings: " + employee.getEarnings());
        }

        public void deleteEmployee(Employee[] employeeArray) {

            Scanner scaner = new Scanner(System.in);
            System.out.println("Enter the first name of the employee you want to delete from the list")
            String name = scaner.nextLine();

            for (int i = 0; i < employeeArray.length; i++) {
                if (employee[i] != null && employees[i].getName().equals(name)) {
                    employees[i] = null;
                    break;
                }
                if (i == employees.length - 1) {
                    System.out.println("That requested person is not employed at this company.")
                }
            }
        }
    }
}