package javazaklady.lecture8.activity2.zadanie_8_2_3;

public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet1 = new BankovyUcet(1000);
        BankovyUcet ucet2 = new BankovyUcet(2000);
        BankovyUcet ucet3 = new BankovyUcet(3000);
        BankovyUcet ucet4 = new BankovyUcet(4000);

        MnozinaDat mnozinaDat = new MnozinaDat();

        mnozinaDat.pridajPrvok(ucet1);
        mnozinaDat.pridajPrvok(ucet2);
        mnozinaDat.pridajPrvok(ucet3);
        mnozinaDat.pridajPrvok(ucet4);

        Meratelny maxUcetMeratelny = mnozinaDat.getMaximum();
        BankovyUcet maxUcet = (BankovyUcet) maxUcetMeratelny;

        System.out.println("Max ucet: " + maxUcet.getAktualnyZostatok());
        System.out.println("Min ucet: " + mnozinaDat.getMinimum().getMiera());
        System.out.println("Priemerny zostatok: " + mnozinaDat.getPriemer());

        // 2) vytvor mince (meratelne objekty) a pridaj ich do mnoziny dat, nasledne zobraz
        //    statistiky o vsetkych objektoch

        Minca minca1 = new Minca("Dvojeurovka", 2.0);
        Minca minca2 = new Minca("Eurovka", 1.0);
        Minca minca3 = new Minca("Dvatsatcentovka", 0.2);

        mnozinaDat = new MnozinaDat();

        mnozinaDat.pridajPrvok(minca1);
        mnozinaDat.pridajPrvok(minca2);
        mnozinaDat.pridajPrvok(minca3);

        Meratelny maxMincaMeratelny = mnozinaDat.getMaximum();
        Minca maxMinca = (Minca) maxMincaMeratelny;

        System.out.println("Max minca: " + maxMinca.getHodnota());
        System.out.println("min minca: " + mnozinaDat.getMinimum().getMiera());
        System.out.println("Priemerna hodnota mince: " + mnozinaDat.getPriemer());
    }
}
