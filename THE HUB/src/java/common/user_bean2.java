/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author Sudesh Fernandezz
 */
public class user_bean2 {
    String id;
    private String industry_name;
    private String idiscription;
    private String emp_count;
    private String com_pic;
    
    public String get_industry_id(){
        return id;
    }
    public void set_industry_id(String id){
        this.id = id;
    }
    public String get_industry_name(){
        return industry_name;
    }
    public void set_industry_name(String industry_name){
        this.industry_name = industry_name;
    }
    public String get_idiscription(){
        return idiscription;
    }
     public void set_idiscription(String idiscription){
        this.idiscription = idiscription;
    }
    public String get_emp_count(){
        return emp_count;
    }
    public void set_emp_count(String emp_count){
        this.emp_count = emp_count;
    }
    public String get_com_pic(){
        return emp_count;
    }
    public void set_com_pic(String com_pic){
        this.com_pic = com_pic;
    }
}
