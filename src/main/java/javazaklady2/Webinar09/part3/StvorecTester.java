package javazaklady2.Webinar09.part3;

public class StvorecTester
{
    public static void main(String[] args)
    {
        Stvorec stvorec = new Stvorec(10, 20, 30);
        System.out.println(stvorec);
        System.out.println("Ocakavana hodnota: Stvorec[x=-5,y=5,width=30,height=30]");
        System.out.println("Plocha: " + stvorec.getPlocha());
        System.out.println("Ocakavana hodnota: 900");
    }
}
