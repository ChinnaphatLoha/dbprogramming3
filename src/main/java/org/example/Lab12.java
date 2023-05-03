package org.example;

import java.sql.*;

public class Lab12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "!Zazaza080a";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            String sql = "insert into students (studentID,firstname,lastname,email,deptID)" +
                    "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "11111");
            preparedStatement.setString(2, "Jack");
            preparedStatement.setString(3, "Ryan");
            preparedStatement.setString(4, "jack.rya@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
