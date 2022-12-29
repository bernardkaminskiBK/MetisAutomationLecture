package javazaklady.lecture5.activity3.part1;

public class KonvertorMeny
{
    /**
     * instancne premenne
     */
    double kurz, ciastka;
    double dolare, kurzNum, ciastkaNum;

    /**
     * zadany kurz a suma na zmenu meny
     * @param aktualnyKurz zadany kurz
     * @param suma ciastka na zmenu meny
     */
    public KonvertorMeny(double aktualnyKurz, double suma)
    {
        kurz = aktualnyKurz;
        ciastka = suma;
    }

    /**
     * vypocita a vrati na vystup prepocitanu sumu podla zadaneho kurzu
     * @return vrati sumu
     */
    public double getDolare()
    {
        kurzNum = kurz;
        ciastkaNum = ciastka;

        dolare = kurzNum * ciastkaNum;
        return dolare;
    }
}
