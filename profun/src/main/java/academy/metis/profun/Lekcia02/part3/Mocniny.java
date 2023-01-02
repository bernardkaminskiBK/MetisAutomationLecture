package academy.metis.profun.Lekcia02.part3;

public class Mocniny {
    public static void main(String[] args) {

       System.out.println(vytvorTabulkuMocnin());
    }

    public static String vytvorTabulkuMocnin() {
        String vysledok =  "cislo" + "\t\t" + "druha mocnina" + "\t\t"+ "tretia mocnina" + "\n";

        for (int i = 1; i < 11; i++) {
          vysledok +=  i + "\t\t\t"+ i * i + "\t\t\t\t\t" + i * i * i + "\n";
        }

        return vysledok;
    }
}
