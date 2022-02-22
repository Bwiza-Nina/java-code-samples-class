package com.jbdc;

import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String url = "jdbc:mysql://localhost:3306/classwork?characterEncoding=utf8&useConfigs=maxPerformance";
        String username = "root";
        String password = "573lau573";
        Connection conn = null;
        Statement statement = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            if(conn != null){
                statement = conn.createStatement();
                statement.execute("CREATE TABLE IF NOT EXISTS person(id INT PRIMARY KEY AUTO_INCREMENT, firstName VARCHAR(255), lastName VARCHAR(255), gender VARCHAR(255))");
                int result = statement.executeUpdate("INSERT INTO person(firstName, lastName, gender) VALUES('Bwiza', 'Nina', 'Female')");
                ResultSet rs = statement.executeQuery("SELECT * FROM person WHERE id=1");
                while(rs.next()){
                    System.out.println("ID: "+rs.getString(2));
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
