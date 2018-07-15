package cn.edu360.javase35.day15.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		try (
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/person.txt"));
				){
			Person p = new Person("徐凤年",20,"男");
			oos.writeObject(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
