package practice;

public class PackageClass {
	public static void main(String[] args) {
		Character c= new Character('我');
		char ca = c.charValue();
		//当数值在byte的范围内时，相同的值装箱不会产生新的对象。
		Integer i1 = Integer.valueOf(127);
		Integer i2 = Integer.valueOf(127);
		Integer i3 =Integer.valueOf(128);
		Integer i4 =Integer.valueOf(128);
		System.out.println(i1==i2);//true
		System.out.println(i3==i4);//false
	}
}
