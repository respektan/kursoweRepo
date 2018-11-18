package pl.infoshare.zaddom;

import java.time.LocalDate;

public class Osoba {

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private char plec;

    public Osoba(LocalDate dataUrodzenia, char plec) {
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public char getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "Imie: " + imie
                + "\nNazwisko: " + nazwisko
                + "\nData urodzenia: " + dataUrodzenia
                + "\nPlec: " + plec + "\n";
    }
}