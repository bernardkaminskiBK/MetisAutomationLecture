package javazaklady2.Webinar15.part3;

public interface ZoznamIterator {
    void pridaj(Object prvok);

    Object dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(Object prvok);
}
