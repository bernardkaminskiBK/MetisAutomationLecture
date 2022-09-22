package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_2;

public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        Minca minca1 = new Minca("Eurovka", 1.0);
        Minca minca2 = new Minca("Centovka", 0.01);
        Minca minca3 = new Minca("Patcentovka", 0.05);

        MnozinaDat mnozinaDat = new MnozinaDat();

        mnozinaDat.pridajPrvok(minca1);
        mnozinaDat.pridajPrvok(minca2);
        mnozinaDat.pridajPrvok(minca3);

        System.out.println("max minca: " + mnozinaDat.getMaximum().getHodnota());
        System.out.println("min minca: " + mnozinaDat.getMinimum().getHodnota());
        System.out.println("Priemerna hodnota mince: " + mnozinaDat.getPriemer());
    }
}
