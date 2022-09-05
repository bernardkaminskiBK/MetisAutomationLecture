package javazaklady.Zadanie_9_3_3;

import java.awt.*;

public class Stvorec extends Rectangle
{
    /**
     * instancne premenne
     */
    int x;
    int y;
    int dlzkaStrany;
    int plocha;

    /**
     * vytvara stvorec
     * @param x osa x
     * @param y osa y
     * @param dlzkaStrany dlzka strany stvorca
     */
    public Stvorec(int x, int y, int dlzkaStrany)
    {
        this.x = x;
        this.y = y;
        this.dlzkaStrany = dlzkaStrany;
    }

    /**
     * nastavuje dlzku strany stvorca a umiestnenie stvorca
     * @return vracia udaje o stvorci
     */
    public String toString()
    {
        setSize(dlzkaStrany, dlzkaStrany);
        setLocation(x - 15, y - 15);

        return super.toString();
    }

    /**
     * vypocita plochu stvorca
     * @return vracia plochu stvorca
     */
    public int getPlocha()
    {
        return plocha = super.height * super.width;
    }
}
