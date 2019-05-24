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
import common.user_bean2;
/**
 *
 * @author Sudesh Fernandezz
 */
public class read_industry_values {
    public List get_industry_values(){
        
        DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	List list=new ArrayList();
        
        try {
	String querry="select * from industries";
	ps=connection.prepareStatement(querry);		
	rs=ps.executeQuery();
	while(rs.next()){
	  user_bean2 obj_user_bean2=new user_bean2();
	  System.out.println(rs.getString("id"));
	  System.out.println(rs.getString("industry_name"));
	  System.out.println(rs.getString("description"));
		System.out.println(rs.getString("emp_count"));
		System.out.println(rs.getBlob("com_pic"));
          
	  obj_user_bean2.set_industry_id(rs.getString("id"));
          obj_user_bean2.set_industry_name(rs.getString("industry_name"));
	  obj_user_bean2.set_idiscription(rs.getString("description"));
		obj_user_bean2.set_emp_count(rs.getString("emp_count"));
		obj_user_bean2.set_com_pic(rs.getBlob("com_pic"));
          
	list.add(obj_user_bean2);
	}
        }catch (Exception e) {
	System.out.println(e);
	}
	return list;
        
    }
    
}
