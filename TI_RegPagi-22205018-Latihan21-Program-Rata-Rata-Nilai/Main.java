/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = PROGRAM RATA RATA NILAI
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main{

	 // Jalankan method main	
	 public static void main(String[] args){

	  // Set variabel
	  String nama; 
	  double rata;

	  // Tampung variabel nilai sebagai array
	  int[] nilai = new int[100]; 

	  // Init scanner input
	  Scanner input = new Scanner(System.in);
	
	  // Tanya berapa banyak mahasiswa yang di masukkan
	  System.out.print("Masukkan banyak nya mahasiswa : ");
	  double jmlMahasiswa = input.nextInt();
	
	  // Set variabel
	  int sum = 0; 

	  // Looping 
	  for (int i = 1; i <= jmlMahasiswa; i++) {

	    // Tanya berapa mahasiswa ke sekian untuk di masukkan nilai
	    System.out.print("Nilai mahasiswa ke - "+i+" : ");     
	    nilai[i] = input.nextInt(); 

	    // Masukkan variabel array nilai dalam sum
	    sum += nilai[i];
	  }
	
	  // Proses rata rata
	  rata = sum/jmlMahasiswa; 
	 
	  // Tampilkan
	  System.out.println("Maka, rata rata nilai nya adalah = "+rata);
	  System.out.println("Developed By : Galih Anggoro Prasetya");
	 }
}