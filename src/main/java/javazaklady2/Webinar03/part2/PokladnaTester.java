package javazaklady2.Webinar03.part2;

public class PokladnaTester {

    public static void main(String[] args) {
        Pokladna pokladna = new Pokladna();
        pokladna.naskenujTovar(10.00);
        pokladna.naskenujTovar(10.55);
        pokladna.prijmyEura(20);
        pokladna.prijmy50Centovky(2);
        System.out.printf("Vydavok: %.2f", pokladna.vratVydavok());
        System.out.println("\nPocet naskenovanych tovarov: " + pokladna.getPocetTovarov());
        pokladna.resetPocetTovarov();
    }

}
