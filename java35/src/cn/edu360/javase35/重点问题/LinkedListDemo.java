package cn.edu360.javase35.重点问题;

import java.util.LinkedList;

/**
 * 用linkedList实现堆栈和队列结构 堆栈：先进后出。First In Last Out 队列：先进先出 。First In First out
 * 
 * @author Administrator
 *
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		MyQueue m = new MyQueue();
		m.myAdd("add1");
		m.myAdd("add2");
		m.myAdd("add3");
		while (!m.isNull()) {
			System.out.println(m.myRemove());
		}
	}
}

class MyQueue{
	private LinkedList l ; 
	MyQueue(){
		l=new LinkedList();
	}
	public void myAdd (Object obj) {
		l.addFirst(obj);
	}
	public Object myRemove () {
		return l.removeLast();
	}
	public boolean  isNull () {
		return  l.isEmpty();
	}
	
	
}