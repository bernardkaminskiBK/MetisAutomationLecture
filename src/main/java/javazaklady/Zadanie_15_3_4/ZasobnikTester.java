package javazaklady.Zadanie_15_3_4;

public class ZasobnikTester {
    public static void main(String[] args) {
        Zasobnik zasobnik = new Zasobnik();

        for (int i = 1; i <= 1000; i++){
            zasobnik.vloz(i);
        }
        for (int i = 1; i <= 500; i ++){
            zasobnik.vyber();
        }

        System.out.println(zasobnik.vyber());
        System.out.println("Ocakavna hodnota: 500");

        System.out.println(zasobnik.prvokNaVrchole());
        System.out.println("Ocakavana hodnota: 499");

        System.out.println(zasobnik.getVelkost());
        System.out.println("Ocakavana hodnota: 499");

        while (!zasobnik.jePrazdny()){
            zasobnik.vyber();
        }

        System.out.println(zasobnik.getVelkost());
        System.out.println("Ocakavna hodnota: 0");

    }
}
