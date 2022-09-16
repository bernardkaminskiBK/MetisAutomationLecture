package java_spolocna_praca_s_lektorom.webinar15.vlastny_zretazeny_zoznam;

public interface ZoznamIterator {

    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}
