//package infoshare.Company;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.List;
//
//public class FileService {
//
//    public List<String> readLinesFromFile() throws IOException {
//        return Files.readAllLines(Paths.get("./employeesDatabase.txt"));
//    }
//
//    public void saveToFile(Employee... employeess) throws IOException {
//        for (Employee employee : employeess) {
//            String line = employee.getName() + ";"
//                    + employee.getLastName() + ";"
//                    + employee.getDepartament() + ";"
//                    + employee.getEarnings() + "\n";
//
//            Path path = Paths.get("./employeesDatabase.txt");
//            if (Files.exists(path)) {
//                Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
//            } else {
//                Files.write(path, line.getBytes());
//            }
//        }
//    }
//}