package java_spolocna_praca_s_lektorom.webinar15.vlastny_zretazeny_zoznam.Zadanie_15_2_1;

public interface ZoznamIterator {

    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}