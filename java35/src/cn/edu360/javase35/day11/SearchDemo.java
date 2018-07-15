package cn.edu360.javase35.day11;

public class SearchDemo {
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,9,78,98};
		int num =78;
		System.out.println(indexOf(arr,0));
		
	}

public static int  indexOf(int arr[],int num) {
	int start=0;
	int end=arr.length-1;
	int mid =0;

while(start<=end) {
	mid = (start +end)/2;
	if (arr[mid]<num) {
		start = mid+1;
	}else if (arr[mid]>num){
		end = mid-1;
	}else {
		return mid;
	}
}
	return -1;
}
}