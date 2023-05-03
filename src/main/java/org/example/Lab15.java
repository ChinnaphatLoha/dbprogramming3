package org.example;

import java.sql.*;

public class Lab15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "!Zazaza080a";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            Statement statement = con.createStatement();
            String sql = "Select * from students";
            ResultSet result = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = result.getMetaData();

            for (int i = 1 ; i < rsMetaData.getColumnCount() ; i++){
                System.out.println(rsMetaData.getColumnName(i));
            }

            while (result.next()) {
                for (int i= 1; i<= rsMetaData.getColumnCount(); i++)
                    System.out.printf("%-12s\t", result.getObject(i));
                System.out.println();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
