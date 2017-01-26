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
import model.qwryModel;

/**
 *
 * @author oem
 */
public class qwrydao {
    public void insert(qwryModel ojcm){
        Connection con = dbconnection.makeconnection();
        
  String sql="insert into Comment(cmid,name,phone,message)values('"+ojcm.getCmid()+"','"+ojcm.getName()+"','"+ojcm.getPhone()+"','"+ojcm.getMessage()+"')";
  try{
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            
            
        }catch(Exception ex){
            
        }
    }
    public static ArrayList<qwryModel> select(){
		ArrayList<qwryModel> al = new ArrayList<qwryModel>();
		
		Connection con = (Connection) dbconnection.makeconnection();
		String sql= "select * from Comment";
		try{
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				al.add(new qwryModel(rs.getInt("cmid"),rs.getString("name"),rs.getString("phone"),rs.getString("message")));
			}
		}
		catch(Exception ex){
			
		}
		return al;
		
	}

    
}
