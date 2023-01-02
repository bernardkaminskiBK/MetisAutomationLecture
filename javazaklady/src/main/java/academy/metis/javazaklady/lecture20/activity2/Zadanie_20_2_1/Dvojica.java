package academy.metis.javazaklady.lecture20.activity2.Zadanie_20_2_1;

public class Dvojica<T, S>
{
    private T prvy;
    private S druhy;

    public Dvojica(T prvy, S druhy)
    {
        this.prvy = prvy;
        this.druhy = druhy;
    }

    public T getPrvy()
    {
        return prvy;
    }

    public S getDruhy()
    {
        return druhy;
    }
}
