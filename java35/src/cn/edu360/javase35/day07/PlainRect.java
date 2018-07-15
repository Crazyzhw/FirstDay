package cn.edu360.javase35.day07;

public class PlainRect {
	public static void main(String[] args) {
		RectangleDemo r = new RectangleDemo(10, 10, 20, 10);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		boolean result =r.isInside(25.5, 13);
		System.out.println(result);
	}
}
