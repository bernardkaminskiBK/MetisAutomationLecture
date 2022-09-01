package javazaklady.Zadanie_10_3_4;

public class PrvocisloTester {
    public static void main(String[] args) {
        int cislo = 19;

        Prvocislo prvocisla = new Prvocislo(cislo);

        if (prvocisla.zistiPrvocislo()) {
            System.out.print("cislo: " + cislo + " je" + " prvocislo");
            System.out.print(" a je " + prvocisla.getPoradiePrvocisla() + ". v poradi.");
        }

    }
}
