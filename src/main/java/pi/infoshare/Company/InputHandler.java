//package infoshare.Company;
//
//import java.io.IOException;
//import java.util.List;
//
//public class InputHandler {
//
//
//    public void handleUserChoice (String choice) throws IOException {
//        EmployeeService employeeService = new EmployeeService();
//        MenuService menuService = new MenuService();
//
//        switch (choice) {
//            case "1": {
//                employeeService.createNewEmployee();
//                break;
//            }
//            case "2": {
//                List<Employee> fileLines = readLinesFromFile();
//                EmployeeService[] employeeArray = employeeService.generateEmployeeArray(fileLines);
//                employeeService.printEmployeeFromArray(employeeArray);
//
//                menuService.start();
//                break;
//            }
//            case "3": {
//                employeeService.deleteEmployee();
//                break;
//            }
//            case "0": {
//                break;
//            }
//            default: {
//                MenuService.printError();
//                break;
//            }
//        }
//    }
//}
//
