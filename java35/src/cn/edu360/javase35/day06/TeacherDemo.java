package cn.edu360.javase35.day06;

public class TeacherDemo {
  public static void main(String[] args) {
	Teacher liu = new Teacher();
	liu.age = 20;
	liu.keMu ="javase";
	liu.name ="刘某";
	liu.sex ="男";
	liu.chuiNiu();
	
	liu.teach();
}
}
