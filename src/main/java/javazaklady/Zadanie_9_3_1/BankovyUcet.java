package javazaklady.Zadanie_9_3_1;

public class BankovyUcet {
    private double aktualnyZostatok;

    public BankovyUcet(double aktualnyZostatok) {
        this.aktualnyZostatok = aktualnyZostatok;
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
