package cn.edu360.javase35.day04;

import java.util.Scanner;
/**		自动售货机
		需求：
		屏幕显示：请选择您要购买的商品编号1：雪碧(3元) 2：矿泉水(2元) 3:红牛(6元)
		用户输入编号后，屏幕显示请输入金额，用户输入金额
		结果：
		如果购买成功输出：您购买的商品*，价格*，实收*，找零*，谢谢惠顾！
		如果购买失败输出：对不起您的金额不足！*/
public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择您要购买的商品编号"
				+ "1：雪碧(3元) 2：矿泉水(2元) 3:红牛(6元)");
		int a=sc.nextInt();
		System.out.println("请输入金额");
		int money = sc.nextInt();
		int money1= money(a);
		int  result= isEqual(money,money1);
		if(result ==(-1)) {
		System.out.println("对不起您的金额不足！");
	}else {
		System.out.println(inPut(a)+"，实收"+money+"元，"+"找零"+result+"元，谢谢惠顾");
	}
	}
	
	public static  int  money (int  a ) {
		int money ;
		switch (a) {
		case 1:
			money =3;
			return money;
		case 2:
			money =2;
			return money;
		case 3:
			money=6;
			return money;
			default:
				return 0;
			}
	}
	public static int   isEqual(int  a ,int  b) {
		if (a>=b) {
			return a-b;
		}else {
			return -1;
	}
	}
	public static String  inPut (int a ) {
		String s ;
		switch (a) {
		case 1:
		s="您购买的商品雪碧，价格3元";
			return s;
		case 2:
		s="您购买的商品矿泉水，价格2元";
			return s;
		case 3:
			s="您购买的商品红牛，价格6元";
			return s;
			default:
				return "";
			}
	}
}
