package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_3;

public interface ZoznamIterator<E>
{
    void pridaj(E prvok);

    E dalsi();

    void zmaz();

    boolean existujeDalsiPrvok();

    void nastav(E prvok);
}
