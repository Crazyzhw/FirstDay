package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
/**
 * 定时器，Timer 抽象类
 * public void schedule(TimerTask(),delay)
 * public void schedule(TimerTask(),Date time)
 * public void schedule(TimerTask(),Date time ,p)
 * @author Administrator
 *
 */
public class TimerDemo {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("nihao");
//				t.cancel();
			}
		}, 2000);
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("haha");
			}
		}, new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").parse("2018-6-22 20-22-00"));
	}
}
