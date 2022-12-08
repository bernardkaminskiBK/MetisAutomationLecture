package java_spolocna_praca_s_lektorom.webinar26.nepouzivat_stara_verzia.Zadanie_26_2_2;

import java.sql.*;

    public class SQLPrikazUpdateTester
    {
        public static void main(String[] args)
        {
            // 1. Nadviazanie spojenia s databazovym serverom
            try(Connection spojenie = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/knihkupectvo",
                    "tester",
                    "tester");

                // 2. Vytvor zo spojenia "prikaz"
                Statement prikaz = spojenie.createStatement())
            {
                // 3. Vytvor sql dopyt na databazovy server
                String prikazUpdate = "update knihy set cena = cena * 0.8 where id <= 1002";

                System.out.println("SQL prikaz je: " + prikazUpdate);

                int pocetZmenenychZaznamov = prikaz.executeUpdate(prikazUpdate);

                System.out.println("Pocet zmenenych zaznamov: " + pocetZmenenychZaznamov);

                String prikazSelect = "select nazov, cena, mnozstvo from knihy";

                System.out.println("SQL prikaz je: " + prikazSelect);

                ResultSet vysledky = prikaz.executeQuery(prikazSelect);

                // 4. Sprocesuj vysledky zo servera
                System.out.println("Zaznamy tabulky knihy su: ");
                int pocetRiadkov = 0;

                while (vysledky.next())
                {
                    String nazov = vysledky.getString("nazov");
                    double cena = vysledky.getDouble("cena");
                    int mnozstvo = vysledky.getInt("mnozstvo");

                    System.out.printf("%-50s%8.2f%4d\n", nazov, cena, mnozstvo);
                    pocetRiadkov++;
                }

                System.out.println("\nBolo nacitanych " + pocetRiadkov + " zaznamov");
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

