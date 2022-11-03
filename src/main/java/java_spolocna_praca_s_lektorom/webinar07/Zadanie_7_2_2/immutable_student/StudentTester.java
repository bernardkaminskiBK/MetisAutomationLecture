package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_2.immutable_student;

public class StudentTester
{
    public static void main(String[] args)
    {
        ImmutableStudent student1 = new ImmutableStudent(17,"Fero Vysoky", 1.29);
        ImmutableStudent student2 = new ImmutableStudent(18,"Katka Sladka", 1.08);

        vypisInfo(student1);
        vypisInfo(student2);
    }


    private static void vypisInfo(ImmutableStudent student)
    {
        System.out.println("Vek: " + student.getVek());
        System.out.println("Meno: " + student.getMeno());
        System.out.println("Priemer znamok: " + student.getPriemerZnamok());
    }
}
