package org.example;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.PreparedBatch;

public class RemoteDBConnection {
    public static void main(String[] args) {
            // Remote SQL connection info
            String server = "sql11.freemysqlhosting.net";
            String dbName = "sql11681397";
            String username = "sql11681397";
            String password = "Thw7enmQPz";
            int port = 3306;

            // JDBC URL for connecting to the remote database
            String dbURL = "jdbc:mysql://" + server + ":" + port + "/" + dbName;

            // Create a Jdbi instance and connect to the database
            Jdbi jdbi = Jdbi.create(dbURL, username, password);
            try (Handle handle = jdbi.open()) {
                // Create the table "ad_soyad" if it doesn't exist
                handle.execute("CREATE TABLE IF NOT EXISTS ad_soyad (id serial primary key, name VARCHAR(100), surname VARCHAR(100))");
                System.out.println("Table 'ad_soyad' created successfully.");

                // Insert 3 records into the table using a prepared batch
                PreparedBatch batch = handle.prepareBatch("INSERT INTO ad_soyad  (name, surname) VALUES (?, ?)");
                batch.add("Mauro", "Icardi");
                batch.add("Wilfred", "Zaha");
                batch.add("Michael", "Jordan");
                batch.execute();
                System.out.println("Items added successfully.");

                // Delete one record from the table using a prepared statement
                handle.createUpdate("DELETE FROM ad_soyad WHERE id = :id")
                        .bind("id", 3)  // Delete the record with the provided ID
                        .execute();
                System.out.println("Item deleted successfully.");

                // Update a record in the table using a prepared statement
                handle.createUpdate("UPDATE ad_soyad SET name = :name WHERE id = :id")
                        .bind("name", "William")
                        .bind("id", 2)  // Update the record with the provided ID
                        .execute();
                System.out.println("Item updated successfully.");
            }
        }
    }




