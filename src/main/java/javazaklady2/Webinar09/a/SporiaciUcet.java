package javazaklady2.Webinar09.a;

public class SporiaciUcet extends BankovyUcet {
    private double urokovaSadzba;
    protected double minZostatok;
    private int pocetVyberov;

    public SporiaciUcet(double urokovaSadzba) {
        super();
        this.urokovaSadzba = urokovaSadzba;
    }

    public void setMinZostatok(double minZostatok){
        this.minZostatok = minZostatok;
    }

    public double getMinZostatok() {
        return minZostatok;
    }

    public void zapisUrok() {
        double urok;
        if (pocetVyberov == 0) {
            urok = urokovaSadzba * getAktualnyZostatok() / 100;
        } else {
            urok = urokovaSadzba * minZostatok / 100;
        }
        super.vloz(urok);
    }


    @Override
    public void vyber(double ciastka) {
        super.vyber(ciastka);
        double zostatok = getAktualnyZostatok();
        setMinZostatok(zostatok);
        if (zostatok < getMinZostatok()){
            minZostatok = zostatok;
        }
        pocetVyberov++;


    }
}

