package academy.metis.javazaklady.lecture9.activity3.part4;

public class OsobaTester {
    public static void main(String[] args)
    {
        Osoba osoba = new Osoba("Igor Kovac", 1988);
        Student student = new Student("Emil Horvath", 1999, "Kartografia");
        Instruktor instruktor = new Instruktor("Jan Valdner", 1969, 2500);
        System.out.println(osoba.toString());
        System.out.println("Ocakavana hodnota: Osoba: Igor Kovac, roknarodenia = 1988");
        System.out.println(student.toString());
        System.out.println("Ocakavana hodnota: Student: Osoba: Emil Horvath, roknarodenia = 1999, odbor = Kartografia");
        System.out.println(instruktor.toString());
        System.out.println("Ocakavana hodnota: Zamestnanec = Osoba: Jan Valdner, roknarodenia = 1969, plat = 2500.0");
    }
}
