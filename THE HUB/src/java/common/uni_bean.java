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
public class uni_bean {
    String id;
    private String uni_name;
    private String discription;
    private String stud_count;

    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id = id;
    }
    public String get_uni_name(){
        return uni_name;
    }
    public void set_uni_name(String uni_name){
        this.uni_name = uni_name;
    }
    public String get_discription(){
        return discription;
    }
     public void set_discription(String discription){
        this.discription = discription;
    }
    public String get_stud_count(){
        return stud_count;
    }
    public void set_stud_count(String stud_count){
        this.stud_count = stud_count;
    }
}
