package profun.Lekcia10.c;

public class PolePorovnavac {

    public static void main(String[] args) {
        int[] prvePole = {1, 2, 3, 4, 5};
        int[] druhePole = {1, 2, 3, 4, 5};

        if (suPoliaZhodne(prvePole, druhePole)) {
            System.out.println("Polia su rovnake");
        } else {
            System.out.println("Polia nie su rovnake");
        }
    }

    public static boolean suPoliaZhodne(int[] prvePole, int[] druhePole) {
        if (prvePole.length != druhePole.length) {
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
