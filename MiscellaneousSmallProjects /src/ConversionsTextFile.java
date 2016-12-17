import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ConversionsTextFile {
	
	private ArrayList<Conversion> conversions = null;
	private Path conversionsPath = null;
	private File conversionsFile = null;
	
	private final String FIELD_SEP = "\t";
	
	public ConversionsTextFile(){
		
		conversionsPath = Paths.get("conversion_types.txt");
		conversionsFile = conversionsPath.toFile();
		conversions =  this.getConversions();	
	}
	
	public ArrayList<Conversion> getConversions(){
		if(conversions != null){
			return conversions;
		}
		conversions = new ArrayList<>();
		if(Files.exists(conversionsPath)){
			try (BufferedReader in = new BufferedReader(new FileReader(conversionsFile))){
				
				String line = in.readLine();
				while(line != null){
					
					String[] columns = line.split(FIELD_SEP);
					String fromUnit = columns[0];
					String toUnit = columns[1];
					String ratio = columns[2];
					
					Conversion c = new Conversion(fromUnit, toUnit,Double.parseDouble(ratio));
					
					conversions.add(c);
					
					line = in.readLine();	
				}
			} catch(IOException e){
				System.out.println(e);
				return null;
			}	
		}
		return conversions;	
	}
	public boolean saveConversions(){
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(conversionsFile)))){
			
			for(Conversion c : conversions){
				out.print(c.getFromUnit() + FIELD_SEP);
				out.print(c.getToUnit() + FIELD_SEP);
				out.println(c.getRatio());
			}
			
		} catch(IOException e){
			System.out.println(e);
			return false;
		}
		return true;

	}
}
