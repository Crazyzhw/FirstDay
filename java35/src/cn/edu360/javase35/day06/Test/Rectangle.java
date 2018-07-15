package cn.edu360.javase35.day06.Test;

public class Rectangle {
	double  length;
	double  width;
	public Rectangle (double length ,double  width) {
		this.length =length;
		this.width= width;
	}
	public double perimeter() {
		return 2 * (length+width);
	}
	public double area () {
		return  length*width;
	}
	public Rectangle () {} 
	public double perimeter (int length ,int width) {
		return  2*(length+width);
	}
	public double area (int length ,int width) {
		return  length*width;
	}
	
}
