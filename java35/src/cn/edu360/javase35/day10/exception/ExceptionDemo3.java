package cn.edu360.javase35.day10.exception;

import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入电脑状态");
		Computer.state=sc.nextInt();
		Teacher t = new Teacher("王老师");
		try {
			t.show();
		} catch (NoPlanException e) {
			System.out.println(e.toString());
			System.out.println("换老师讲课");
		}
	}	
		
}


class   Computer {
	public static int state = 0;
	public void run() throws BlueScreenException, SmokeException {
		if (state ==1) {
		throw new BlueScreenException("电脑蓝屏");
		}
		if (state ==2) {
		throw  new SmokeException("电脑冒烟了，损毁");
		}
		System.out.println("电脑运行");
	
}
	public void resert() {
		System.out.println("电脑重新启动");
		state =0;
	}
}

 class Teacher {
	String name ;
	Computer comp= new Computer();
	Teacher (String name ){
		this.name = name;
	}
	public void show () throws NoPlanException {
		try {
			comp.run();
			System.out.println(name+"开始上课");
		} catch (BlueScreenException e) {
		System.out.println(e.toString());
			comp.resert();
			show();
		} catch (SmokeException e) {
			System.out.println(e.toString());
			throw new NoPlanException("课时进度延迟");
			
			
		}
	}
}


class  BlueScreenException  extends Exception{
	BlueScreenException(){}
	BlueScreenException(String message){
		super(message);
	}
}


class SmokeException extends  Exception{
	SmokeException(){}
	SmokeException(String message){
		super(message);
	}
}
class NoPlanException  extends Exception{
	NoPlanException(){}
	NoPlanException(String message){
		super(message);
	}
}

	




