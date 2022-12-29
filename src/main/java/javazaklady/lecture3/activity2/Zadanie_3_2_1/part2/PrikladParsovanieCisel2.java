package javazaklady.lecture3.activity2.Zadanie_3_2_1.part2;

public class PrikladParsovanieCisel2 {
    public static void main(String[] args) {
        // Double -> String
        double cislo = 1.23456;

        String cisloText = "" + cislo;
        String cisloText2 = String.valueOf(cislo);

        System.out.println(cisloText);
        System.out.println(cisloText2);

        // StringBuffer  - pouzivame na vytvaranie velkeho retazce z tisisov mensich casti
        //               - velmi efektivne
        //               - vieme triedu pouzit v ramci viacvlakonoveho prostredia
        StringBuffer buffer = new StringBuffer();
        buffer.append("text1");
        buffer.append("text2");
        buffer.append("text3");
        buffer.append("text4");

        String vystup1 = buffer.toString();
        System.out.println(vystup1);
        // StringBuilder - pouzivame na vytvaranie velkeho retazce z tisisov mensich casti
        //               - velmi efektivne
        //               - vieme triedu pouzit len v ramci jednovlaknoveho prostredia
        StringBuilder builder = new StringBuilder();

        builder.append("nejaky text1");
        builder.append("nejaky text2");
        builder.append("nejaky text3");
        builder.append("nejaky text4");
        builder.append(cislo);

        String vystup2 = builder.toString();
        System.out.println(vystup2);
    }
}

