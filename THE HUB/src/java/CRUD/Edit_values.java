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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Edit_values {

    public User_Bean get_value_of_user(String id) {
        DB_Connection obj_DB_Connection = new DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        User_Bean obj_User_Bean = new User_Bean();
        try {
            String querry = "select * from events where id=?";
            ps = connection.prepareStatement(querry);
            ps.setString(1, id);;
            rs = ps.executeQuery();

            try {
                DateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
                Date d = f.parse("29/8/2011 11:16:12 AM");
                DateFormat date = new SimpleDateFormat("MM/dd/yyyy");
                DateFormat time = new SimpleDateFormat("hh:mm:ss a");

                String dat = date.format(d);
                String tim = time.format(d);

                System.out.println(dat);
                System.out.println(tim);

                //   System.out.println("Date: " + date.format(d));
                //   System.out.println("Time: " + time.format(d));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            while (rs.next()) {
                obj_User_Bean.setid(rs.getString("id"));
                obj_User_Bean.settitle(rs.getString("title"));
                obj_User_Bean.setstart_event(rs.getString("start_event"));
                obj_User_Bean.setend_event(rs.getString("end_event"));
                obj_User_Bean.setdescription(rs.getString("description"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return obj_User_Bean;
    }

    public void edit_user(User_Bean obj_User_Bean) {

        DB_Connection obj_DB_Connection = new DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        try {
            String querry = "update events set title=?,start_event=?,end_event=?,description=? where id=?";
            ps = connection.prepareStatement(querry);
            ps.setString(1, obj_User_Bean.gettitle());
            ps.setString(2, obj_User_Bean.getstart_event());
            ps.setString(3, obj_User_Bean.getend_event());
            ps.setString(4, obj_User_Bean.getdescription());
            ps.setString(5, obj_User_Bean.getid());
            //ps.setString(5, id);;
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
