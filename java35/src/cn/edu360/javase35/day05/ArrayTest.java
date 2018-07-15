package cn.edu360.javase35.day05;
/**
 * 水仙花：
	打印出100-999所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
	其各位数字立方和等于该数本身
	123    i
	个位： i%10
	十位:  i/10%10
	百位:  i/100
 */
public class ArrayTest {
public static void main(String[] args) {
  for (int i =100;i<1000;i++) {
	  int a=  i%10;
	  int b= (i/10)%10;
	  int c= i/100;
	  if (i==(a*a*a+b*b*b+c*c*c)) {
		  System.out.println(i);
	  }
  }
}
}
