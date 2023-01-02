package academy.metis.javazaklady.lecture2.activity2.Zadanie_2_2_3;

// TODO: dopln dokumentacny komentar
public class Pokladna {

    private double cenaTovarov;
    private double celkovaPrijataHotovost;

    // TODO: dopln dokumentacny komentar
    public Pokladna()
    {
        vynuluj();
    }

    private void vynuluj() {
        cenaTovarov = 0;
        celkovaPrijataHotovost = 0;
    }

    // TODO: dopln dokumentacny komentar
    public void naskenujTovar(double cenaTovaru)
    {
        cenaTovarov = cenaTovarov + cenaTovaru;
    }

    // TODO: dopln dokumentacny komentar
    public void prijmiHotovost(double hotovost)
    {
        celkovaPrijataHotovost += hotovost;
    }

    // TODO: dopln dokumentacny komentar
    public double vratVydavok()
    {
        double vydavok = celkovaPrijataHotovost - cenaTovarov;
        vynuluj();
        return vydavok;
    }
}
