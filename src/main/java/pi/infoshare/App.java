package pl.infoshare;

import java.util.Scanner;
import Java.util.Random;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

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
        
        
        //Cwiczenie 1 - 10.10.18
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Podaj liczbe calkowita :");
//     double number = scanner.nextDouble();
//     System.out.println("Podales :" + number);

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

        //Cwiczenie 3 - 10.10.18
        Scanner scanner = new Scanner(System.in);
        String userName = "admin";
        String pass = "secret";
        String user2 = "aka";
        String pass2 = "test";

        System.out.println("Podaj login: ");
        String loginUser = scanner.nextLine();
        System.out.println("Podaj haslo: ");
        String passUser = scanner.nextLine();

        boolean firstLogin = userName.equals(loginUser);
        boolean firstPass = pass.equals(passUser);
        boolean firstPassILogin = firstLogin && firstPass;

        boolean secondLogin = user2.equals(loginUser);
        boolean secondPass = pass2.equals(passUser);
        boolean secondPassILogin = secondLogin && secondPass;

        boolean firstOrSecond = firstPassILogin || secondPassILogin;

        if ( (userName.equals(loginUser) && pass.equals(passUser)) || (user2.equals(loginUser) && pass2.equals(passUser))) {
        }if (firstOrSecond){
            System.out.println("Zalogowany jako: " + loginUser);
        } else {
            System.out.println("Blad logowania");
        }
        }
    }

// Zadanie 15.10.18 totolotek
 
        final int NUM_COUNT = 6;
        final int MAX_NUM = 49;
        final int MIN_NUM = 1;
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();
        int[] coupon = new int[NUM_COUNT];
        int[] winning = new int[NUM_COUNT];
 
        for(int index = 0; index < coupon.length; index++) {
            System.out.println("Podaj liczbę nr " + (index + 1));
            coupon[index] = scanner.nextInt();
            if(coupon[index] > MAX_NUM || coupon[index] < MIN_NUM) {
                System.out.println("Podana liczba jest z poza zakresu [" + MIN_NUM + ", " + MAX_NUM + "]. Podaj inną liczbę ");
                index--;
                continue;
            }
            for(int innerIndex = 0; innerIndex < index; innerIndex++) {
                if(coupon[index] == coupon[innerIndex]) {
                    System.out.println("Podano drugi raz liczbę " + coupon[index]);
                    index--;
                    break;
                }
            }
        }
 
        System.out.println("Losowanie " + NUM_COUNT + " liczb...");

        outerLoop:
        for(int index = 0; index < winning.length; index++) {
            winning[index] = random.nextInt(MAX_NUM) + MIN_NUM;
            for(int innerIndex = 0; innerIndex < index; innerIndex++) {
                if(winning[index] == winning[innerIndex]) {
                    index--;
                    continue outerLoop;
                }
            }
            System.out.print(winning[index]);
            if(index == (NUM_COUNT -1)) {
                System.out.print(".\n");
            } else {
                System.out.print(", ");
            }
        }
 
        int countWinning = 0;
        for (int aWinning : winning) {
            for (int aCoupon : coupon) {
                if (aCoupon == aWinning) {
                    countWinning++;
                }
            }
        }
 
        System.out.println("Trafiono " + countWinning + " liczb.");
    }


