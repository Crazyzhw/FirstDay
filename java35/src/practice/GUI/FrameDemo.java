package practice.GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
	public static void main(String[] args) {
		//创建窗口
		Frame f = new Frame("my window");
		f.setVisible(true);
		//设置位置
		f.setSize(500,400);
		f.setLocation(400,200);
		Button b = new Button("my botton");
		TextField tf =new TextField(30);
		f.add(b);
		f.add(tf);
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				/*String s = e.getKeyText(code);
				System.out.println(s);*/
				if(code<e.VK_0||code>e.VK_9) {
					System.out.println("输入有误");
					e.consume();
				}
				if(code==e.VK_ENTER&&e.isControlDown()) {
					System.out.println("ctrl+enter down");
				}
			}
			
		});
		f.setLayout(new FlowLayout());;
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			 System.out.println("haha");
//			System.exit(0);
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			}
		});
		b.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) {
					System.out.println("mouse double click");
				}
			}
			
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		/*f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
	}
}
