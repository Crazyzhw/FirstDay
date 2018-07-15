package cn.edu360.javase35.day05;

public class ArrayDemo3 {
	public static void main(String[] args) {
		boolean [] arr = new boolean [5];
		arr[0]=true;
		arr[2]=true;
		arr[4]=true;
		print(arr);
		char [] arr1= {'学','大','数','据','到','小','牛'};
		print(arr1);
		
	}
	public static void print (boolean [] arr ) {
		for(int x =0;x<arr.length;x++) {
			if(x!=arr.length-1)
			System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);
		}
		}
		public static void print (char [] arr ) {
			for(int x =0;x<arr.length;x++) {
				System.out.print(arr[x]);
			
		
	}
		}
}

	
