package org.example;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;
import java.util.List;

public class LocalDBConnection {
    public static void main(String[] args) {
        // Local SQL connection info
        String url = "jdbc:mysql://localhost:3306/TestTable";
        String userName = "root";
        String password = "secretpassword";

        // Create a JDBI instance
        Jdbi jdbi = Jdbi.create(url, userName, password);
        // Use try-with-resources to automatically close the handle
        try (Handle handle = jdbi.open()) {
            //DB operations
            handle.execute("CREATE TABLE IF NOT EXISTS person (id serial PRIMARY KEY, name VARCHAR(100), last_name VARCHAR(100), age INT)");
            System.out.println("Table 'person' created successfully.");
            // Check if the values exist in the table before inserting & insert items if not exist
            if (!isRecordExist(handle, "John", "Doe", 32)) {
                handle.execute("INSERT INTO person (name, last_name, age) VALUES (?, ?, ?)", "John", "Doe", 32);
            }
            if (!isRecordExist(handle, "Jane", "Doe", 35)) {
                handle.execute("INSERT INTO person (name, last_name, age) VALUES (?, ?, ?)", "Jane", "Doe", 35);
            }
            if (!isRecordExist(handle, "Zeynep", "Girtine", 30)) {
                handle.execute("INSERT INTO person (name, last_name, age) VALUES (?, ?, ?)", "Zeynep", "Girtine", 30);
            }
            if (!isRecordExist(handle, "May", "Filler", 25)) {
                handle.execute("INSERT INTO person (name, last_name, age) VALUES (?, ?, ?)", "May", "Filler", 25);
            }
            if (!isRecordExist(handle, "Pauline", "Philbert", 25)) {
                handle.execute("INSERT INTO person (name, last_name, age) VALUES (?, ?, ?)", "Pauline", "Philbert", 25);
            }

            System.out.println("Items inserted into the table.");

            //Executing simple queries
            String result = handle.createQuery("SELECT name FROM person WHERE id = :id")
                    .bind("id", "39")
                    .mapTo(String.class)
                    .one();
            System.out.println("The name of the person with this id is:" + " " + result);

            String result2 = handle.createQuery("SELECT age FROM person WHERE id = :id")
                    .bind("id", "40")
                    .mapTo(String.class)
                    .one();
            System.out.println("The age of the person with this id is:" + " " + result2);

        } catch (StatementException e) {
            e.printStackTrace();
        }
    }

    // Method to check if a record exists in the table
    private static boolean isRecordExist(Handle handle, String name, String lastName, int age) {
        List<String> result = handle.createQuery("SELECT name FROM person WHERE name = :name AND last_name = :lastName AND age = :age")
                .bind("name", name)
                .bind("lastName", lastName)
                .bind("age", age)
                .mapTo(String.class)
                .list();
        return !result.isEmpty();
    }
}

