package javazaklady2.Webinar09.d;

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
