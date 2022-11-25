package java_spolocna_praca_s_lektorom.webinar26.webinar26.Zadanie_26_2_1_NovaVerzia;

import java.sql.*;

public class SQLPrikatSelectInsertUpdateDelete {

    public static void main(String[] args) {
        // 1.krok - nadviazanie spojenia s databazovym serverom
        try(Connection spojenie = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/knihkupectvo",
                "tester",
                "root");
            // 2.krok - vytvor zo spojenia "prikaz"
            Statement prikaz = spojenie.createStatement())
        {
            // prikaz delete - odstran knihy s id > 3000 a mensim  < 4000
            String prikazDelete = "delete from knihy where id >= 3000 AND id <= 4000";
            System.out.println("SQL prikaz je: " + prikazDelete);

            int pocetZmenenychZaznamov = prikaz.executeUpdate(prikazDelete);
            System.out.println("Pocet odstranenych zaznamov: " + pocetZmenenychZaznamov);

            // pridanie jedneho zaznamu (knihy)
            String prikazInsert = "insert into knihy value (3001, 'Java pre zelenacov', 'Peter Vysoky', 4.99, 10)";
            System.out.println("SQL prikaz je: " + prikazInsert);
            pocetZmenenychZaznamov = prikaz.executeUpdate(prikazInsert);

            System.out.println("Pocet pridanych zaznamov: " + pocetZmenenychZaznamov);

            // pridanie viacerych zaznamov (viac knih)
            prikazInsert = "insert into knihy values (3002, 'Python pre zelenacov', 'Peter Vysoky', 4.99, 20)," +
                    "(3003, 'C# pre zelenacov', 'Peter Vysoky', 4.99, 20)";
            System.out.println("SQL prikaz je: " + prikazInsert);
            pocetZmenenychZaznamov = prikaz.executeUpdate(prikazInsert);

            // pridanie neuplneho zaznamu -> je potrebne vymenovat stlpce (id, nazov, autor) a namapovat spravne udaje na spravne stlpce
            prikazInsert = "insert into knihy (id, nazov, autor) values (3004,'C++ pre zelenacov', 'Peter Vysoky')";
            System.out.println("SQL prikaz je: " + prikazInsert);
            pocetZmenenychZaznamov = prikaz.executeUpdate(prikazInsert);

            // 2. Vytvor sql dopyt na databazovy server
            String prikazUpdate = "update knihy set cena = cena * 0.8 where id > 1005";

            System.out.println("SQL prikaz je: " + prikazUpdate);

            pocetZmenenychZaznamov = prikaz.executeUpdate(prikazUpdate);

            System.out.println("Pocet zmenenych zaznamov: " + pocetZmenenychZaznamov);


            // 3. krok - vytvor sql dotaz na databazovy server
            String prikazSelect = "select nazov, cena, mnozstvo from knihy";

            System.out.println("SQL prikaz je: " + prikazSelect);

            ResultSet vysledky = prikaz.executeQuery(prikazSelect);

            //4. krok - sprocesuj vysledky
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

