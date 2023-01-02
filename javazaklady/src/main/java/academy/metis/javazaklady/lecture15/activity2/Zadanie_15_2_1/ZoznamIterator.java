package academy.metis.javazaklady.lecture15.activity2.Zadanie_15_2_1;

public interface ZoznamIterator {

    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}
