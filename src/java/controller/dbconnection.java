/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class dbconnection {
    public static Connection makeconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            }catch(Exception ex){
                System.out.println("Driver not loaded"+ex);
            }
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/Automobile","root","manil");
        }catch(Exception ex){
            System.out.println("Not Connected to database"+ex);
        }
        return con;
    }
}
