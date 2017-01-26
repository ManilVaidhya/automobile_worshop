/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.bikeModel;


/**
 *
 * @author oem
 */
public class bikedao {
    public static ArrayList<bikeModel> select(){
      ArrayList<bikeModel> al = new ArrayList<bikeModel>();
      
        Connection con = (Connection) dbconnection.makeconnection();
        String sql= "select * from Bike";
        
        try{
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				al.add(new bikeModel(rs.getInt("bikeid"),rs.getString("name"),rs.getString("price"),rs.getString("description"),rs.getString("image1"),rs.getString("image2"),rs.getString("image3")));
			}
		}
		catch(Exception ex){
			
		}
                
      
      return al;
    }
    
    public static ArrayList<bikeModel> select_by_id(String cid){
        
        ArrayList<bikeModel> al = new ArrayList<bikeModel>();
        
        Connection con = (Connection) dbconnection.makeconnection();
        String sql="select * from Bike where bikeid="+cid;
         try{
              Statement st = con.createStatement();
              ResultSet rs =  st.executeQuery(sql); 
              while(rs.next()){
                  al.add(new bikeModel(rs.getInt("bikeid"),rs.getString("name"),rs.getString("price"),rs.getString("description"),rs.getString("image1"),rs.getString("image2"),rs.getString("image3")));
              }
              
            }
            catch(Exception e){
                System.out.println("not retriveviing"+e);
            }
         return al;
    }
    
}
