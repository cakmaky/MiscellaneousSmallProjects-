import java.util.ArrayList;
import java.util.Scanner;

public class MusicArtistsApp {

	public static void main(String[] args) {
		
		System.out.println("Artist and Album Listing\n");
		
		ArtistXMLFile file = new ArtistXMLFile();
		ArrayList<Artist> artists = file.getArtists();
		
		System.out.println("Artists");
		System.out.println("..........");
		
		for(Artist ar : artists){
			System.out.println(ar.getName());
		}
		
		System.out.println("\n\nAlbums");
		System.out.println("..........");

		for(Artist ar : artists){
			ArrayList<String> albums = ar.getAlbums();
			for(String s : albums){
				System.out.println(s);
			}	
		}
		System.out.println("\n\nArtists and Albums");
		System.out.println("..........");
		
		for(Artist ar : artists){
			System.out.println(ar.getName());
			ArrayList<String> albums = ar.getAlbums();
			for(String s : albums){
				System.out.println("     " + s);
			}		
		}
	}
}
