package org.example;

import java.sql.*;

public class Lab10 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "!Zazaza080a";
            Connection con = DriverManager.getConnection(URL,username,password);
            Statement statement = con.createStatement();
            String sql = "update students set email = 'xxx@gmail.com' where studentID = '11111'";
            statement.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
