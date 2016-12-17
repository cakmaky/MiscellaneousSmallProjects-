import java.util.*;

public class Artist {
	
	private String name;
	private ArrayList<String> albums;
	
	public Artist(){
		this.name = "";
		albums = new ArrayList<>();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public ArrayList<String> getAlbums(){
		return albums;
	}
	public void addAlbums(String album){
		albums.add(album);
	}
	
}
