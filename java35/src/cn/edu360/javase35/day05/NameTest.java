package cn.edu360.javase35.day05;

import java.util.Random;

public class NameTest {
	public static void main(String[] args) {
		String [] name = {"郭振勇","赵文军","谢万云","李益超","张明贵","罗锐","郑士伟",
				"杨晋","周一白","冯健","张轶涵","林启进","郝春雷","倪志强","王龙","李胜明",
				"魏鸿","黄锦月","毛荣","朱明雷","贾向明","任俊杰","邹浩武","赵彦江","白树森",
				"孙翌鹏","田俊超","段钰","郭凯"};
		Random r = new Random();
		int x = r.nextInt(name.length);
		System.out.println("请幸运观众"+name[x]+"上台表演");
		
	}
}
