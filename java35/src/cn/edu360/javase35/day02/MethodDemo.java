package cn.edu360.javase35.day02;

public class MethodDemo {
	public static void main(String[] args) {
		draw(5,6);
		System.out.println("--------------------------");
		draw(10,9);
	}
    public static void draw(int row,int col) {
    	for (int x=0;x<row;x++) {
    		for (int y=0;y<col;y++) {
    		System.out.print("*");
    		}
    		System.out.println();
    		}	
  
    }
}
