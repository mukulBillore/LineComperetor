package com.bridgelabs;

public class LineComprator {
	double x1;
	double x2;
	double y1;
	double y2;
	
	public LineComprator(double x1, double x2, double y1, double y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public double lineCreator() {
		double LengthOfLine = Math.sqrt(Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2));

		return LengthOfLine;
	}

	public static void main(String[] args) {
	 System.out.println("Welome to line comperison program");
	 LineComprator line1 = new LineComprator(12, 12, 13, 33);
	
	}

}
