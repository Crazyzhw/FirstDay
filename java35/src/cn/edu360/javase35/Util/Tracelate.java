package cn.edu360.javase35.Util;

public class Tracelate {
	public static String  tracelate(int a ,int x ,int y) {
		String [] chs= {"0","1","2","3","4","5",
							"6","7","8","9","a",
							"b","c","d","e","f"};
		String t ="";
		while(a!=0){	
		int temp = a & x;
			 t= chs[temp]+t;
			a=a>>>y;
		}
		return  t;
	}
	public static String toHex (int a) {
		return "0x"+tracelate(a,15,4); 
	}
	public static String toOctal (int a) {
		return "0"+tracelate(a,7,3); 
	}
	public static String toBin (int a) {
		return "0b"+tracelate(a,1,1); 
	}
}
