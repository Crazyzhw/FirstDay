package day01;

import java.math.BigDecimal;

public class Average {
	private String uid;
	private BigDecimal aver;
	private  double aver1;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public BigDecimal getAver() {
		return aver;
	}
	public void setAver(BigDecimal aver) {
		this.aver = aver;
	}

	public void set(String uid, BigDecimal aver) {
		this.uid = uid;
		this.aver = aver;
	}
	public double getAver1() {
		return aver1;
	}
	public void setAver1(double aver1) {
		this.aver1 = aver1;
	}
	@Override
	public String toString() {
		return "Average [uid=" + uid + ", aver=" + aver+ "]";
	}
	public void set2(String uid, double aver1) {
		this.uid = uid;
		this.aver1 = aver1;
	}
	
	
}
