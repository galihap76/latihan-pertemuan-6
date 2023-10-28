/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = CAKEP
*/

// Import library java
import java.io.IOException;
import java.util.Scanner;

// Init class Main
public class Main {
	
		// Text color
		 public static final String ANSI_RESET = "\u001B[0m";
		 public static final String ANSI_RED = "\u001B[31m";
		 public static final String ANSI_GREEN = "\u001B[32m";
		 public static final String ANSI_YELLOW = "\u001B[33m";
		 public static final String ANSI_BLUE = "\u001B[34m";
		 public static final String ANSI_PURPLE = "\u001B[35m";
		 public static final String ANSI_CYAN = "\u001B[36m";
		 public static final String ANSI_WHITE = "\u001B[37m";

	// Jalankan method main
	public static void main(String[] args) {

		// Init inputan scanner dan set variabel
		Scanner input = new Scanner(System.in);
		String tanyaPengguna;
		
		// Tampilkan kalimat berwarna sebagai masukkan apakah mengerjakan sendiri atau tidak
		 println(ANSI_RED + "Kamu " + ANSI_GREEN + "ngerjain sendiri " + ANSI_YELLOW + "latihan 17 sampe " + ANSI_BLUE + "latihan 30 ini?");
		 println(ANSI_BLUE + "Jawab" + ANSI_RED + " (Yoi/Enggak) : " + ANSI_RESET);
		 
		 tanyaPengguna = input.nextLine();
		 
		 // Jika inputannya adalah "yoi"
		 if(tanyaPengguna.equalsIgnoreCase("yoi")) {
			 
			 // Tampilkan
			 println(ANSI_RED + "Cakep bener. " + ANSI_PURPLE + "Good Job" + ANSI_RESET);
			
		 // Jika selain inputannya adalah "enggak" 
		 }else if(tanyaPengguna.equalsIgnoreCase("enggak")) {
			 
			 // Tampilkan
			 println(ANSI_RED + "Tetep cakep sih.");
			 println(ANSI_CYAN + "Sing penting paham konsep nya yee." + ANSI_RESET);
			 println("Keep the code works dude.");
		 }

	}
	
	 // Stackoverflow : https://stackoverflow.com/a/74321619/19531536
    static void println(String s) {
        try {
            new ProcessBuilder("cmd", "/c", "echo " + s).inheritIO().start().waitFor();
        } catch (InterruptedException|IOException e) {
            throw new RuntimeException(e);
        }
    }
}
