/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Hanna
 */
public class DB {
    private static Connection c;
    private static Statement s;
    private static ResultSet res;
    
    public static void connect() throws ClassNotFoundException, SQLException{
        c=null;
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/taxipark","root","root");
        s=c.createStatement();
    }

}
