package javazaklady.lecture3.activity3.part4;

public class Dvojica {
    private final double cislo1;
    private final double cislo2;

    /**
     * Dvojica cisel s ktorymi operujeme
     *
     * @param cislo1 prve cislo
     * @param cislo2 druhe cislo
     */
    public Dvojica(double cislo1, double cislo2) {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;
    }

    /**
     * Spocita cisla a vrati sucet
     *
     * @return sucet dvojice cisel
     */
    public double getSucet() {
        return cislo1 + cislo2;
    }

    /**
     * Odcita cisla a vrati rozdiel
     *
     * @return rozdiel dvojice cisel
     */
    public double getRozdiel() {
        return cislo1 - cislo2;
    }

    /**
     * Vynasobi cisla a vrati sucin
     *
     * @return sucin dvojice cisel
     */
    public double getSucin() {
        return cislo1 * cislo2;
    }

    /**
     * Vypocita priemer dvojice cisel
     *
     * @return priemer dvojice cisel
     */
    public double getPriemer() {
        return (cislo1 + cislo2) / 2;
    }

    /**
     * Vypocita vzdialenost medzi dvojicou cisel
     *
     * @return vzdialenost medzi cislami
     */
    public double getVzdialenost() {
        double rozdiel = cislo1 - cislo2;
        double absHod;
        if (rozdiel < 0) {
            absHod = rozdiel * (-1);
        } else {
            absHod = rozdiel;
        }
        return absHod;
    }

    /**
     * Vypocita maximum z dvojice cisel
     *
     * @return maximum z dvojice cisel
     */
    public double getMaximum() {
        double maximum;
        if (cislo1 > cislo2) {
            maximum = cislo1;
        } else {
            maximum = cislo2;
        }
        return maximum;
    }

    /**
     * Vypocita minimum z dvojice cisel
     *
     * @return minimum z dvojice cisel
     */
    public double getMinimum() {
        double minimum;
        if (cislo1 < cislo2) {
            minimum = cislo1;
        } else {
            minimum = cislo2;
        }
        return minimum;
    }
}




















