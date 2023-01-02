package academy.metis.javazaklady.lecture13.activity3.part3;

public class Stopky {

    private boolean suSpustene;
    private long casSpustenia;
    private long uplynulyCas;

    public Stopky(){
        vynuluj();
    }

    private void vynuluj() {
        suSpustene = false;
        casSpustenia = uplynulyCas = 0;
    }

    public void spust(){
        if (suSpustene){

        }
        suSpustene = true;
        casSpustenia = System.currentTimeMillis();

    }

    public void zastav(){
        if (!suSpustene){
            return;
        }

        suSpustene = false;
        long casZsatavenia = System.currentTimeMillis();
        uplynulyCas = uplynulyCas + (casZsatavenia - casSpustenia);

    }

    public long getUplynulyCas(){
        if (suSpustene){
            long casZastavenia = System.currentTimeMillis();
            return uplynulyCas + (casZastavenia - casSpustenia);
        }
        else {
            return uplynulyCas;
        }
    }
}
