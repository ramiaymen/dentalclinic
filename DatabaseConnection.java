/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dentalclinic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/CabinetDb";
        String user = "user1";
        String password = "user";
        
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to database!");
            // Do something with the connection
        } catch (SQLException e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
        }
    }
}