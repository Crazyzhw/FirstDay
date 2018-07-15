package cn.edu360.javase35.day04;
/*定义一个方法，传入两个int 参数a，b
返回   b个a  的字符串*/
public class MethodTest3 {

	public static void main(String[] args) {
		String result = splice(5,4);
		System.out.println(result);
	}
		public static String splice(int a,int b){
			String result ="";
			for (int x=1;x<=b;x++) {
				result = result +a;
				
			}
			return result;
		}
}
