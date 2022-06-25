package br.com.Voceeu.Back_End.BD_cont;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bd_cont {
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String connectionUrl = "jdbc:mysql://localhost:3306/bd_geral1";
    private final String userName = "root";
    private final String userPass = "teste";

    private Connection con = null;

    public Bd_cont() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public Connection createConnection() {//criar conquisao
        try {
            con = DriverManager.getConnection(connectionUrl, userName, userPass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void closeConnection() {//sair
        try {
            this.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
