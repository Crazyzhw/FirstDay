package cn.edu360.javase35.day13;

public class ChangedParamDemo {

	public static void main(String[] args) {
		System.out.println(getSum(1,3,4,6,7,9));
	}
	public static int getSum(int k,int... i) {
		int sum = 0;
		if (i!=null&&i.length>0) {
			for (int j : i) {
				sum+=j;
			}
		}
		return sum;
	}
}
