package cn.edu360.javase35.day08.test;

public class NoteBook {
		void run () {
			System.out.println("notebook run ");
		}
		public void useUsb(Usb usb) {
			usb.run();
			usb.close();
		}
		public static void main(String[] args) {
			
			new NoteBook().useUsb(new Mouse());
		}
}

interface  Usb{
	void run ();
	void close();
}

class Mouse implements Usb {
	public void run() {
		System.out.println("Mouse run ");
	}
	public void close() {
		System.out.println("Mouse cloose");
	}
}

class KeyBoard implements Usb {
	public void run() {
		System.out.println("KeyBoard run");
	}
	public void close () {
		System.out.println("KeyBoard close");
	}
}
