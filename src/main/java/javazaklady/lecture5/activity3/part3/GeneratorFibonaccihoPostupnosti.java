package javazaklady.lecture5.activity3.part3;

public class GeneratorFibonaccihoPostupnosti {
    public int cislo;
    public GeneratorFibonaccihoPostupnosti(int cislo) {
        this.cislo = cislo;
    }

    public int dalsieCislo() {
        if (cislo <= 1) {
            return cislo;
        }

        int prveCislo = 0, druheCislo = 1;
        for (int i = 0; i < cislo - 1; i++) {
            int fibcislo = prveCislo + druheCislo;
            prveCislo = druheCislo;
            druheCislo = fibcislo;
        }
        return druheCislo;
    }

}

