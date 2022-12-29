package javazaklady2.Webinar04.b;

public class Karta {
    public String karta;

    public Karta(String karta) {
        this.karta = karta;
    }

    public String getPopis() {
        String popisKarty = "";
        char typKarty = karta.charAt(0);
        char farbaKarty = karta.charAt(1);
        //char farbaKarty2 = karta.charAt(2);

        if (karta.length() == 3) {
            if (karta.startsWith("10")) {
                popisKarty = "Desiatka ";
            } else {
                popisKarty = "Neznama karta";

            }
            char farbaKarty2 = karta.charAt(2);

            popisKarty = getFarbaKarty(popisKarty, farbaKarty2);

            return popisKarty;
        } else if (karta.length() == 2) {


            switch (typKarty) {
                case '2' -> popisKarty = "Dvojka ";
                case '3' -> popisKarty = "Trojka ";
                case '4' -> popisKarty = "Štvorka ";
                case '5' -> popisKarty = "Päťka ";
                case '6' -> popisKarty = "Šestka ";
                case '7' -> popisKarty = "Sedmička ";
                case '8' -> popisKarty = "Osmička ";
                case '9' -> popisKarty = "Deviatka ";
                case 'K' -> popisKarty += "Kráľ ";
                case 'H' -> popisKarty += "Horník ";
                case 'D' -> popisKarty += "Dolník ";
                case 'E' -> popisKarty += "Eso ";
                default -> popisKarty = "Neznama karta";

            }
            popisKarty = getFarbaKarty(popisKarty, farbaKarty);

        }
        return popisKarty;
    }

    private String getFarbaKarty(String popisKarty, char farbaKarty2) {
        if (!popisKarty.equals("Neznama karta")) {
            switch (farbaKarty2) {
                case 'G' -> popisKarty += "Guľová/é/ý";
                case 'M' -> popisKarty += "Maková/é/ý";
                case 'Z' -> popisKarty += "Zelená/é/ý";
                case 'Č' -> popisKarty += "Červená/é/ý";
                default -> popisKarty = "Neznama karta";
            }
        }
        return popisKarty;
    }

}



