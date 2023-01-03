package academy.metis.javazaklady.lecture14.activity3.part4;

public class Osoba implements Comparable<Osoba> {

    private String meno;

    public Osoba(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    @Override
    public int compareTo(Osoba o) {
        return getMeno().compareTo(o.getMeno());
    }

}