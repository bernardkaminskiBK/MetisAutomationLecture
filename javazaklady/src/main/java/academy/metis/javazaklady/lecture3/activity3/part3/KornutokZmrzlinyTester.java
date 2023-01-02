package academy.metis.javazaklady.lecture3.activity3.part3;

public class KornutokZmrzlinyTester {

    public static void main(String[] args)
    {
        KornutokZmrzliny kornutokZmrzliny = new KornutokZmrzliny(5, 1);
        System.out.println("Objem kornutka: " + kornutokZmrzliny.getObjem());
        System.out.println("Ocakavana hodnota objemu: 5.235987755982988");
        System.out.println("Povrch kornutka: " + kornutokZmrzliny.getPovrch());
        System.out.println("Ocakavana hodnota povrchu: 16.01904224441409");
    }

}
