
public class SalesReport {
	
	public static void printArray(double[][] Array){
		
		System.out.println("Region \t Q1 \t Q2 \t Q3 \t Q4\n");
		
		for(int i=0; i< Array.length; i++){
			System.out.print( i+1 + "\t" );
			for(int j=0; j<Array[i].length; j++){
				System.out.print(Array[i][j] + "\t");
			}
			System.out.println();
		}	
	}
	public static void salesByRegion(double[][] Array){
		
		double total = 0;
		System.out.println("\nSales by region:");
		for(int i=0; i< Array.length; i++){
			System.out.print("Region " + (i+1) + " : ");
			for(int j=0; j<Array[i].length; j++){
				total += Array[i][j];	
			}
			System.out.println(total);	
			total = 0;
		}	
	}
	public static void salesByQuarter(double[][] Array){
		double total = 0;
		System.out.println("\nSales by quarter:");
		for(int i=0; i< Array.length; i++){
			System.out.print("Q" + (i+1) + " : ");
			for(int j=0; j<Array[i].length; j++){
				total += Array[j][i];	
			}
			System.out.println(total);	
			total = 0;
		}		
	}
	
	public static void totalSales(double[][] Array){
		System.out.print("\nTotal annual sales, all regions : ");
		double total = 0.0;
		for(int i=0; i< Array.length; i++){
			for(int j=0; j<Array[i].length; j++){
				total += Array[i][j] ;
			}
		}	
		System.out.println(total);
	}
	public static void main(String[] args) {
			
		
		//double[][] Array = new double[4][4];
		double[][] Array = {{1,2,3,4},{5,6,7,8},{9,1,2,3,},{4,5,6,7}};
		
		System.out.println("Welcome to the Sales Report Application.\n");
		printArray(Array);
		salesByRegion(Array);
		salesByQuarter(Array);
		totalSales(Array);
		
	}

}
