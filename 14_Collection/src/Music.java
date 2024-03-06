
public class Music {
	private String title;
	private String atrist;
	
	public Music() {
		super();
	}
	public Music(String title, String atrist) {
		super();
		this.title = title;
		this.atrist = atrist;
	}
	public String getTitle() { 
		return title; 
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAtrist() {
		return atrist;
	}
	public void setAtrist(String atrist) {
		this.atrist = atrist;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", atrist=" + atrist + "]";
	}
	
	

}
