package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MnozinaDatTest
{
    //test synchronizacie s GitHub
    @ParameterizedTest
    @CsvSource(value = {"Eurovka,1.0", "Centovka,0.01", "Patcentovka,0.05"})
    void mincaTest(String nazov, double hodnota)
    {
        Minca minca = new Minca(nazov, hodnota);
        MnozinaDat mnozinaDat = new MnozinaDat();
        mnozinaDat.pridajPrvok(minca);
        mnozinaDat.pridajPrvok(minca);
        mnozinaDat.pridajPrvok(minca);
        double actualResult = mnozinaDat.getMaximum().getHodnota();
        System.out.println(actualResult);

    }
}
