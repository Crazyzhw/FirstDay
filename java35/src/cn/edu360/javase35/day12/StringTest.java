package cn.edu360.javase35.day12;
/**
 * 获取两个字符串中最长的相同子字符串
 * s=xxxsxscscsdsfsa;
 * s1=xsecsexscsdwdad ;
 * 
 *
 */
public class StringTest {

	public static void main(String[] args) {
		String 	s="1325215445454845";
		String s1="21321543246545455454545453465424";
		System.out.println(getMax(s, s1));
			
	}
	
	
	public  static String getMax(String s,String s1) {
		String long1,short1;
		long1 = s.length()>s1.length()?s:s1;
		short1= s.equals(long1)?s1:s;
		for (int x=0;x<short1.length();x++) {
			for(int y=0,z=short1.length()-x;z<=short1.length();y++,z++) {
				String temp = short1.substring(y, z);
//				System.out.println(temp);
				if (long1.contains(temp)) {
					return temp;
				}
			}
		}
		return null;
	}

}
