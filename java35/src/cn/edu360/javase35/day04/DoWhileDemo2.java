package cn.edu360.javase35.day04;

public class DoWhileDemo2 {

	public static void main(String[] args) {
		int sum = 0;
		int i =1;
		do {
			sum+=i;
			i++;
		}
		while (i<11);
		System.out.println("sum="+sum);
	sum = 0;
	i = 0;
	int sum1=0;
	do  {
		if (i %2 ==0) {
			sum+=i;
		}else {
			sum1+=i;
		}
		i++;
	}
	while (i<101);
	System.out.println(sum);
	System.out.println(sum1);
	}
}
