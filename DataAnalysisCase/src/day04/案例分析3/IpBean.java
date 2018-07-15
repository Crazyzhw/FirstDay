package day04.案例分析3;

public class IpBean {
	private long  startIp;
	private long  endIp;
	private String pro;
	private String city;
	private String operator;
	public void set(long startIp, long endIp, String pro, String city, String operator) {
		this.startIp = startIp;
		this.endIp = endIp;
		this.pro = pro;
		this.city = city;
		this.operator = operator;
	}
	@Override
	public String toString() {
		return "IpBean [startIp=" + startIp + ", endIp=" + endIp + ", pro=" + pro + ", city=" + city + ", operator="
				+ operator + "]";
	}
	public long getStartIp() {
		return startIp;
	}
	public void setStartIp(long startIp) {
		this.startIp = startIp;
	}
	public long getEndIp() {
		return endIp;
	}
	public void setEndIp(long endIp) {
		this.endIp = endIp;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	 
}
