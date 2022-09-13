package javazaklady.Zadanie_15_3_3;

public interface ZoznamIterator {
    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}
