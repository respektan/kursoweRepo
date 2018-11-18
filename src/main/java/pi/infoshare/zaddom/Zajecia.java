package infoshare.zaddom;

public class Zajecia {

    public String nazwaZajec;

    public Zajecia(String nazwaZajec) {
        super(nazwaZajec);
        this.nazwaZajec = nazwaZajec;
    }

    public void setNazwaZajec(String nazwaZajec) {
        this.nazwaZajec = nazwaZajec;
    }

    public String getNazwaZajec() {
        return nazwaZajec;
    }
    @Override
    public String toString() {
        return super.toString() + "Nazwa zajec: " + nazwaZajec  + "\n";
    }

    public void stworzZajecia{
        Zajecia zajecia = new Zajecia();
        zajecia.setNazwaZajec();
        zajecia.getWykladowca();
        zajecia.setSala();
        zajecia.getStudent();
        System.out.println(zajecia);
    }
}
