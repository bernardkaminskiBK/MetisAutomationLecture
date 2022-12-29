package javazaklady2.Webinar10.part1;

public class ZobrazovacTrojuholnikov {
    public int velkost;
    public String znak;
    int i, j;


    public ZobrazovacTrojuholnikov(int velkost, String znak) {
        this.velkost = velkost;
        this.znak = znak;
    }

    public String getVzorTrojuholnik1() {
        String result = "";

        for (i = 0; i < velkost; i++) {
            for (j = 0; j <= i; j++) {
                result += znak + " ";
            }
            result += "\n";
        }

        return result;
    }

    public String getVzorTrojuholnik2() {
        String result = "";

        for (i = 0; i < velkost; i++) {
            for (j = 2 * (velkost - i); j >= 0; j--) {
                result += " ";
            }
            for (j = 0; j <= i; j++) {
                result += znak + " ";
            }
            result += "\n";
        }
        return result;
    }

    public String getVzorTrojuholnik3() {
        String result = "";

        for (i = velkost; i >= 1; --i) {
            for (j = 1; j <= i; ++j) {
                result += znak + " ";
            }
            result += "\n";
        }
        return result;
    }

    public String getVzorTrojuholnik4() {
        String result = "";

        for (int i = 1; i <= velkost; i++) {
            for (int j = 1; j <= i; j++) {
                result += " " + " ";
            }
            for (int k = velkost; k >= i; k--) {
                result += znak + " ";
            }
            result += "\n";
        }
        return result;
    }

}
