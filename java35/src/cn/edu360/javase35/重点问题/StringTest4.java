package cn.edu360.javase35.重点问题;
/**
 * 实现计算字符串中某个字符串出现的次数
 *
 */
public class StringTest4 {
	public static void main(String[] args) {
			String s  = "中国是我的祖国，我爱中国，中国是我家";
			for(int i =0;i<s.length()-1;i++) {
				if (s.charAt(i)=='中') {
					if (s.charAt(i+1)=='国') {
						System.out.print("中国"+"	");
					}
				}
			}
			System.out.println();
			System.out.println("---------------------");
			for(int i = 0;i<s.length()-1;i++) {
				if ((""+s.charAt(i)+s.charAt(i+1)).compareTo("中国"+"")==0) {
					System.out.print("中国"+"	");
				}
			}
			System.out.println("---------------------");
			String key = "中国";
			int count = getCount(  s,key);
			System.out.println(count);
			
			
			
		}
	public static int  getCount(String s ,String key) {
			int count = 0;
			int index =0;
			while((index = s.indexOf(key,index))!=-1){
				count ++;
				index+=key.length();
			}
			return  count;
		
	}
}
