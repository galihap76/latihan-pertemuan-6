/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = PERBANDINGAN DUA BUAH NILAI
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main {

	// Jalankan method main
	public static void main(String[] args) {

		 // Init inputan scanner dan set variabel
		 Scanner input = new Scanner(System.in);
		 int nilaiPertama, nilaiKedua;
		 String tanyaLagi;
		 
		 // Looping 
		 while(true) {

		 // Masukkan nilai pertama
		 System.out.print("Masukkan nilai pertama : ");
		 nilaiPertama = input.nextInt();
		 
		 // Masukkan nilai kedua
		 System.out.print("Masukkan nilai kedua : ");
		 nilaiKedua = input.nextInt();
		 
		 // Membersihkan inputan sebagai baris baru
		 input.nextLine(); 
		 
		 // Jika nilai pertama lebih besar dari nilai kedua
		 if(nilaiPertama > nilaiKedua) {

		     // Tampilkan
		     System.out.println("Hasil : " + nilaiPertama + " lebih besar dari " + nilaiKedua);

		 // Jika nilai kedua lebih kecil dari nilai pertama
		 }else if(nilaiPertama < nilaiKedua) {

		     // Tampilkan
	    	     System.out.println("Hasil : " + nilaiPertama + " lebih kecil dari " + nilaiKedua);

		 }
		 
		 // Tanya apakah pengguna mau mengulangi aktifitas
		 System.out.print("Ulangi aktifitas? (Ya/Tidak) : ");
		 tanyaLagi = input.nextLine();
		 
		 // Jika "ya" ulangi kembali
		 if(tanyaLagi.equalsIgnoreCase("ya")) {
               		continue;

		  // Jika jawaban nya adalah "tidak"
		   }else if(tanyaLagi.equalsIgnoreCase("tidak")) {

		     // Hentikan program
			break;
		   }
		 
		 }
	}

}
