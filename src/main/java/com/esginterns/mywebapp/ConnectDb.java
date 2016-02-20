package com.esginterns.mywebapp;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by User on 2/19/2016.
 */
public class ConnectDb {
    private static final String URL="jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME="manuk";
    private static final String PASSWORD="pass";
    private Connection connection;
    ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Driver driver=new FabricMySQLDriver();
            //DriverManager.registerDriver(driver);
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
