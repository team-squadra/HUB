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
public class industry_query_bean {
    String id;
	private String query_title;
	private String description;
	private String company_name;
	private String date;

    public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
    }
    public String getquery_title() {
		return query_title;
	}
	public void setquery_title(String query_title) {
		this.query_title = query_title;
    }
    public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getcompany_name() {
		return company_name;
	}
	public void setcompany_name(String company_name) {
		this.company_name = company_name;
    }
    public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
}
