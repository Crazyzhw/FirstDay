package cn.imcore.snake.s1;

import java.util.LinkedList;
import java.util.Scanner;
public class TestSnake {
	private static int row=16;
	private static int col=40;
	public static int getrow() {
		return row;
	}
	public static int getcol() {
		return col;
	}
	
	private static LinkedList food =null;
	private static LinkedList<Point> snake =null;
	private static Point point;

	public static void main(String[] args) {
		startSnakeGame();
	}
	
	public static void startSnakeGame() {
		snake = new Snake().s;
		prodeuceFood();
		
		init();
		while (true) {
			char ch =control();
			if (!(ch=='A'||ch =='W'||ch=='D'|| ch =='S')) {
				continue;
			}
			else {
			move(ch);
			if (deadOrContinue())
				break;
			}
		}
	}
	public static char control() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next().toUpperCase();
		return string.charAt(0);
	}
	public static void move (char m) {
		Point snakeHead = snake.getLast();
		switch (m) {
		case 'A':
			if (snake.get(snake.size()-2).getY()==(snake.getLast().getY()-1))
			break;
			snake.addLast(new Point(snakeHead.getX(),snakeHead.getY()-1));
			eatOrNot();
			break;
		case 'D':
			if (snake.get(snake.size()-2).getY()==(snake.getLast().getY()+1))
			break;
			snake.addLast(new Point(snakeHead.getX(),snakeHead.getY()+1));
			eatOrNot();
			break;
		case 'W':
			if (snake.get(snake.size()-2).getX()==(snake.getLast().getX()-1))
			break;
			snake.addLast(new Point(snakeHead.getX()-1,snakeHead.getY()));
			eatOrNot();
			break;
		case 'S':
			if (snake.get(snake.size()-2).getX()==(snake.getLast().getX()+1))
			break;
			snake.addLast(new Point(snakeHead.getX()+1,snakeHead.getY()));
			eatOrNot();
			break;
			default:
				break;
		}
		init();
	}
	public static void eatOrNot() {
		if (snake.containsAll(food)) {
			prodeuceFood();
		}else {
			snake.pop();
		}
	}
		public static void prodeuceFood() {
			 food = new Food().f;
			while(true) {
				if (snake.containsAll(food))
					food = new Food().f;
				else 
					break;
			}
		}
			
			
			public static boolean deadOrContinue() {
				if (snake.getLast().getX()==0||snake.getLast().getY()==(row-1)
						||snake.getLast().getY()==0||snake.getLast().getY()==(col-1)) {
					System.out.println("游戏结束");
					return true;
				}
				
				if (snake.indexOf(snake.getLast())!=snake.size()-1) {
					System.out.println("游戏结束");
					return true;
				}
				return false;
					
			}
			public static void init () {
				System.out.println("食物:"+food);
				System.out.println("蛇身："+snake);
				
				for (int m=0;m<row;m++) {
					for (int n=0;n<col;n++){
						point = new Point(m,n);
						if (m==0|m==row-1) {
							System.out.print("-");
						}else if (n==0||n==col-1){
							System.out.print("|");
						}else if (food.contains(point)) {
							System.out.print("@");
							}else if (snake.getLast().equals(point)) {
								System.out.print("S");
							}else if (snake.contains(point)) {
								System.out.print("#");
						}else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			
		
	}
	

