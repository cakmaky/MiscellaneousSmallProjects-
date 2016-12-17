import java.util.*;
import java.io.*;
import java.nio.file.*;

public class CountriesTextFile {
	
	private ArrayList<String> countries;
	private Path countriesPath = null;
	private File countriesFile = null;
	
	public CountriesTextFile(){
		
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		countries = this.getCountries();
			
	}
	public ArrayList<String> getCountries(){
		if(countries != null){
			return countries;
		}
		countries = new ArrayList<>();
		if(Files.exists(countriesPath)){
			try (BufferedReader in = new BufferedReader(new FileReader(countriesFile)))
			{
				String line = in.readLine();
				while(line != null){
					countries.add(line);
					line = in.readLine();
				}		
			} 
			catch(IOException e){
				System.out.println(e);
				return null;
			}	
		}
		return countries;
			
	}
	public boolean addCountry(String country){
		countries.add(country);
		return this.saveCountries();
		
	}
	public boolean deleteCountry(String country){
		countries.remove(country);
		return this.saveCountries();
	
	}
	public boolean saveCountries(){
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))){
			
			for(String s: countries){
				out.println(s);
			}	
		}
		catch(IOException e){
			System.out.println(e);
			return false;
		}
		return true;
	}	
}
