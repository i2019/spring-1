package tao.tech.study.spring.springinaction.soundsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("blank")
public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc() {
		super();
	}

	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void playTrack(int trackNumber) {
		if(null!=tracks&&tracks.size()>trackNumber){
			System.out.println("play: "+tracks.get(trackNumber+1));
		}else{
			System.out.println("wrong trackNumber");
		}
	}
	
}
