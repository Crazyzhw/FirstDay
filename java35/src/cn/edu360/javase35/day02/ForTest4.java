package cn.edu360.javase35.day02;

public class ForTest4 {

	public static void main(String[] args) {
		int z=1;
		String kong1 = " ";
		String kong2 = "  ";
		String kong3 = "   ";
		for (int x=1;x<5;x++) {
			for(int y=1;y<=z;y++) {
			if(y == 1 && x== 1) {
				System.out.print(kong3);
			}else if(y == 1 && x== 2) {
				System.out.print(kong2);
			}else if(y == 1 && x== 3) {
				System.out.print(kong1);
			}
			System.out.print((char)('A'+x-1));	
	}
			z+=2;
			System.out.println();
			
	}
}
}
