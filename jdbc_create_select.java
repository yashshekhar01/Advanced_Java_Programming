1. Write a program to create a connection with MySQL database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";
        
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        }
    }
}


2. Write a program to select all the records from the table.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";
        String query = "SELECT * FROM employees"; // Replace "employees" with your table name
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            
            System.out.println("Employee Data:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");  // Replace "id" with your column name
                String name = resultSet.getString("name");  // Replace "name" with your column name
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data.");
            e.printStackTrace();
        }
    }
}



