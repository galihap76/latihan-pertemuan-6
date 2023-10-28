/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = TARGET SALDO TABUNGAN
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
        int saldoAwal,bungaPerbulan,saldoTarget;

 	// Tanya saldo awal
        System.out.print("Saldo Awal (Rp): ");
        saldoAwal = inputan.nextInt();

	// Tanya bunga / bulan
        System.out.print("Bunga / Bulan (%): ");
        bungaPerbulan = inputan.nextInt();

	// Tanya saldo target
        System.out.print("Saldo Target (Rp): ");
        saldoTarget = inputan.nextInt();

	// Proses saldo target
        int bulan = (saldoTarget-saldoAwal)/(saldoAwal*bungaPerbulan/100);

 	// Init format nilai ke desimal 
        NumberFormat formatter = new DecimalFormat("#,###,###");

  	// Looping	  
        for(int i = 1;i<= bulan;i++) {
        	 
	    // Proses saldo target
            saldoAwal += saldoAwal * bungaPerbulan / 100;

	    // Format saldo ke desimal
            String formattedSaldo = "Rp. " + formatter.format(saldoAwal);

	    // Ganti koma (,) ke titik (.)
            formattedSaldo = formattedSaldo.replace(",", ".");
	
	    // Tampilkan hasil
            System.out.println("Saldo di bulan ke - " + i + " " + formattedSaldo);
        }
    }
}
