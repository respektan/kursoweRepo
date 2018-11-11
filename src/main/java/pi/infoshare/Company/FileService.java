package infoshare.Company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {
}
    public void saveEmployeesToFile (Employee... employeess) throws IOException {
        for (Employee user  : employeess) {
            String line = user.getName() + ";" + user.getLastName() + ";" + user.getDepartament() + ";" + user.getEarnings()"\n";

            Path path = Paths.get("./employeesDatabase.txt");
            if (Files.exists(path)) {
                Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(path, line.getBytes());
            }
        }
    }