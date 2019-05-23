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
import common.industry_events_bean;

/**
 *
 * @author Sudesh Fernandezz
 */
public class industry_events {
    
    public List get_com_events(){
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	List list=new ArrayList();
	try {	
	String querry="select * from events where type= 'uni'";
	ps=connection.prepareStatement(querry);		
	rs=ps.executeQuery();
	while(rs.next()){
	  industry_events_bean obj_industry_events=new industry_events_bean();
	  System.out.println(rs.getString("id"));
	  System.out.println(rs.getString("title"));
	  System.out.println(rs.getString("start_event"));
	  System.out.println(rs.getString("end_event"));
          System.out.println(rs.getString("description"));
          
	  obj_industry_events.setid(rs.getString("id"));
          obj_industry_events.settitle(rs.getString("title"));
	  obj_industry_events.setstart_event(rs.getString("start_event"));
	  obj_industry_events.setend_event(rs.getString("end_event"));
          obj_industry_events.setdescription(rs.getString("description"));
          
	list.add(obj_industry_events);
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	return list;
	}
}
