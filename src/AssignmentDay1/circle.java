package AssignmentDay1;

public class circle {
	
		final double pi = 3.14; 
		double height=1.0;
		double radius;
		String color;

		public circle() {
			radius = 1.0;
			color = "red";
		}

		public circle(double r, String c) {
			radius = r;
			color = c;
		}

		double getRadius() {
			return radius;
		}
		void setRadius(double r) {
			this.radius=r;
		}

		String getColor() {
			return color;
		}
		void setColor(String c) {
			this.color=c;
		}
		double getArea() {
			return pi*radius*radius;
		}
		double getVolume() {
			return pi*radius*radius*height;
		}


	class cylinder extends circle{

		public cylinder() {
			height = 1.0;
		}

		public cylinder(double r, double h, String c) {
			this.radius = r;
			this.height = h;
			this.color = c;
		}

		double getHeight() {
			return height;
		}
		void setHeight(double h) {
			this.height = h;
		}
		double getVolume() {
			return pi*radius*radius*height;
		}

		double getArea() {
			return pi*radius*radius;
		}
	}

	public static void main(String args[]) {
		circle c = new circle(1,"red");
		circle cyl = c.new cylinder(2,3,"red");
		System.out.println("Circle Area: "+c.getArea());
		System.out.println("Cylinder Area: "+cyl.getArea());
		System.out.println("Circle Volume: "+c.getVolume());
		System.out.println("Cylinder Volume: "+cyl.getVolume());		
	}

}

