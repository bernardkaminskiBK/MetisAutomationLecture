package javazaklady2.Webinar14.d;

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
