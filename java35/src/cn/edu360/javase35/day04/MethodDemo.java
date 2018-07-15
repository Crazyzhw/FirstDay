package cn.edu360.javase35.day04;

public class MethodDemo {
 public static void main(String[] args) {
	int result = getMin( 18,9);
	System.out.println(result);
	chengFaBiao();
	cn.edu360.javase35.day02.MethodDemo.draw(8, 7);
	cn.imcore.snake.s1.TestSnake.main(args);
}
 
 
   public static  int  getMin ( int a , int b ) {
	   int min = a>b?b:a;
	   return min;
   }
   private static void  chengFaBiao() {
	   for (int x =1;x<=9;x++) {
		   for (int y =1;y<=x;y++) {
			   System.out.print(y+"x"+x+"="+x*y+"	");
		   }
		   System.out.println();
	   }
   }
}
