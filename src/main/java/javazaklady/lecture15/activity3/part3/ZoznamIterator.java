package javazaklady.lecture15.activity3.part3;

public interface ZoznamIterator {
    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}
