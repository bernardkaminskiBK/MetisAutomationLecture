package metis.academy.profun.Lekcia02.part1;

import java.util.Scanner;

public class NasobokCisla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zadaj prvé číslo: ");
        int cislo1 = input.nextInt();

        System.out.println("Zadaj druhé číslo: ");
        int cislo2 = input.nextInt();

        if (cislo1 % cislo2 == 0) {
            System.out.println(cislo1 + " je deliteľné číslom " + cislo2 + " výsledok je: " + cislo1 / cislo2);
        } else {
            System.out.println(cislo1 + " nie je deliteľné číslom " + cislo2);
        }
    }

}




