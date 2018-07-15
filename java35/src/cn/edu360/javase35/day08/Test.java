package cn.edu360.javase35.day08;

public class Test {
	public static void main(String[] args) {
		
		Animals s1 =getInstance("Dog");
		s1.voice();
		Animals s2 =getInstance("Cog");
		s2.voice();
		Animals s3 =getInstance("Cat");
		s3.voice();
		Animals s4 = getInstance("xx");
		s4.voice();
	}
	public  static  Animals getInstance (String s ) {
		if (s.equals("Dog")) {
			 return new Dog ();
		}else if (s.equals("Cat")) {
			return new Cats();
		}else {
			return new Pig();
		}
	}
}

abstract class Animals{
	abstract void voice() ;
}

class Dog extends Animals{
	void voice() {
		System.out.println("汪汪");
	}
}
  class Cats extends Animals{
	  void voice () {
		  System.out.println("喵喵");
	  }
  }
  class Pig extends Animals {
	  void voice () {
		  System.out.println("哼哼");
	  }
  }