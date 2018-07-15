package cn.edu360.javase35.day15.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/person.txt"));
				){
			Object o = ois.readObject();
			System.out.println(o.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
