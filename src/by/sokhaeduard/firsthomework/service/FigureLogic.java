package by.sokhaeduard.firsthomework.service;

public class FigureLogic {

	public double getSquareForSide(double area) {
		return Math.sqrt(area);
	}
	
	public double getRadiusInscribedCircle(double side) {
		return side / 2.0;
	}

	public double getInscribedSquareCircle(double radius) {
		double side = 2 * radius / Math.sqrt(2);
		return side;
	}
	
	public double getSquareScale(double describedSide, double inscribedSide) {
		double areaDescribed = getArea(describedSide);
		double areaInscribed = getArea(inscribedSide);						
				
		return areaDescribed/ areaInscribed;
	}	
	
	public double getArea(double side) {
		return Math.pow(side, 2);
	}

	public void getAreaForCircle(int radius) {
		double pi;
		
		double length;
		double area;
		
		pi = Math.PI;
		length = 2 * pi * radius;
		
		System.out.printf("Ñircumference value is: %.2f",length);
		System.out.println("");
		
		area = pi * radius * radius;
		
		System.out.printf("Area of the circle is: %.2f", area);	
	}
	
}
