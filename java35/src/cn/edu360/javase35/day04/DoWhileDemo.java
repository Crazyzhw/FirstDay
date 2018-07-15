package cn.edu360.javase35.day04;

public class DoWhileDemo {
public static void main(String[] args) {
	int x =10;
	do {
		System.out.println("nihao");
	x++;
	}
	while(x<10);
	double a =8;
	double  b =8;
	while (a<20) {
		a=a*1.25;
		b=b*(1+25.0/100);//两个int类型的相除结果还是int
		System.out.println(a);
		System.out.println(b);
	}
	int c =0;
	System.out.println(b=8*(1+25/100));
}
}
