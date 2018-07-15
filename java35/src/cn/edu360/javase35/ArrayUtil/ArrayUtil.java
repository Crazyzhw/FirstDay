package cn.edu360.javase35.ArrayUtil;
public class ArrayUtil {
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr.length ==1){
				System.out.println("["+arr[0]+"]");
			}else if(i==0){
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	
	
	public static void printMaxAndMin(int[] arr){
		//1.创建一个变量，用来存储最大值
		int max = arr[0];
		int min = arr[0];
		
		//2.用这个变量和数组中的每一个元素做比较，如果数组中元素比这个变量的值大，就把数组中的元素赋值给这个变量
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		//打印最大值
		System.out.println("最大值是："+max);
		System.out.println("最小值是："+min);
	}
	/**
	 * @param arr   你要查找的数组
	 * @param num	你要查找的数
	 * @return	返回查找的这个数的索引，如果该数在数组中不存在，则返回-1
	 */
	public static int indexOf(int[] arr,int num){
		int location = -1;
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]==num){
				location = i;
				break;
			}
		}
		return location;
	}
	
	/**
	 * 选择排序
	 * @param arr	要排序的数组
	 * @param isAsc		是否升序  
	 * desc: 降序
	 */
	public static void selectSort(int[]arr,boolean isAsc){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(isAsc){
					if(arr[i]>arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}else{
					if(arr[i]<arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}
	
	public static void bubbleSort(int[]arr,boolean isAsc){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(isAsc){
					if(arr[j]>arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}else{
					if(arr[j]<arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
					
				}
			}
		}
	}
	public static int binarySearch(int[]arr,int num){
		int start = 0;
		int end = arr.length-1;
		int location = -1;
		while(start<=end){
			int middleIndex = (start+end)/2;
			int middle = arr[middleIndex];
			if(arr[0]<arr[arr.length-1]){//升序
				if(middle>num){
					end = middleIndex -1;
				}else if(middle == num){
					System.out.println("索引为："+middleIndex);
					//location = middleIndex;
					//break;
					return middleIndex;
				}else{
					start = middleIndex+1;
				}
			}else{//降序
				if(middle>num){
					start = middleIndex+1;
				}else if(middle == num){
					System.out.println("索引为："+middleIndex);
					//location = middleIndex;
					//break;
					return middleIndex;
				}else{
					end = middleIndex-1;
				}
			}
		}
		return -1;
	}
}
