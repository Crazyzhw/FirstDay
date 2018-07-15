package cn.edu360.javase35.Util;

public class Search {
	public static int search (int [] arr,int x ) {
		int index =-1;
		for (int a =0;a<arr.length;a++) {
			if (arr[a]==x) {
				index = a;
				return index;
			}
		}
		return index;
	}
	
		/*public static void main(String [] args){
		String str1= new String("abc");
		String str2 = new String("abc");
		String str3=str1;
		if(str1.equals(str2)){
		System.out.println("true");
		}else{
		System.out.println("false");
		}
		if(str1==str3){
		System.out.println("true");
		}else{
		System.out.println("false");
		}
		}*/

		
		
	
}
