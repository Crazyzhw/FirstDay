package day07.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SessionBean {
	private String session;
	private String ip;
	private Date date;
	private String url;
	private int id;
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void set(String session, String ip, Date date, String url,int id) {
		this.session = session;
		this.ip = ip;
		this.date = date;
		this.url = url;
		this.id = id;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "SessionBean [session=" + session + ", ip=" + ip + ", date=" +sdf.format(date)+ ", url=" + url +"id="+id+ "]";
	}
	
	
}
