package profun.Zadanie_2_3_1;

import java.util.Scanner;

public class NasobokCisla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zadaj prvé číslo: ");
        int cislo1 = input.nextInt();

        System.out.println("Zadaj druhé číslo: ");
        int cislo2 = input.nextInt();

        if (overCislo(cislo1,cislo2)==true){
            System.out.println(cislo1 + " je deliteľné číslom " + cislo2 + " výsledok je: " + cislo1/cislo2);
        }else{
            System.out.println(cislo1 + " nie je deliteľné číslom " + cislo2);
        }

    }


    public static boolean overCislo(int cislo1,int cislo2) {

       boolean vysledok;

        if(cislo1%cislo2 == 0){
            vysledok = true;
        }else{
            vysledok = false;
        }

        return vysledok;
    }
}




