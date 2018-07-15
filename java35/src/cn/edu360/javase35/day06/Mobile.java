package cn.edu360.javase35.day06;

public class Mobile {
	private String name ;
	private String type;
	private char color ;
	private double price;
	public String getName() {
		return name;
	}
	public void  setName (String name) {
		this.name = name;
	}
	public String getType() {
		return type ;
	}
	public void  setType (String Type) {
		this.type = Type;
	}
	public char getColor() {
		return color;
	}
	public void  setColor (char color) {
		this.color= color;
	}
	public double getPrice() {
		return price;
	}
	public void  setPrice(double price) {
		this.price = price;
	}
 	public void  introduce () {
		System.out.println("品牌："+name+"，型号："+type+"，颜色："+color+"，价格："+price);
	}
	public  void call(long number){
		System.out.println("正在拨号"+number+"，等待接通");
	}
}
