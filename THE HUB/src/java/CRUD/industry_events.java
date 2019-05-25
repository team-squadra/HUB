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
	List com_events=new ArrayList();
	try {	
	String querry="select * from events where type= 'com'";
	ps=connection.prepareStatement(querry);		
	rs=ps.executeQuery();
	while(rs.next()){
		industry_events_bean obj_industry_events_bean=new industry_events_bean();
	  System.out.println(rs.getString("id"));
	  System.out.println(rs.getString("title"));
	  System.out.println(rs.getString("start_event"));
	  System.out.println(rs.getString("end_event"));
		System.out.println(rs.getString("description"));
		System.out.println(rs.getString("company"));
          
					obj_industry_events_bean.setid(rs.getString("id"));
          obj_industry_events_bean.settitle(rs.getString("title"));
					obj_industry_events_bean.setstart_event(rs.getString("start_event"));
					obj_industry_events_bean.setend_event(rs.getString("end_event"));
					obj_industry_events_bean.setdescription(rs.getString("description"));
					obj_industry_events_bean.setcompany(rs.getString("company"));
          
	com_events.add(obj_industry_events_bean);
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	return com_events;
	}
}
