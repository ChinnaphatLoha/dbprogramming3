package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            String URL = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "!Zazaza080a";
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(URL,username,password);
            System.out.println("Database Connected");
            Statement statement = con.createStatement();
            String sql = "Select * from students";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)
                        + " " + resultSet.getString(3) + " " + resultSet.getString(4));
            }
        } catch (ClassNotFoundException | SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}