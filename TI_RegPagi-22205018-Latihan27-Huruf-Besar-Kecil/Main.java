/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = HURUF BESAR KECIL
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main {

	// Jalankan method main
	public static void main(String[] args) {

		 // Init inputan scanner dan set variabel
		 Scanner input = new Scanner(System.in);
		 String kalimat;
		 
		 // Masukkan kalimat
		 System.out.print("Masukkan kalimat : ");
		 kalimat = input.nextLine();
		 
		 // Tampilkan hasil
		 System.out.println();
		 System.out.println("==== Hasil Formatting ====");

		 // Hasil huruf besar
		 System.out.println("Huruf Besar : " + kalimat.toUpperCase());

		 // Hasil huruf kecil
		 System.out.println("Huruf Kecil : " + kalimat.toLowerCase());

	}

}
