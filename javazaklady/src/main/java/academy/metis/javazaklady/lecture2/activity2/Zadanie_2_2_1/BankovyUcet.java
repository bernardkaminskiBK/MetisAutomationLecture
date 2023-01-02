package academy.metis.javazaklady.lecture2.activity2.Zadanie_2_2_1;

/**
 * Trieda BankovyUcet obsahuje aktuálny zostatok, ktorý môže byť
 * zmenený vkladmi a výbermi.
 */
public class BankovyUcet {

    // instancne premenne
    private double aktualnyZostatok;

    /**
     * Vytvára nový bankový účet s nulovým počiatočným zostaktom.
     */
    public BankovyUcet() {
        aktualnyZostatok = 0;
    }

    /**
     * Vytvára nový bankový účet s daným počiatočným zostatkom.
     *
     * @param pociatocnyZostatok suma peňazí, ktorá bude pripísaná na bankový účet
     */
    public BankovyUcet(double pociatocnyZostatok) {
        aktualnyZostatok = pociatocnyZostatok;
    }

    /**
     * Vkladá danú čiastku na bankový účet.
     *
     * @param ciastka suma peňazí, ktorá sa pripíše na bankový účet
     */
    public void vloz(double ciastka) {
        aktualnyZostatok = aktualnyZostatok + ciastka;
    }

    /**
     * Vyberá danú čiastku z bankového účtu.
     *
     * @param ciastka suma peňazí, ktorá bude odčítaná z bankového účtu
     */
    public void vyber(double ciastka) {
        aktualnyZostatok = aktualnyZostatok - ciastka;
    }

    /**
     * Vracia aktuálny zostatok na bankovom účte.
     *
     * @return aktuálny zostatok
     */
    public double getAktualnyZostatok() {
        return aktualnyZostatok;
    }
}
