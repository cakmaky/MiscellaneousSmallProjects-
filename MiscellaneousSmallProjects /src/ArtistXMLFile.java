import java.util.*;
import java.io.*;
import java.nio.file.*;
import javax.xml.stream.*;  // StAX API

public class ArtistXMLFile {
	
	private Path artistsPath = null;
	private ArrayList<Artist> artists = null;
	
	public ArtistXMLFile(){
		artistsPath = Paths.get("music_artists.xml");
		artists = this.getArtists();
	}
	public ArrayList<Artist> getArtists(){
		if(artists != null){
			return artists;
		}
		
		artists = new ArrayList<>();
		Artist ar = null;
		if(Files.exists(artistsPath)){
			 XMLInputFactory inputFactory = XMLInputFactory.newFactory();
			 
			 try {
				 FileReader fileReader = new FileReader(artistsPath.toFile());
				 XMLStreamReader reader = inputFactory.createXMLStreamReader(fileReader);
					
				 while(reader.hasNext()){
					 int eventType = reader.getEventType();
					 switch(eventType){
					 	case XMLStreamConstants.START_ELEMENT:
					 		String elementName = reader.getLocalName();
					 		if(elementName.equals("Artist")){
					 			ar = new Artist();
					 		}
					 		if(elementName.equals("Name")){
					 				String name = reader.getElementText();
					 				ar.setName(name);
					 				
					 		}
					 	    if(elementName.equals("Album")){
					 	    	String album = reader.getElementText();
					 			ar.addAlbums(album);
					 		}
					 		break;
					 	case XMLStreamConstants.END_ELEMENT:
					 		elementName = reader.getLocalName();
					 		if(elementName.equals("Artist")){
					 			artists.add(ar);
					 		}
					 		break;
					 	default:
					 		break;
					 }
					 reader.next();	 
				 }
				 
			 } catch (IOException | XMLStreamException e){
				 System.out.println(e);
				 return null; 
			 }
		}
			return artists;	
	}
	
	
	
	
	

}
