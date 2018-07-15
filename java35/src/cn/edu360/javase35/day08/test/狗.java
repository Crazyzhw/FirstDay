package cn.edu360.javase35.day08.test;

public class 狗 {
	public static void main(String[] args) {
		狗  h = new 缉毒犬();
		h.看门();
		System.out.println("haha");
	}
	void  看门() {
		
	}
}


class 缉毒犬   extends  狗  implements   缉毒{ 
	public void 缉毒 (){
		System.out.println("抓毒贩");
	}
	void  看门() {
		System.out.println("我会看门");
	}
	
	
	
}

interface 缉毒{
	void  缉毒();
	
}