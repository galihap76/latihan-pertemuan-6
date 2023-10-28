/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = EJAAN NAMA
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main {

	// Jalankan method main
	public static void main(String[] args) {
		
		 // Init inputan scanner dan set variabel
		 Scanner input = new Scanner(System.in);
		 String nama;

		 // Masukkan nama depan
		 System.out.print("Masukkan nama depan Anda untuk di eja : ");
		 nama = input.nextLine();

		 // Tampilkan ejaan
		 System.out.println("Ejaan untuk " + "\"" + nama + "\"" + " adalah : ");

		 // Looping sebagai pemecah satu satu huruf menggunakan charAt
	     for (int i = 0; i < nama.length(); i++) {
	            char character = nama.charAt(i);
		
		    // Dan tampilkan
	            System.out.println("Huruf ke - " + (i + 1) + " : " + character);
	     }

	}

}
