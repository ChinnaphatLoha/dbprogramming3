package org.example;

import java.sql.*;

public class Lab9 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "!Zazaza080a";
            Connection con = DriverManager.getConnection(URL,username,password);
            Statement statement = con.createStatement();
            String sql = "insert into students (studentID,firstname,lastname,email,deptID)" +
                    "values('11111','aaaa','bbbb','aaaa@gmail.com','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
