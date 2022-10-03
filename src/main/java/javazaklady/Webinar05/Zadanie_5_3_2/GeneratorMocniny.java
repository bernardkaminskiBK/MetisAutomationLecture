package javazaklady.Webinar05.Zadanie_5_3_2;

public class GeneratorMocniny {

    private long i = 0;
    private int faktor = 0;
    /**
     * Vytvara generator mocniny
     */
    public GeneratorMocniny(int faktor) {
        this.faktor = faktor;
    }

    /**
     * Vypocita a vrati dalsiu mocninu.
     *
     * @return dalsia mocnina
     */
    public long dalsiaMocnina() {
        return (long) Math.pow(faktor, i++);
    }
}
