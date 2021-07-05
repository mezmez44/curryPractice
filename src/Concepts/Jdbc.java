package Concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

public static void main(String[]args) throws SQLException {
    String url ="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    String userName="root";
    String password="";
    Connection conn = DriverManager.getConnection(url,userName,password );

    Statement stmt = conn.createStatement();

    String s= "INSERT INTO STUDENT VALUE (106,'Milo',10)";
    stmt.execute(s);

    stmt.close();

    System.out.println("query executed");





}
}
