package cn.edu360.javase35.day14;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}
