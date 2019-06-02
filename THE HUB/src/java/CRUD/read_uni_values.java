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
import common.uni_bean;

/**
 *
 * @author Sudesh Fernandezz
 */
public class read_uni_values {
    public List get_uni_values(){
        
        DB_Connection obj_DB_Connection=new DB_Connection();
	    Connection connection=obj_DB_Connection.get_connection();
	    PreparedStatement ps=null;
	    ResultSet rs=null;
	    List list=new ArrayList();
        
        try {
	String querry="select * from universities";
	ps=connection.prepareStatement(querry);		
	rs=ps.executeQuery();
	while(rs.next()){

      uni_bean obj_uni_bean=new uni_bean();
      
	  System.out.println(rs.getString("id"));
	  System.out.println(rs.getString("uni_name"));
	  System.out.println(rs.getString("description"));
	  System.out.println(rs.getString("stud_count"));
	  System.out.println(rs.getString("uni_logo"));
          System.out.println(rs.getString("uni_img_1"));
          System.out.println(rs.getString("uni_img_2"));
          
      obj_uni_bean.setid(rs.getString("id"));
      obj_uni_bean.set_uni_name(rs.getString("uni_name"));
      obj_uni_bean.set_discription(rs.getString("description"));
      obj_uni_bean.set_stud_count(rs.getString("stud_count"));
      obj_uni_bean.set_uni_logo(rs.getString("uni_logo"));
      obj_uni_bean.set_uni_img_1(rs.getString("uni_img_1"));
      obj_uni_bean.set_uni_img_2(rs.getString("uni_img_2"));
       
          
	list.add(obj_uni_bean);
	}
        }catch (Exception e) {
	System.out.println(e);
	}
	return list;
        
    }
}
