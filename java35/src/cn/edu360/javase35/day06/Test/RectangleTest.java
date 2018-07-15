package cn.edu360.javase35.day06.Test;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		double p1 =r1.perimeter(30,29);
		double a1 =r1.area(30,29);
		System.out.println(p1);
		System.out.println(a1);
		Rectangle r2 = new Rectangle (30,29);
		double p2 =r2.perimeter();
		double a2 =r2.area();
		System.out.println(p2);
		System.out.println(a2);
	}
}
