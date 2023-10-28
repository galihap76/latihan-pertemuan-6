/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = SALDO TABUNGAN
*/

// Import library java
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

// Init class Main
public class Main {

    // Jalankan method main
    public static void main(String[] args) {
    	
	    // Init inputan scanner
    	    Scanner inputan = new Scanner(System.in);

	    // Set variabel
    	    int saldoAwal, bungaPerBulan, lamaBulan;

	    // Tanya saldo awal
    	    System.out.print("Saldo awal: ");
    	    saldoAwal = inputan.nextInt();

	    // Tanya bunga / bulan
    	    System.out.print("Bunga / bulan (%): ");
    	    bungaPerBulan = inputan.nextInt();

	    // Tanya berapa lama bulan
    	    System.out.print("Lama (bulan): ");
    	    lamaBulan = inputan.nextInt();
    	    
            // Init format nilai ke desimal 
    	    NumberFormat formatter = new DecimalFormat("#,###");

	    // Looping hasil	   
    	    for (int i = 1; i <= lamaBulan; i++) {

		// Proses saldo
    	        saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);

		// Format saldo ke desimal
    	        String formattedSaldo = "Rp." + formatter.format(saldoAwal);

		// Ganti koma (,) ke titik (.)
    	        formattedSaldo = formattedSaldo.replace(",", ".");

		// Tampilkan hasil
    	        System.out.println("Saldo di bulan ke-" + i + " Rp." + formattedSaldo);
    	    }
       
    }
    
}
