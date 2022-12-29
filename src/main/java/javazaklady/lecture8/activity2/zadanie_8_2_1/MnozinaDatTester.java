package javazaklady.lecture8.activity2.zadanie_8_2_1;

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

        System.out.println("Max ucet: " + mnozinaDat.getMaximum().getAktualnyZostatok());
        System.out.println("Min ucet: " + mnozinaDat.getMinimum().getAktualnyZostatok());
        System.out.println("Priemerny zostatok: " + mnozinaDat.getPriemer());
    }
}
