package javazaklady2.Webinar14.part1;

import java.util.Comparator;

public class ReverznyPorovnavacMinci implements Comparator<Minca>
{
    @Override
    public int compare(Minca o1, Minca o2)
    {
        if (o1.getHodnota() < o2.getHodnota())
        {
            return 1;
        }
        else if (o1.getHodnota() > o2.getHodnota())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
