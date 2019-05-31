/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
public class User_Bean {
	String id;
	private String title;
	private String start_event;
	private String end_event;
	private String description;
	private String organization;

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
	public String getorganization() {
		return organization;
	}
	public void setorganization(String organization) {
		this.organization = organization;
	}
}