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
import common.industry_query_bean;

/**
 *
 * @author Sudesh Fernandezz
 */
public class read_industry_query {

    public List get_scenarios() {

        DB_Connection obj_DB_Connection = new DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        List scenarios = new ArrayList();

        try {
            String querry = "select * from scenarios";
            ps = connection.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {

                industry_query_bean obj_industry_query_bean = new industry_query_bean();

                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("query_title"));
                System.out.println(rs.getString("description"));
                System.out.println(rs.getString("company_name"));
                System.out.println(rs.getString("date"));

                obj_industry_query_bean.setid(rs.getString("id"));
                obj_industry_query_bean.setquery_title(rs.getString("query_title"));
                obj_industry_query_bean.setdescription(rs.getString("description"));
                obj_industry_query_bean.setcompany_name(rs.getString("company_name"));
                obj_industry_query_bean.setdate(rs.getString("date"));

                scenarios.add(obj_industry_query_bean);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return scenarios;

    }
}
