
public class Movie implements Comparable {
	
	private String title;
	private String category;
	
	public Movie(String title, String category){
		this.title = title;
		this.category = category;	
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	@Override
	public int compareTo(Object o) {
		 Movie mv = (Movie) o;
		int comparison = this.title.compareTo(mv.getTitle());
		return comparison;
	}
	
}
