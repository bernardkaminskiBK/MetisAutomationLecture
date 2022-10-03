package javazaklady.Webinar09.Zadanie_9_3_4;

public class Student extends Osoba {
    private String odbor;

    public Student(String meno, int rokNarodenia, String odbor)
    {
        super(meno, rokNarodenia);
        this.odbor = odbor;
    }

    public String toString()
    {
        return "Student: " + super.toString() + ", odbor = " + odbor;
    }
}
