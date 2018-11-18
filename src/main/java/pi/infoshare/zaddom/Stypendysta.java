package pl.infoshare.zaddom;

import java.time.LocalDate;

public class Stypendysta extends pl.infoshare.zaddom.Student {

    private double stypendium;

    public Stypendysta(LocalDate dataUrodzenia, char plec, int numerIndeksu, double stypendium) {
        super(dataUrodzenia, plec, numerIndeksu);
        this.stypendium = stypendium;
    }

    public double getStypendium() {
        return stypendium;
    }

    public void setStypendium(double stypendium) {
        this.stypendium = stypendium;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwota stypendium: " + stypendium + "\n";
    }

}