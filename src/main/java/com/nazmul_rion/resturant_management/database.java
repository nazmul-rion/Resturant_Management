/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nazmul_rion.resturant_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rionr
 */
public class database {
    
    
      public static Connection  con = null;
    public static void  connectdb()
    {
       try {
            String url = "jdbc:mysql://localhost:3306/restaurant?userTimezone=true&serverTimezone=UTC";
            String username = "root";
            String password = "";
           
           con= DriverManager.getConnection(url, username, password);
            if (con == null) 
                    JOptionPane.showMessageDialog(null,"Database connection is not succesfull");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }     
}
    
    
}
