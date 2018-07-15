package cn.edu360.javase35.day16;

public class JoinDemo {

	public static void main(String[] args) {
		Test1 t1 =new Test1 ();
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.sum);
	}

}
 class Test1 extends Thread{
	int num=10000;
	int sum;
	 public void run() {
		 while(num>0) {
			 sum+=num--;
		 }
	 }
 }