package controller;

import br.edu.fateczl.list.List;
import model.Music;

public class PlayerController {
	
	public void addMusic(List<Music> playlist, String music) {
		try {
			String[] aux = music.split(";");
			Music obj = new Music();
			obj.setName(aux[0]);
			obj.setArtistName(aux[1]);
			obj.setDuration(Integer.parseInt(aux[2]));
			playlist.addLast(obj);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void removeMusic(List<Music> playlist, int position) {
		try {
			playlist.remove(position);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void executePlaylist(List<Music> playlist) throws Exception {
		if(playlist.isEmpty()) {
			throw new Exception("Empty playlist");
		}
		try {
			int size = playlist.size();
			for (int i = 0; i < size; i++) {
				Music current = playlist.get(i);
				System.out.println("Playing: " + current);
				Thread.sleep(current.getDuration() * 1000);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
