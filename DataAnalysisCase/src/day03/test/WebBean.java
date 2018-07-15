package day03.test;

public class WebBean {
	private long ipStart;
	private long ipEnd;
	private String pro;
	public long getIpStrat() {
		return ipStart;
	}
	public void setIpStrat(long ipStrat) {
		this.ipStart = ipStrat;
	}
	public long getIpEnd() {
		return ipEnd;
	}
	public void setIpEnd(long ipEnd) {
		this.ipEnd = ipEnd;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "WebBean [ipStrat=" + ipStart + ", ipEnd=" + ipEnd + ", pro=" + pro + "]";
	}
	/**
	 * @param ipStrat
	 * @param ipEnd
	 * @param pro
	 */
	public void set (long ipStrat, long ipEnd, String pro) {
		this.ipStart = ipStrat;
		this.ipEnd = ipEnd;
		this.pro = pro;
	}
	
	
}
