package cn.imcore.snake.s1;

import java.util.LinkedList;
import java.util.Random;

public class Snake {
	LinkedList<Point>s= new LinkedList<Point>();
	Random r = new Random();
	
	public Snake () {
		int x =r.nextInt(TestSnake.getrow()/2)+TestSnake.getrow()/4;
		int y =r.nextInt(TestSnake.getcol()/2)+TestSnake.getrow()/4;
		for (int i=1;i<=3;i++) {
			s.push(new Point (x,y-i));
		}
	}
}
