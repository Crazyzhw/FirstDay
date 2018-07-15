package cn.edu360.javase35.day06;

public class MobleDemo {
public static void main(String[] args) {
	Mobile m = new Mobile();
/*	m.name ="小米";
	m.color='白';
	m.price=2699;
	m.type="小米8";
	m.introduce();
	m.call(15700166285L);
	Mobile m1 = new Mobile();
	m1.name = "一加";
	m1.color ='红';
	m1.price =3199;
	m1.type="一加6";*/
	m.setColor('红');
	System.out.println(m.getColor());
	m.setName("小米");
	System.out.println(m.getName());
	m.setType("小米8");
	System.out.println(m.getType());
	m.setPrice(2699);
	System.out.println(m.getPrice());
	m.introduce();
	m.call(13297416285L);
}
}
