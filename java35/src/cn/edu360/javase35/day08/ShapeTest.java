package cn.edu360.javase35.day08;
public class	ShapeTest{
	public static void main(String[] args) {
		Shape s = new Circle(8);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		Shape s1 = new Rectangle(3,4);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		Rectangle s2 = (Rectangle)s1;
		s2.setLength(3);
		s2.setWidth(4);
		System.out.println(s2.getArea());
		System.out.println(s2.getPerimeter());
		Circle s3= new Circle(8);
		Shape [] a = {s1,s2,s,s3};
		print(s3);
	}
	public static void print (Shape t ) {
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
		
	}
	
}
 abstract class Shape {
		public abstract double getArea ();
		public abstract double getPerimeter ();
		
}


    class Circle extends Shape{
    	public static final double PI = 3.14;
    	double r;
    	Circle(double r){
    		this.r =r;
    	}
    	@Override
    	public double   getArea() {
			return PI*r*r;
		}

		public double getPerimeter() {
			return  2*PI*r;
		}
   }
    class Rectangle extends  Shape{
    	double length,width;
    	public Rectangle() {}
    	public void setLength(double length) {
			this.length = length;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public Rectangle(double length,double width) {
    		this.width =width;
    		this.length= length;
    	}
		public double getArea() {
			return width*length;
		}
		@Override
		public double getPerimeter() {
			return 2*(length+width);
		}
    	
    }
    
    
    
    
