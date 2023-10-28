/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = PERHITUNGAN LINGKARAN
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main {

    // Jalankan method main
    public static void main(String[] args) {

    	try {

	// Init inputan scanner
        Scanner scanner = new Scanner(System.in);

	// Tampilkan nama program
        System.out.println("===perhitungan lingkaran===");

	// Masukkan diameter lingkaran
        System.out.print("Masukkan nilai diameter lingkaran : ");
        int diameter = scanner.nextInt();

	// Proses rumus diameter lingkaran
        int jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

	// Tampilkan hasil
        System.out.println("===hasil perhitungan lingkaran===");
        System.out.println("jari jari lingkaran = " + jariJari + " cm");
        System.out.printf("luas lingkaran = %.2f cm\n", luas);
        System.out.printf("keliling lingkaran = %.2f cm\n", keliling);

	// Handle error ketika masukkan tidak sesuai
    	} catch (Exception e) {
    		System.out.println("Nilai diameter tidak sesuai.");
    	}
    }
}
