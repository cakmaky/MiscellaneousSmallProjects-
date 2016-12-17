
public class Conversion {

	private String fromUnit;
	private double fromValue;
	private String toUnit;
	private double toValue;
	private double conversionRatio;
	
	public Conversion(String fromUnit, String toUnit, double conversionRatio){
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.conversionRatio = conversionRatio;
		this.fromValue = 0.0;
		this.toValue = 0.0;
	}
	public void setFromValue(double value){
		fromValue = value;	
	}
	public double getFromValue(){
		return fromValue;
	}
	public String getFromUnit(){
		return fromUnit;
	}
	
	public String getToUnit(){
		return toUnit;
	}
	public double getRatio(){
		return conversionRatio;
	}
	public double getToValue(){
		toValue = fromValue * conversionRatio;
		return toValue;
	}	
}
