package javazaklady.lecture9.activity3.part4;

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
