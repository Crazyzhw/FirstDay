package cn.edu360.javase35.day05;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String result =toHex(26);
		System.out.println(result);
	}
	
	
	public static String  toHex(int a ){
		char [] arr =new char [8];
		int index=arr.length;
		for (int x=0;a!=0&&x<8;x++) {
			int num = a&15;
			if (num<10) {
			arr[--index]=(char)(num+'0');
			}else {
			arr[--index]=(char)(num-10+'a')	;
			}
			a=a>>>4;
		}
		System.out.println(index);
		return "0x"+toString (arr,index);
		/*for (int x =0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}*/
	}
	public static String toString (char [] arr,int index) {
		String result="";
		for(int x=index;x<arr.length;x++) {
			 result = result+arr[x];
		}
		return result;
		
	}

}
