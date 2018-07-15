package cn.edu360.javase35.day10.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int [] arr=new int [8];
		System.out.println(getElement(null,-2));
		
	}
	public static int   getElement(int arr[],int index) {
		if (arr==null) {
			throw   new NullPointerException("数组实体不存在");
		}
		
		if (index <-1||index>=arr.length) {
			throw   new ArrayIndexOutOfBoundsException(index+"数组角标不存在");
		}
		return arr[index];
	}

}
