package javazaklady.Zadanie_3_3_1;

public class PokladnaTester {

    public static void main(String[] args) {
        Pokladna pokladna = new Pokladna();
        pokladna.naskenujTovar(20.55);
        pokladna.prijmyEura(20);
        pokladna.prijmy50Centovky(2);
//        System.out.printf("Vydavok: %5.2f Eur%n", pokladna.vratVydavok());
        System.out.println(pokladna.vratVydavok());
        System.out.println("Ocakavana hodnota: 0.45");
    }

}
