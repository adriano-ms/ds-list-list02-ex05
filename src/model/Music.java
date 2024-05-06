package model;

public class Music {
	
	private String name;
	private String artistName;
	private Integer duration;
	
	public Music() {
		super();
	}

	public Music(String name, String artistName, Integer duration) {
		super();
		this.name = name;
		this.artistName = artistName;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Music [name=" + name + ", artistName=" + artistName + ", duration=" + duration + "]";
	}
	
	

}
