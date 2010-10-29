class DrawProgram
{
	public static void main(String[] args)
	{
		String name="";
		Shape[] s={new Shape(5,4),
			new Shape(),
			new Shape(1.2,3.0),
			new Shape(10.0),
			new Shape(1.4,3.5)};
			
		s[0]=(Rectangle)s[0];
		s[1]=(Rectangle)s[1];
		s[3]=(Circle)s[3];
		s[4]=(Triangle)s[4];

		for(int i=0;i<5;i++)
		{
			if(s[i] instanceof Rectangle)
				name="사각형";
			else if(s[i] instanceof Circle)
				name="원";
			else if (s[i] instanceof Triangle)
				name="삼각형";
			else
				name="도형";
		System.out.println(i+1+"번째 도형은"+name+"입니다.");
		}

	}
}

class Shape {
 double x, y;
 double radius;
 Shape(){
	 x=0.0;
	 y=0.0;
	}
 Shape(double radius){
	 this.radius=radius;
 }
 Shape(double x, double y) {
  this.x = x;
  this.y = y;
 }

}

 


class Circle extends Shape {

 double radius;

 Circle() {
  super(0.0,0.0);
  this.radius = -1;
 }
 
 Circle(double x, double y) {
  super(x,y);
  this.radius = -1;
 }

 Circle(double radius) {
  super(0.0, 0.0);
  this.radius = radius;
 }

}

 


class Rectangle extends Shape {

 double width, height;

 Rectangle() {
  super(0.0,0.0);
 }

 Rectangle(double width, double height){
  super(width, height);
  this.width = width;
  this.height = height;
 }

}

 


class Triangle extends Shape {

 double width, height;

 Triangle() {
  super(0.0, 0.0);
 }

 Triangle(double width, double height){
  super(width, height);
  this.width = width;
  this.height = height;
 }
}
