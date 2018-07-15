package cn.edu360.javase35.day17.ChatRoom;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatRoomSystem {
	public static void main(String[] args) {
//		new Thread(new ChatRoomServer()).start();
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		new Thread(new ChatRoomClient()).start();
	ExecutorService	 pool = Executors.newCachedThreadPool();
		pool.execute(new ChatRoomServer());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.execute(new ChatRoomClient());
	}
}
