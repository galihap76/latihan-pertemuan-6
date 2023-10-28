/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = GANTI KATA
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main {

        // Jalankan method main
	public static void main(String[] args) {

		// Init inputan scanner dan set variabel
		Scanner input = new Scanner(System.in);
		String kalimat, gantiKata, kataBaru, formatKataBaru;
		 
		// Masukkan kalimat
		System.out.print("Masukkan kalimat : ");
		kalimat = input.nextLine();
		
		// Masukkan ganti kata
		System.out.print("Ganti kata : ");
		gantiKata = input.nextLine();
		
		// Kata yang mau di ganti
		System.out.print("Menjadi kata : ");
		kataBaru = input.nextLine();
		
		// Set variabel untuk mengganti kata baru
		formatKataBaru = kalimat.replace(gantiKata, kataBaru);
		System.out.println();
		
		// Tampilkan hasil nya
		System.out.println("=== Hasil Formatting ===");
		System.out.println("Kalimat awal : " + kalimat);
		System.out.println("Kalimat baru : " + formatKataBaru);

	}

}
