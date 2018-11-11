package infoshare.Company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EmployeeService {
}

    public  Employee {

    private String name;
    private String lastName;
    private String departament;
    private Integer earnings;

    public Employee (String name, String lastName, String departament, Integer earnings ) {
        this.name = name;
        this.lastName = lastName;
        this.departament = departament;
        this.earnings = earnings;
    }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getDepartament() {
            return departament;
        }

        public void setDepartament(String departament) {
            this.departament = departament;
        }

        public Integer getEarnings() {
            return earnings;
        }

        public setEarnings(Integer earnings) {
            this.earnings = earnings;
        }


        public Employee generateEmployeeFromUserInput() {
            String name = getFieldFromUserInput("name");
            String lastName = getFieldFromUserInput("lastName");
            String departament = getFieldFromUserInput("departament");
            Integer earnings = getFieldFromUserInput("earnings");

            return new Employee (name, lastName, departament, earnings);
        }
        public Employee generateEmployeeFromFileInput(String lineFromFile) {
            String[] employeeSplitted = lineFromFile.split(";");
            return new Employee (employeeSplitted[0], employeeSplitted[1],employeeSplitted[2],employeeSplitted[3]);
        }


        public void createNewEmployee() throws IOException {

            MenuService menuService = new MenuService();

            Employee employee = generateEmployeeFromUserInput();

            new FileService().saveEmployeesToFile(user);

            menuService.printSuccess();

            menuService.addAnotherEmployee();
        }
        public void printUsersFromArray(Employee[] userArray) {
            for (Employee user : userArray) {
                System.out.println("Name: " + user.getName()
                        + "\t" + "Last name: " + user.getLastName()
                        + "\t" + "Departament: " + user.getDepartament()
                        + "\t" + "Earnings: " + user.getEarnings());
            }
        }
        