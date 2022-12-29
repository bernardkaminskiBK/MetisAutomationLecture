package javazaklady2.Webinar15.c;

public interface ZoznamIterator {
    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}
