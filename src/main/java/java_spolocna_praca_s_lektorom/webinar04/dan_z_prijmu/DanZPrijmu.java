package java_spolocna_praca_s_lektorom.webinar04.dan_z_prijmu;

public class DanZPrijmu {
    public static final int NIZKY_PRIJEM_SLOBODNY = 11000;
    public static final int STREDNY_PRIJEM_SLOBODNY = 25000;
    public static final int NIZKY_PRIJEM_ZENATY = 16000;
    public static final int STREDNY_PRIJEM_ZENATY = 43000;
    public static final double NIZKA_DAN = 0.15;
    public static final double STREDNA_DAN = 0.28;
    public static final double VYSOKA_DAN = 0.31;
    private final RodinnyStatus status;
    private final double prijem;

    public DanZPrijmu(RodinnyStatus status, double prijem) {
        this.status = status;
        this.prijem = prijem;
    }

    public double vypocitajDan() {
        double dan = 0;

        if (status == RodinnyStatus.SLOBODNY_SLOBODNA)
        {
            if (prijem < NIZKY_PRIJEM_SLOBODNY)
            {
                dan = prijem * NIZKA_DAN;
            }
            else if (prijem < STREDNY_PRIJEM_SLOBODNY) {
                dan = prijem * STREDNA_DAN;
            }
            else {
                dan = prijem * VYSOKA_DAN;
            }
        }
        else if (status == RodinnyStatus.ZENATY_VYDATA) {
            if (prijem < NIZKY_PRIJEM_ZENATY)
            {
                dan = prijem * NIZKA_DAN;
            }
            else if (prijem < STREDNY_PRIJEM_ZENATY) {
                dan = prijem * STREDNA_DAN;
            }
            else {
                dan = prijem * VYSOKA_DAN;
            }
        }

        return dan;
    }
}
