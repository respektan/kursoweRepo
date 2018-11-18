//package pl.infoshare;
//
//<<<<<<< Updated upstream
//=======
//<<<<<<< HEAD
//import java.io.PrintWriter;
//import java.net.URL;
//=======
//>>>>>>> Stashed changes
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.List;
//<<<<<<< Updated upstream
//=======
//>>>>>>> 0ac4a4f11ad843ea708a41147074105a85886a7a
//>>>>>>> Stashed changes
//import java.util.Scanner;
//import java.util.Random;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
//
//
//<<<<<<< Updated upstream
//
//=======
//<<<<<<< HEAD
///**
// * Hello world!
// */
//>>>>>>> Stashed changes
//public class App {
//
//    public static void main(String[] args) throws IOException {
//
//        start();
//    }
//
//    private static void start() throws IOException {
//
//     printMenu();
//
//        String userChoice = readUserInput();
//        handleUserChoice(userChoice);
//    }
//
//    private static void handleUserChoice(String choice) throws IOException {
//        switch (choice) {
//            case "1": {
//                createNewUser();
//                break;
//            }
//            case "2": {
//
//                List<String> fileLines = readLinesFromFile();
//                User[] userArray = generateUserArray(fileLines);
//                printUsersFromArray(userArray);
//
//                start();
//                break;
//            }
//            case "0": {
//                break;
//            }
//            default: {
//                printError();
//                break;
//            }
//        }
//    }
//
//<<<<<<< Updated upstream
//=======
//=======
//
//public class Zad2 {
//
//    public static void main(String[] args) throws IOException {
//
//        start();
//    }
//
//    private static void start() throws IOException {
//
//     printMenu();
//
//        String userChoice = readUserInput();
//        handleUserChoice(userChoice);
//    }
//
//    private static void handleUserChoice(String choice) throws IOException {
//        switch (choice) {
//            case "1": {
//                createNewUser();
//                break;
//            }
//            case "2": {
//
//                List<String> fileLines = readLinesFromFile();
//                User[] userArray = generateUserArray(fileLines);
//                printUsersFromArray(userArray);
//
//                start();
//                break;
//            }
//            case "0": {
//                break;
//            }
//            default: {
//                printError();
//                break;
//            }
//        }
//    }
//
//>>>>>>> Stashed changes
//    private static void createNewUser() throws IOException {
//        User user = generateUserFromUserInput();
//        saveToFile(user);
//        printSuccess();
//        shouldAddAnotherUser();
//    }
//    private static void shouldAddAnotherUser() throws IOException {
//        System.out.println("Chcesz dodac kolejnego uzytkownika? [Y/N]");
//        String input = readUserInput();
//        if (input.equals("Y")) {
//            createNewUser();
//        } else if (input.equals("N")) {
//            start();
//        } else {
//            System.out.println("Bledna komenda ");
//            shouldAddAnotherUser();
//        }
//    }
//
//    private static void printUsersFromArray(User[] userArray) {
//        for (User user : userArray) {
//            System.out.println("Username: " + user.getUsername() + "\t" + "Password: " + user.getPassword() + "\t" + "Usertype: " + user.getUsertype());
//        }
//    }
//
//    private static User[] generateUserArray(List<String> linesFromFile) {
//        User[] userArray = new User[linesFromFile.size()];
//
//        for (int i = 0; i < userArray.length; i++) {
//            userArray[i] = generateUserFromFileInput(linesFromFile.get(i));
//        }
//        return userArray;
//    }
//
//    private static List<String> readLinesFromFile() throws IOException {
//        return Files.readAllLines(Paths.get("./zad5.txt"));
//<<<<<<< Updated upstream
//=======
//>>>>>>> 0ac4a4f11ad843ea708a41147074105a85886a7a
//>>>>>>> Stashed changes
//    }
//}
//
//
//
//
//
//
//
//    private static void printMenu() {
//        System.out.println();
//        System.out.println("========== MENU ==========");
//        System.out.println("1.\t Dodaj uzytkownika.");
//        System.out.println("2.\t Wyświetl uzytkowników.");
//        System.out.println();
//        System.out.println("0.\t Wyjdz z programu.");
//        System.out.print("Wybor: ");
//    }
//
//    private static void printSuccess() {
//        System.out.println("WYKONANO POPRAWNIE!");
//    }
//
//
//    private static void printError() {
//        System.out.println("BLAD! Zly wybor. Zrestartuj program");
//    }
//
//    private static User generateUserFromFileInput(String lineFromFile) {
//        String[] userSplitted = lineFromFile.split(";");
//        return new User(userSplitted[0], userSplitted[1], userSplitted[2]);
//    }
//
//    private static void saveToFile(User... users) throws IOException {
//        for (User user : users) {
//            String line = user.getUsername() + ";" + user.getPassword() + ";" + user.getUsertype() + "\n";
//
//            Path path = Paths.get("./zad5.txt");
//            if (Files.exists(path)) {
//                Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
//            } else {
//                Files.write(path, line.getBytes());
//            }
//        }
//    }
//
//    private static User generateUserFromUserInput() {
//        String username = getFieldFromUserInput("user name");
//        String password = getFieldFromUserInput("password");
//        String userType = null;
//        boolean isValidUserType;
//        while (!(isValidUserType = validUserType(userType))) {
//            userType = getFieldFromUserInput("user type: [user / admin]");
//            if (!isValidUserType) {
//                System.out.println("Wprowadziles bledny typ uzytkownika!");
//            }
//        }
//        return new User(username, password, userType);
//    }
//
//    private static String getFieldFromUserInput(String field) {
//        System.out.print("Wprowadz " + field + ": ");
//        return readUserInput();
//    }
//
//    private static String readUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//
//    private static boolean validUserType(String userType) {
//        return userType != null && (userType.equals("user") || userType.equals("admin"));
//    }
//}
//
//
