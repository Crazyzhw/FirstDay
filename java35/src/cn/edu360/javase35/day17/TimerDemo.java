package cn.edu360.javase35.day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer timer = new Timer(); 
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("nihao");
				
			}
		}, 2000);
		try {
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					System.out.println("haha ");
//					timer.cancel();
				}
			}, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-6-22 09:55:00"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					System.out.println("hello");
				}
			}, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-6-22 09:56:00"), 1000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}	
