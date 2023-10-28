/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = PROGRAM TUNJANGAN  
*/

// Import library scanner
import java.util.Scanner;

// Init class Main
public class Main {

	// Jalankan method main
    public static void main(String[] args) {
    	
    	// Print program tunjangan
        System.out.println("===== PROGRAM TUNJANGAN =====");

        // Init input scanner
        Scanner input = new Scanner(System.in);
        
        // Set variabel tunjanga dan tanya status menikah
        double tunjangan;
        String tanyaStatusMenikah;

        // Print untuk tanya berapa gaji perbulan
        System.out.print("Berapa gaji pokok Anda perbulan ? : ");

        // Inputan untuk memasukkan gaji pokok
        double gajiPokok = input.nextInt();
        
        // Membersihkan karakter baru (newline)
        input.nextLine(); 

        // Tanya ke pengguna apakah sudah menikah atau belum
        System.out.print("Status Anda? (Menikah / Belum) : ");
        tanyaStatusMenikah = input.nextLine(); 

        // Jika status nya menikah 
        if (tanyaStatusMenikah.equalsIgnoreCase("Menikah")) { 
        	
        	// Proses tunjangan untuk gaji pokok
            tunjangan = gajiPokok * 0.35;
            
            // Tampilkan hasil
            System.out.println("\n");
            System.out.println("===== Hasil Perhitungan Gaji Anda =====");

            System.out.println("Gaji Pokok : " + gajiPokok);
            System.out.println("Tunjangan : " + tunjangan);
            System.out.println("Total Gaji : " + (gajiPokok + tunjangan));
            System.out.println("(Developed by : Galih Anggoro Prasetya)");
        }
    }
}
