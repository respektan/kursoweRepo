package pl.infoshare;

import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

//
//        //Zadanie 08.10.18
//        byte a = 2;
//        byte b = 2;
//        byte c = 0;
//        System.out.println("Wynik dodawania to: " + (a + b) );
//        System.out.println("Wynik odejmowania to: " + (a - b) );
//        System.out.println("Wynik dzielenia to: " + (a / b) );
//        System.out.println("Wynik mnozenia to: " + (a * b) );
//
//        //Zadanie 1.1  10.10.18
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj liczbe calkowita: ");
//        double ageNew = scanner.nextDouble();
//        System.out.println("Podales :" + ageNew);
//
//        //Zadanie 1.2 10.10.18
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadz ciag znakow: ");
//        String a = scanner.nextLine();
//        int b = Integer.valueOf(a);
//        System.out.println("Wprowadziles: " + b);
//
//
//        //Cwiczenia z rzutowania
//        char a = 'a';
//        System.out.println(a);
//        int b = (int)a;
//        System.out.println(b);
//        double c = (double)b;
//        System.out.println(c);

        //Cwiczenie 2 i 2.1 - 10.10.18
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj swoj wiek (w latach) : ");
//        int a = scanner.nextInt();
//        if (a >= 18 && a <= 123) {
//            System.out.println("Jestes pelnoletni!");
//        }else if (a > 123 ){
//            System.out.print("Podeles nieprawidlowa wartosc liczbowa! ");
//        }else {
//            System.out.println("Nie jestes pelnoletni!");
//        }

//        //Cwiczenie 3 - 10.10.18
//        Scanner scanner = new Scanner(System.in);
//        String userName = "admin";
//        String pass = "secret";
//        String user2 = "aka";
//        String pass2 = "test";
//
//        System.out.println("Podaj login: ");
//        String loginUser = scanner.nextLine();
//        System.out.println("Podaj haslo: ");
//        String passUser = scanner.nextLine();
//
//        boolean firstLogin = userName.equals(loginUser);
//        boolean firstPass = pass.equals(passUser);
//        boolean firstPassILogin = firstLogin && firstPass;
//
//        boolean secondLogin = user2.equals(loginUser);
//        boolean secondPass = pass2.equals(passUser);
//        boolean secondPassILogin = secondLogin && secondPass;
//
//        boolean firstOrSecond = firstPassILogin || secondPassILogin;
//
//        if ( (userName.equals(loginUser) && pass.equals(passUser)) || (user2.equals(loginUser) && pass2.equals(passUser))) {
//        }if (firstOrSecond){
//            System.out.println("Zalogowany jako: " + loginUser);
//        } else {
//            System.out.println("Blad logowania");
//        }

        //Wypisz wartosci od 1 do 10
//        for (int i =1; i <11; i++){
//           System.out.println(i);
//        }

//        //wypisz wartosci od 1 do 1000 z pominieciem co 2 cyfry
//        for (int i = 1; i < 1001; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        //wypisz wartosci od 1 do 1000
//        int i =1;
//                while (i <1001){
//                    System.out.println(i);
//                    i++;
//
//                }

//


//        //lotto

