package metis.academy.profun.Lekcia06.part1;

public class SucetParnychCisel {
    public static void main(String[] args) {
        System.out.println("Sucet parnych cisel v intervale 2 az 30: " + vypocitajSucetParnychCisel());

    }

    public static int vypocitajSucetParnychCisel() {
        int sucetParnych = 0;
        int i;
        for (i = 2; i <= 30; i++) {
            if (i % 2 == 0) {
                sucetParnych = sucetParnych + i;
            }
        }
        return sucetParnych;
    }

}
