package javazaklady.Webinar09.a;

public class BankovyUcet {
    private double aktualnyZostatok;

    public BankovyUcet() {
    }

    public double getAktualnyZostatok() {
        return aktualnyZostatok;
    }

    public void setAktualnyZostatok(double aktualnyZostatok) {
        this.aktualnyZostatok = aktualnyZostatok;
    }

    public void vyber(double ciastka) {
        aktualnyZostatok -= ciastka;
    }
    public void vloz(double ciastka){
        aktualnyZostatok += ciastka;

    }




}
