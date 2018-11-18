package pl.infoshare.zaddom;

import java.time.LocalDate;

public class Wykladowca extends pl.infoshare.zaddom.Osoba {

    private String tytulNaukowy;

    public Wykladowca(LocalDate dataUrodzenia, char plec, String tytulNaukowy) {
        super(dataUrodzenia, plec);
        this.tytulNaukowy = tytulNaukowy;
    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    @Override
    public String toString() {
        return super.toString() + "Tytul naukowy: " + tytulNaukowy + "\n";
    }
    public void stworzWykladowce() {
        Wykladowca wykladowca = new Wykladowca();
        wykladowca.setTytulNaukowy();
        System.out.println(wykladowca);
    }


}
