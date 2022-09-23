package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_3.vlastny_genericky_zretazeny_zoznam;

import java.util.NoSuchElementException;

/**
 * Trieda reprezentuje zretazeny zoznam pozostavajuci z uzlov (nodov) za ucelom efektivneho vkladania
 * a odstranovania prvkov zo zaciatku a stredu zoznamu.
 * Trieda obsahuje len podmnozinu vsetkych funkcionalit (operacii) obsiahnutych v triede
 * java.util.LinkedList.
 */
public class ZretazenyZoznam<E>
{
    private Uzol prvy;

    public ZretazenyZoznam()
    {
        this.prvy = null;
    }

    public void pridajNaZaciatok(E prvok)
    {
        Uzol novyUzol = new Uzol();
        novyUzol.setData(prvok);
        novyUzol.setDalsi(prvy);
        prvy = novyUzol;
    }

    public E getPrvy()
    {
        if (prvy == null)
        {
            throw new NoSuchElementException();
        }

        return this.prvy.getData();
    }

    public E zmazZoZaciatku()
    {
        if (prvy == null)
        {
            throw new NoSuchElementException();
        }

        E data = prvy.getData();
        prvy = prvy.dalsi;
        return data;
    }

    private class ZretazenyZoznamIterator implements ZoznamIterator<E>
    {
        private Uzol aktualny;
        private Uzol predchadzajuci;

        public ZretazenyZoznamIterator()
        {
            this.aktualny = predchadzajuci = null;
        }

        @Override
        public void pridaj(E prvok)
        {
            if (this.aktualny == null)
            {
                pridajNaZaciatok(prvok);
                this.aktualny = prvy;
            }
            else
            {
                Uzol novyUzol = new Uzol();
                novyUzol.setData(prvok);
                novyUzol.setDalsi(this.aktualny.getDalsi());
                this.aktualny.setDalsi(novyUzol);
                this.aktualny = novyUzol;
            }

            this.predchadzajuci = this.aktualny;
        }

        @Override
        public E dalsi()
        {
            if (!existujeDalsiPrvok())
            {
                throw new NoSuchElementException();
            }

            this.predchadzajuci = this.aktualny;

            if (aktualny == null)
            {
                this.aktualny = prvy;
            }
            else
            {
                this.aktualny = this.aktualny.getDalsi();
            }

            return this.aktualny.getData();
        }

        @Override
        public void zmaz()
        {
            if (this.predchadzajuci == this.aktualny)
            {
                throw new IllegalStateException();
            }

            if (this.aktualny == prvy)
            {
                zmazZoZaciatku();
            }
            else
            {
                this.predchadzajuci.setDalsi(this.aktualny.getDalsi());
            }

            this.aktualny = this.predchadzajuci;
        }

        @Override
        public boolean existujeDalsiPrvok()
        {
            if (this.aktualny == null)
            {
                return prvy != null;
            }

            return this.aktualny.getDalsi() != null;
        }

        @Override
        public void nastav(E prvok)
        {
            if (this.aktualny == null)
            {
                throw new NoSuchElementException();
            }

            this.aktualny.setData(prvok);
        }
    }

    public ZoznamIterator<E> iteratorZoznam()
    {
        return new ZretazenyZoznamIterator();
    }

    private class Uzol //vnutorna trieda (create inner class)
    {
        private E data;
        private Uzol dalsi;

        public E getData()
        {
            return data;
        }

        public Uzol getDalsi()
        {
            return dalsi;
        }

        public void setData(E data)
        {
            this.data = data;
        }

        public void setDalsi(Uzol dalsi)
        {
            this.dalsi = dalsi;
        }
    }
}
