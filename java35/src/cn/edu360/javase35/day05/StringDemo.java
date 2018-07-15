package cn.edu360.javase35.day05;

public class StringDemo {
	public static void main(String[] args){
    String str = "hello world !!!";
    String stra = str.replaceAll("o","_");//用新的字符串全部替换掉旧的字符串
    String strb = str.replaceFirst("o","_");//替换首个满足条件的内容
    System.out.println(stra);
    System.out.println(strb);
    
    String str1 = "hello world !!!";
    String result [] = str1.split(" ",2);
    for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
        
    }
	}
}
