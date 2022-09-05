package javazaklady.Zadanie_8_3_1;

public class SimulaciaHoduKockou
{
    public static void main(String[] args)
    {

        final int POCET_POKUSOV = 10;
        MnozinaDat hodyKockou = new MnozinaDat();

        for (int i = 1; i <= POCET_POKUSOV; i++)
        {
            Kocka kocka = new Kocka(6);
            double cislo = kocka.hod();
            hodyKockou.pridaj(kocka);
            System.out.print(cislo + " ");
        }

        System.out.println();
        System.out.println("Priemerny hod kockou: " + hodyKockou.getPriemer());
    }
}
