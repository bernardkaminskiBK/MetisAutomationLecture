package academy.metis.javazaklady.lecture10.activity2.Zadanie_10_2_1;

import java.util.Arrays;



public class ArgumentyPrikazovehoRiadkaDemo {


    public static void main(String[] args) {
        System.out.println("Argumenty 1: " + Arrays.deepToString(args));



        System.out.println("Argumenty 2: ");
        for (String argument : args) {
            System.out.println(argument);
        }



        System.out.println("Argumenty 3: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

