import java.lang.Math;

public class Die {
	
	private int sides;
	private int value;
	
	public Die(){
		sides = 6;
	}
	public Die(int sides){
		this.sides = sides;
	}
	
	public void roll(){
		value = (int)(1 + Math.random() * sides);	
	}
	
	public int getValue(){
		return value;
	}

}
