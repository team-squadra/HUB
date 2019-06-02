/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.Blob;

/**
 *
 * @author Sudesh Fernandezz
 */
public class uni_bean {
    String id;
    private String uni_name;
    private String discription;
    private String stud_count;
     private String uni_logo;
     private String uni_img_1;
     private String uni_img_2;

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

    public String get_uni_logo(){
        return uni_logo;
    }
    public void set_uni_logo(String uni_logo){
        this.uni_logo = uni_logo;
    }
     public String get_uni_img_1(){
        return uni_img_1;
    }
    public void set_uni_img_1(String uni_img_1){
        this.uni_img_1 = uni_img_1;
    }
    public String get_uni_img_2(){
        return uni_img_2;
    }
    public void set_uni_img_2(String uni_img_2){
        this.uni_img_2 = uni_img_2;
    }
   
}
