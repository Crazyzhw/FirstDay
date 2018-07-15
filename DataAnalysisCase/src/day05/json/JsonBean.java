package day05.json;

public class JsonBean {
	private String movie;
	private int rate;
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int  getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "JsonBean [movie=" + movie + ", rate=" + rate + "]";
	}
	
}
