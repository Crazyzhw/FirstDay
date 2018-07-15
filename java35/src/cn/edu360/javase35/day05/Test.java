package cn.edu360.javase35.day05;

import java.util.Scanner;

	class  Test1{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int a  = sc.nextInt(); 
int result =1;
for (int x=1;x<=a;x++){
result = result*x;
} 
	System.out.print(a+"的阶乘是"+result);
}
	}


