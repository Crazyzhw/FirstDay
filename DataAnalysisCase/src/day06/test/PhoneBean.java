package day06.test;
//prefix	phone	province	city	isp	post_code	city_code	area_code
public class PhoneBean {
	private String num;
	private	String province;
	private String city;
	private String isp;

	public void set(String num, String province, String city, String isp) {
		this.num = num;
		this.province = province;
		this.city = city;
		this.isp = isp;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIsp() {
		return isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}
	@Override
	public String toString() {
		return "PhoneBean [num=" + num + ", province=" + province + ", city=" + city + ", isp=" + isp + "]";
	}
	
}
