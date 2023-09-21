package employeedata;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeData {
    public static Connection ConnectDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Joey\\IntelliJProjects\\EmployeeData\\employee.db");
            JOptionPane.showMessageDialog(null, "Connection established");
            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection failed! Error: " + e);
            return null;
        }
    }
}
