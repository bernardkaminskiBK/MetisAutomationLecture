package java_spolocna_praca_s_lektorom.webinar13.stopky;

//TODO: Uprav stopky tak, aby merali s presnostou na nanosekundy (ns)
public class Stopky {

    private boolean suSpustene;

    /* Cas spustenia v milisekundach */
    private long casSpustenia;

    /* Cas zastavenia v milisekundach */
    private long uplynulyCas;

    public Stopky() {
        vynuluj();
    }

    private void vynuluj() {
        suSpustene = false;
        casSpustenia = uplynulyCas = 0;
    }

    public void spust() {
        if (suSpustene) {
            return;
        }

        suSpustene = true;
        casSpustenia = System.currentTimeMillis();
    }

    public void zastav() {
        if (!suSpustene) {
            return;
        }

        suSpustene = false;
        long casZastavenia = System.currentTimeMillis();
        uplynulyCas = uplynulyCas + (casZastavenia - casSpustenia);
    }

    public long getUplynulyCas() {
        if (suSpustene) {
            long casZastavenia = System.currentTimeMillis();
            return uplynulyCas + (casZastavenia - casSpustenia);
        } else {
            return uplynulyCas;
        }
    }
}
