import java.util.*;

public class StackCalculator{
	
	private LinkedList<Double> ll;
	private double v1, v2;
	
	public StackCalculator(){
		ll = new LinkedList<Double>();	
	}
	void push(double x){
		ll.addFirst(x); 
	}
	double pop(){
		return ll.removeFirst();
	}
	void add(){
		v1 = ll.pop();
		v2 = ll.pop();
		
	ll.push(v1 + v2); 	
	}
	void subtract(){
		v1 = ll.pop();
		v2 = ll.pop();
		
		ll.push(v1-v2);
	}
	void multiply(){
		v1 = ll.pop();
		v2 = ll.pop();
		
		ll.push(v1*v2);
	}
	void divide(){
		v1 = ll.pop();
		v2 = ll.pop();
		
		ll.push(v1/v2);
		
	}
	void clear(){
		ll.clear();
	}
	double[] getValues(){
		
		double[] Array = new double[ll.size()];
		
		for(int i=0; i<ll.size(); i++){
			Array[i] = ll.get(i);
		}
		return Array;
	}
	
	int size(){
		return ll.size();
	}
}
