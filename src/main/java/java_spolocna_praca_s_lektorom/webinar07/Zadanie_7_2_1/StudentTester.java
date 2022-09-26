package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_1;

public class StudentTester
{
    public static void main(String[] args)
    {
        Student student1 = new Student(17,"Fero Vysoky", 1.29);
        Student student2 = new Student(18,"Katka Sladka", 1.08);

        vypisInfo(student1);
        vypisInfo(student2);


        // Zmen priemer znamok pre student1 na hodnotu 1.55
        student1.setPriemerZnamok(1.55);

        // zmen priezvisko pre student2 na Katka Bizikova
        student2.setMeno("Katka Bizikova");

        System.out.println();
        vypisInfo(student1);
        vypisInfo(student2);
    }

    private static void vypisInfo(Student student)
    {
        System.out.println("Vek: " + student.getVek());
        System.out.println("Meno: " + student.getMeno());
        System.out.println("Priemer znamok: " + student.getPriemerZnamok());

    }
}
