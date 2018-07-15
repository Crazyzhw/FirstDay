package day04.mytest;

public class Message {
	private String movie;
	private  int rate;
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Message [movie=" + movie + ", rate=" + rate + "]";
	}
	public void set(String movie, int rate) {
		this.movie = movie;
		this.rate = rate;
	}
	
	
	
}