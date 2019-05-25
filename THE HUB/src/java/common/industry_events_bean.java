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
public class industry_events_bean {
    String id;
	private String title;
	private String start_event;
	private String end_event;
	private String description;
	private String company;

	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getstart_event() {
		return start_event;
	}
	public void setstart_event(String start_event) {
		this.start_event = start_event;
	}
	public String getend_event() {
		return end_event;
	}
	public void setend_event(String end_event) {
		this.end_event = end_event;
	}
        public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}
}
