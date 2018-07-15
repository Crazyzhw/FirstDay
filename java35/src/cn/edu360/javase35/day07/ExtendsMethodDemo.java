package cn.edu360.javase35.day07;

public class ExtendsMethodDemo {
	public static void main(String[] args) {
		FatherClass f = new FatherClass ();
		f.work(12f,6);
	}
}


class  FatherClass {
	public void work (int num,double s) {
		System.out.println("我一周要上班"+num+"天，"+"每天"+s+"小时");
	}
	public void work (double s,int num) {
		System.out.println("我一周要上班"+num+"天");
	}
	
	
	
}

class Son  extends FatherClass {
	@Override
	public void work (double s,int num) {
		System.out.println("我Ba一周要上班"+num+"天,"+"每天"+s+"小时");
	}
	public void work (int num,double s) {
		System.out.println("我ba一周要上班"+num+"天");
	}
}
