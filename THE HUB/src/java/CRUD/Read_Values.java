/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.DB_Connection;
import common.User_Bean;
public class Read_Values {
public List get_values(){
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	List list=new ArrayList();
	try {
	String querry="select * from events";
	ps=connection.prepareStatement(querry);		
	rs=ps.executeQuery();
	while(rs.next()){
	  User_Bean obj_User_Bean=new User_Bean();
	  System.out.println(rs.getString("id"));
	  System.out.println(rs.getString("title"));
	  System.out.println(rs.getString("start_event"));
	  System.out.println(rs.getString("end_event"));
          System.out.println(rs.getString("description"));
          
	  obj_User_Bean.setid(rs.getString("id"));
          obj_User_Bean.settitle(rs.getString("title"));
	  obj_User_Bean.setstart_event(rs.getString("start_event"));
	  obj_User_Bean.setend_event(rs.getString("end_event"));
          obj_User_Bean.setdescription(rs.getString("description"));
          
	list.add(obj_User_Bean);
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	return list;
	}
}
