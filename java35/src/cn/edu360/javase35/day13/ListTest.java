package cn.edu360.javase35.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * 	ArrayList
		去除集合中字符串的重复值(字符串的内容相同)
		LinkedList
	去除集合中自定义对象的重复值(对象的成员变量值都相同)
 *
 */
public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("孔子");
		list.add("孟子");
		list.add("瓜子");
		list.add("段子");
		list.add("段子");
		list.add("段子");
		list.add("段子");
		
		List<String> l = distinct1(list);
		System.out.println(l);
	}
	
	public static List<String> distinct(List<String>list){
		List<String> l = new ArrayList<>();
		for(int i=0;i<list.size();i++){
			String str = list.get(i);
			if(!l.contains(str)){
				l.add(str);
			}
		}
		return l;
	}
	
	public static List<String> distinct1(List<String>list){
		for(int i=0;i<list.size()-1;i++){
			String str = list.get(i);
			for(int j=i+1;j<list.size();j++){
				if(str.equals(list.get(j))){
					list.remove(j);
					j--;
				}
			}
		}
		return list;
	}
	

}
