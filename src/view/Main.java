package view;

import java.util.Scanner;

import br.edu.fateczl.list.List;
import controller.PlayerController;
import model.Music;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PlayerController player = new PlayerController();
		List<Music> playlist = new List<>();
		
		int option = 0;
		
		do {
			System.out.println("---- VITUFY ----");
			System.out.println("Select a operation:");
			System.out.println("[1] Add music to playlist");
			System.out.println("[2] Remove music from playlist");
			System.out.println("[3] Execute playlist");
			System.out.println("[0] Exit");
			option = Integer.parseInt(sc.nextLine().trim());
			
			switch(option) {
			case 1:
				System.out.print("Music name: ");
				String name = sc.nextLine().trim();
				System.out.print("Artist name: ");
				String artist = sc.nextLine().trim();
				System.out.print("Duration (seconds): ");
				String duration = sc.nextLine().trim();
				player.addMusic(playlist, name + ";" + artist + ";" + duration);
				System.out.println("Music added!");
				break;
			case 2:
				System.out.print("Type the music position in playlist: ");
				int position = Integer.parseInt(sc.nextLine().trim());
				player.removeMusic(playlist, position);
				System.out.println("Music removed from position " + position + "!");
				break;
			case 3:
				try {
					player.executePlaylist(playlist);
				} catch (Exception e) {
					System.err.println("There are no music to play!");
				}
				break;
			case 0:
				System.out.println("Ending application!");
				break;
			default:
				System.err.println("Invalid operation!");
			}
			
		}while(option != 0);
		
		sc.close();
	}

}
