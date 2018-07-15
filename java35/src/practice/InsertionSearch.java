package practice;

import java.util.Arrays;

//插入排序
public class InsertionSearch {
	public static void main(String[] args) {
	int [] arr = {5,54,4,54,8,7,57};	
	for (int i=1;i<arr.length ;i++) {
		int x = arr[i];
		for(int j=i-1;j>=0;j--) {
			if(arr[j]>x) {
				arr[j+1]=arr[j];
			}else {
				arr[j+1]=x;
				break;
			}
			if(j==0) {
				arr[0]=x;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println((char)('B'+'8'-'3'));
	}
}
	