//        Scanner scanner = new Scanner(System.in);
//        int first = 0;
//        while (first < 1|| first > 49){
//            System.out.print("Podaj pierwsza liczbe z zakresu 1-49: ");
//            first = scanner.nextInt();
//        }
//
//        int second = 0;
//        while (second < 1|| second > 49){
//            System.out.print("Podaj druga liczbe z zakresu 1-49: ");
//            second = scanner.nextInt();
//        }
//            while (second == first){
//                System.out.print("Taka cyfra zostala juz wskazana - podaj inna:");
//                second = scanner.nextInt();
//                }
//
//        int third = 0;
//        while (third < 1 || third> 49){
//            System.out.print("Podaj trzecia liczbe z zakresu 1-49: ");
//            third = scanner.nextInt();
//        }
//        while (third == first || third == second){
//            System.out.print("Taka cyfra zostala juz wskazana - podaj inna:");
//            third  = scanner.nextInt();
//        }
//
//        int forth= 0;
//        while (forth < 1 || forth > 49 ){
//            System.out.print("Podaj czwarta liczbe z zakresu 1-49: ");
//            forth = scanner.nextInt();
//        }
//        while (forth == first || forth == second || forth == third){
//            System.out.print("Taka cyfra zostala juz wskazana - podaj inna:");
//            forth  = scanner.nextInt();
//        }
//
//        int fifth= 0;
//        while (fifth < 1 || fifth > 49){
//            System.out.print("Podaj piata liczbe z zakresu 1-49: ");
//            fifth  = scanner.nextInt();
//        }
//            while (fifth == first || fifth  == second || fifth == third || fifth == forth){
//                System.out.print("Taka cyfra zostala juz wskazana - podaj inna:");
//                fifth   = scanner.nextInt();
//            }
//
//        int sixth= 0;
//        while ( sixth  < 1 || sixth  > 49 ){
//            System.out.print("Podaj szosta liczbe z zakresu 1-49: ");
//            sixth   = scanner.nextInt();
//        }
//        while (sixth  == first || sixth  == second || sixth  == third || sixth  == forth || sixth == fifth ){
//            System.out.print("Taka cyfra zostala juz wskazana - podaj inna:");
//            sixth = scanner.nextInt();
//        }


//        }
//        int i =0
//        int[]array = new int[49];
//        Random random = new Random();
//        int randomint = random.nextInt(49) +1;
//        for(int = 0; i< array.lenght; i++ ){
//            array[i] = random.nextInt(49) +1;
//        }
//        int[] array = new int[50];

//        //Losowanie dowolnej liczby int w przedziale 1 do 100
//        Random random = new Random();
//        int randomInt = random.nextInt(49) + 1;
//
//        for (int i = 1; i < array.length ; i++){
//            array[i] = random.nextInt(49) + 1;
//        }

//        for(int i = 1 ; i < array.length ; i++){
//            System.out.println("Index no. " + i + "\tvalue: " + array[i]);
//        }

//        final int NUM_COUNT = 6;
//        final int MAX_NUM =49;
//        final int MIN_NUM = 1;
//        int[] coupon = new int [NUM_COUNT];
//        int[] winner = new int [NUM_COUNT];
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        for (int number = 0; number < coupon.length; number++){
//            System.out.print("Podaj cyfre nr:  " + (number +1));
//            coupon[number] = scanner.nextInt();

//        }
//        System.out.println("Losowanie " + winner.length + "liczb...");
//        for (int num = 0; num < winner.length; num++){
//            winner[num] = random.nextInt(MAX_NUM) + MIN_NUM
//            ;
//
//        }
//
//        )


//        URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
//        Scanner scanner = new Scanner(url.openStream());
//        while(scanner.hasNextLine())
//            System.out.println(scanner.nextLine());
//        PrintWriter letters = new PrintWriter("/home/aka/Desktop/letters.txt");
//        PrintWriter numbers = new PrintWriter("/home/aka/Desktop/numbers.txt");
//        String line;
//        while(scanner.hasNextLine()){
//            line = scanner.nextLine();
//            if(Character.isDigit(line.charAt(0))){
//                numbers.println(line);
//                numbers.close();
//            }
//            else {
//                letters.println(line);
//                letters.close();
//            }
//        }


        URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
        Scanner scanner = new Scanner(url.openStream());
        // while(scanner.hasNextLine()) {
        //      System.out.println(scanner.nextLine());
        // }
        PrintWriter letters = new PrintWriter("/home/aka/Desktop/letters.txt");
        PrintWriter numbers = new PrintWriter("/home/aka/Desktop/numbers.txt");
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.trim().isEmpty()) {
                continue;
            }
            if (Character.isDigit(line.charAt(0))) {
                numbers.println(line);
            } else {
                letters.println(line);
            }
            }
            letters.close();
            numbers.close();

    }
}







