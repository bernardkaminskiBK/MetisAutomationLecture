package javazaklady.lecture10.activity2.Zadanie_10_2_2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class KomponentaJFileChooserDemo
{
    public static void main(String[] args)
    {
        //JFileChooser navigator = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        JFileChooser navigator = new JFileChooser();

        navigator.setFileSelectionMode(JFileChooser.FILES_ONLY);
        navigator.setDialogTitle("Vyber nejaky obrazok");
        navigator.setMultiSelectionEnabled(true);
        navigator.setAcceptAllFileFilterUsed(false);        // zapne filter *.* (moznoje to default hodnota)

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Obrazky jpg a png", "jpg", "png");
        navigator.addChoosableFileFilter(filter);

        int stav = navigator.showOpenDialog(null);

        if (stav == JFileChooser.APPROVE_OPTION)
        {
            File[] oznaceneSubory = navigator.getSelectedFiles();

            for (File subor : oznaceneSubory)
            {
                System.out.println("Zvolil si subor: " + subor.getAbsolutePath());
            }
        }
    }
}
