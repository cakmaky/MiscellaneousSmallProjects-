import java.lang.Math;
import java.text.NumberFormat;

public class Circle {

	private double radius= 0.0;
	private static int numberOfCircle = 0;

	public Circle(double radius){
		this.radius = radius;
		numberOfCircle ++;
	}

	public double getCircumference(){
		return 2*Math.PI*radius;
	}

	public String getFormattedCircumference(){	
		return formatNumber(getCircumference());
	}

	public double getArea(){	
		return Math.PI*radius*radius;
	}

	public String getFormattedArea(){
		return formatNumber(getArea());
	}

	private String formatNumber(double x){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		return number.format(x);	
	}

	public static int getObjectCount(){
		return numberOfCircle;
	} 
}
