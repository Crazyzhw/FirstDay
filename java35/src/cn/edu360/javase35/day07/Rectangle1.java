package cn.edu360.javase35.day07;

public class Rectangle1 {
	 public double height ;
	public double width;
   Rectangle1(double width, double length ){
		this.height = length ;
		this.width =width;
	}
	public Rectangle1() {
		this.width=10;
		this.height=10;
	}
	public double getArea () {
		return height*width;
	}
	public double getPerimeter() {
		return (height+width)*2;
	}
}

 class RectangleDemo extends Rectangle1{ 
	double startX;
	double startY;
	RectangleDemo(double startX,double startY,double width,double heigth){
		super(width,heigth);
		this.startX=startX;
		this.startY= startY;
	}
	RectangleDemo(){
		super(0,0);
		this.startX=0;
		this.startY=0;
	}
	public boolean isInside(double x, double y) {
		return (x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height));
	}
}


