package bankove_ucty;

public class BankoveUctyTester
{
    public static void main(String[] args)
    {
        BeznyUcet ucet = new BeznyUcet(1000);

        ucet.vloz(100);
        ucet.vyber(200);
        ucet.vloz(100);
        ucet.vyber(200);

        System.out.println("Zostatok pred zauctovanim poplatkov: " + ucet.getAktualnyZostatok());
        System.out.println("Ocakvana hodnota: 800");
        ucet.zauctujPoplatky();
        System.out.println("Zostatok po zauctovani poplatkov: " + ucet.getAktualnyZostatok());
        System.out.println("Ocakvana hodnota: 797.8");

        SporiaciUcet sporiaciUcet = new SporiaciUcet(1000,5.0);
        System.out.println("Zostatok na sporiacom ucte pred pripisanim uroku: " + sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakvana hodnota: 1000.0");
        sporiaciUcet.pripisUrok();
        System.out.println("Zostatok na sporiacom ucte po pripisani uroku: " + sporiaciUcet.getAktualnyZostatok());
        System.out.println("Ocakvana hodnota: 1050.0");
    }
}