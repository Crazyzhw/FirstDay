package cn.edu360.javase35.day15;
/**
 * 读取配置文件中的信息
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
	try {
		//创建对象
	Properties p = new Properties();
	//获取字节流，加载配置文件
	InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream("config.properties");
		p.load(in);
		//
		String s = p.getProperty("level");
		System.out.println(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
