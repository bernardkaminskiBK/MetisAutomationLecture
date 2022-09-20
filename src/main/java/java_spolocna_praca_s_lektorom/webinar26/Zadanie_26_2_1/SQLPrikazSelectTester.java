package java_spolocna_praca_s_lektorom.webinar26.Zadanie_26_2_1;

import java.sql.*;

public class SQLPrikazSelectTester {

    public static void main(String[] args) {
        // 1. krok - nadviazanie spojenia s databazovym serverom
        try (Connection spojenie = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/knihkupectvo",
                "tester",
                "tester");

             // 2. krok - vytvor zo spojenia "prikaz"
             Statement prikaz = spojenie.createStatement();
             )
        {
            // 3. krok - vytvor sql dotaz na databazovy server
            String prikazSelect = "select nazov, cena, mnozstvo from knihy";

            System.out.println("SQL prikaz je: " + prikazSelect);

            ResultSet vysledky = prikaz.executeQuery(prikazSelect);

            // 4. krok - sprocesuj vysledky
            System.out.println("Zaznamy tabulky knihy su: ");
            int pocetRiadkov = 0;

            while (vysledky.next()) {
                String nazov = vysledky.getString("nazov");
                double cena = vysledky.getDouble("cena");
                int mnozstvo = vysledky.getInt("mnozstvo");

                System.out.printf("%-50s%8.2f%4d\n", nazov, cena, mnozstvo);
                pocetRiadkov++;
            }

            System.out.println("\nBolo nacitanych " + pocetRiadkov + " zaznamov");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
