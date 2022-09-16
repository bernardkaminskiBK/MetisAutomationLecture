package java_spolocna_praca_s_lektorom.webinar03.Zadanie_3_2_1;

public class PrikladParsovanieCisel2 {
    public static void main(String[] args) {
        // Double -> String
        double cislo = 1.23456;

        String cisloText = "" + cislo;
        String cisloText2 = String.valueOf(cislo);

        // StringBuffer  - pouzivame na vytvaranie velkeho retazce z tisisov mensich casti
        //               - velmi efektivne
        //               - vieme triedu pouzit v ramci viacvlakonoveho prostredia
        StringBuffer buffer = new StringBuffer();

        // StringBuilder - pouzivame na vytvaranie velkeho retazce z tisisov mensich casti
        //               - velmi efektivne
        //               - vieme triedu pouzit len v ramci jednovlaknoveho prostredia
        StringBuilder builder = new StringBuilder();
        builder.append(cislo);
        builder.append("najeky text");
        builder.append("najeky text");
        builder.append("najeky text");
        builder.append("najeky text");
        builder.append("najeky text");
        String vystup = builder.toString();
        System.out.println(vystup);
    }
}
