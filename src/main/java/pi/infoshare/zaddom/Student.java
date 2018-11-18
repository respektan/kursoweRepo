package pl.infoshare.zaddom;

import java.time.LocalDate;

public class Student extends pl.infoshare.zaddom.Osoba {

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    private int numerIndeksu;

    public Student(LocalDate dataUrodzenia, char plec, int numerIndeksu) {
        super(dataUrodzenia, plec);
        this.numerIndeksu = numerIndeksu;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    @Override
    public String toString() {
        return super.toString() + "Numer indeksu: " + numerIndeksu + "\n";
    }

    public void stworzStudenta() {
        Student student = new Student();
        student.setNumerIndeksu();
        System.out.println(student);
    }

}
