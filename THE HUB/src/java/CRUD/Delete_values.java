/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import common.DB_Connection;
import common.User_Bean;
public class Delete_values {
public void delete_value(String id){
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	try {
	 String querry="delete from events where id=?";
	 ps=connection.prepareStatement(querry);		
	 ps.setString(1, id);;
	 ps.executeUpdate();
	} catch (Exception e) {
	 System.out.println(e);
	}
	}
}
