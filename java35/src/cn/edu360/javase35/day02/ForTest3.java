package cn.edu360.javase35.day02;
//3-2,5-3,7-2
public class ForTest3 {

	public static void main(String[] args) {
			int a=0;
			int b=0;
			int c = 0;
			int d = 0;
			int e =0 ;
			int f = 0;
			int g = 0;
			for (int i =1;i<1001;i++)
			{
				if (i % 3 == 2) {
					a++;
				}
				if(i % 5==3) {
					b++;
				}
				if (i%3==2&&i%5==3) {
					d++;
				}
				if(i %  7==2) {
					c++;
				}
				if (i%3==2&&i%7==2) {
					e++;
				}
				if (i%5==3&&i%7==2) {
					f++;
				}
				if (i%3==2&&i%5==3&&i%7==2) {
					g++;
				}
			}
			System.out.println("对3整除余2的个数是"+a);
			System.out.println("对5整除余3的个数是"+b);
			System.out.println("对7整除余2的个数是"+c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
	}

}
