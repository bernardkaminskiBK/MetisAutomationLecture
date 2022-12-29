package javazaklady.lecture15.activity3.part3;

import java.util.NoSuchElementException;

/**
 * Trieda reprezentuje zretazeny zoznam z uzlov (nodov) za ucelom efektivneho vkladania
 * a odstranovania prvkov zo zaciatku a stredu zoznamu
 * Trieda obsahuje len podmnozinu vsetkych funkcionalit (operacii) obsiahnutych v triede java.util.
 */
public class ZretazenyZoznam {
    private Uzol prvy;
    private int aktualnaVelkost;

    public ZretazenyZoznam(){
        this.prvy = null;
    }
    public void pridajNaZaciatok(Object prvok) {
        Uzol novyUzol = new Uzol();
        novyUzol.setData(prvok);
        novyUzol.setDalsi(prvy);
        prvy = novyUzol;
        aktualnaVelkost++;
    }

    public Object getPrvy(){
        if (prvy == null){
            throw new NoSuchElementException();
        }
        return this.prvy.getData();
    }

    public Object zmazZoZaciatku() {
        if (prvy == null){
            throw new NoSuchElementException();
        }
        Object data = prvy.getData();
        prvy = prvy.dalsi;
        aktualnaVelkost--;
        return data;

    }

    public int getAktualnaVelkost() {
        return aktualnaVelkost;
    }

    private class ZretazenyZoznamIterator implements ZoznamIterator {
        private  Uzol aktualny;
        private  Uzol predchadajuci;

        private ZretazenyZoznamIterator(){
            this.aktualny = predchadajuci = null;
        }

        @Override
        public void pridaj(Object prvok) {
            if (this.aktualny == null){
                pridajNaZaciatok(prvok);
                this.aktualny = prvy;
            }
            else {
                Uzol novyUzol = new Uzol();
                novyUzol.setData(prvok);
                novyUzol.setDalsi(this.aktualny.getDalsi());
                this.aktualny.setDalsi(novyUzol);
                this.aktualny = novyUzol;
            }
            this.predchadajuci = this.aktualny;

        }


        @Override
        public Object dalsi() {
            if (!existujeDalsiPrvok()){
                throw new NoSuchElementException();
            }
            this.predchadajuci = aktualny;

            if (aktualny == null){
                this.aktualny = prvy;
            }
            else {
                this.aktualny = this.aktualny.getDalsi();
            }
            return this.aktualny.getData();
        }

        @Override
        public void zmaz() {
            if (this.predchadajuci == this.aktualny){
                throw new IllegalStateException();
            }

            if (this.aktualny == prvy){
                zmazZoZaciatku();
            }
            else {
                this.predchadajuci.setDalsi(this.aktualny.getDalsi());
            }
            this.aktualny = this.predchadajuci;

        }

        @Override
        public boolean existujeDalsiPrvok() {
            if (this.aktualny == null){
                return prvy != null;
            }
            return this.aktualny.getDalsi() != null;
        }

        @Override
        public void nastav(Object prvok) {
            if (this.aktualny == null){
                throw new NoSuchElementException();
            }
            this.aktualny.setData(prvok);
        }
    }
    public ZoznamIterator iteratorZoznam() {
        return new ZretazenyZoznamIterator();
    }

    private class Uzol {
        private Object data;
        private Uzol dalsi;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Uzol getDalsi() {
            return dalsi;
        }

        public void setDalsi(Uzol dalsi) {
            this.dalsi = dalsi;
        }
    }
}
