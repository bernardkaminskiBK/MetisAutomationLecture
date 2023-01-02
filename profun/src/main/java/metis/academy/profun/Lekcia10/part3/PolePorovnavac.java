package metis.academy.profun.Lekcia10.part3;

public class PolePorovnavac {

    public static void main(String[] args) {
        int[] prvePole = {1, 2, 3, 4, 5};
        int[] druhePole = {1, 2, 3, 4, 5};

        int dlzkaPrvehoPola = prvePole.length;
        int dlzkaDruhehoPola = druhePole.length;

        if (suPoliaZhodne(prvePole, dlzkaPrvehoPola, druhePole, dlzkaDruhehoPola)) {
            System.out.println("Polia su rovnake");
        } else {
            System.out.println("Polia nie su rovnake");
        }
    }

    public static boolean suPoliaZhodne(int[] prvePole, int dlzkaPrvehoPola, int[] druhePole, int dlzkaDruhehoPola) {
        if (dlzkaDruhehoPola != dlzkaPrvehoPola) {
            return false;
        }

        for (int i = 0; i < prvePole.length; i++)
        {
            if (prvePole[i] != druhePole[i])
            {
                return false;
            }
        }
        return true;
    }

}
//
//public class PolePorovnavac {
//
//    public static void main(String[] args) {
//        //TODO: doplnit...
//    }
//
//    public static boolean suPoliaZhodne(int[] prvePole, int dlzkaPrvehoPola, int[] druhePole, int dlzkaDruhehoPola) {
//        //TODO: doplnit...
//        return //TODO: doplnit...;
//    }
//
//}
