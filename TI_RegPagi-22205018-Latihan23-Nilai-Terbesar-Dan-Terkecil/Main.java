/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = NILAI TERBESAR DAN TERKECIL
*/

// Import library java
import java.util.Scanner;

// Init class Main
public class Main {

	// Jalankan method main
	public static void main(String[] args) {
		
	    // Init inputan scanner dan set variabel
	    Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
	    int arr_count, i, max_num, min_num;
	    String tanyaPetugas;
        
	    // Tampilkan nama program
	    System.out.println("=====Program Nilai Terbesar Dan Terkecil Nilai Mahasiswa=====");
	    System.out.println();
	   
	    // Masukkan nama petugas
	    System.out.print("Masukkan nama petugas : ");
	    tanyaPetugas = input.nextLine();
	    
	    // Masukkan banyak nya nilai mahasiswa
	    System.out.print("Masukkan banyaknya nilai mahasiswa : ");
	    arr_count = input.nextInt();
	      
	    // Looping 
	    for(i = 0; i < arr_count; i++){
	     
	      // Tanya berapa mahasiswa ke sekian untuk di masukkan nilai
	      System.out.print("Masukkan nilai mahasiswa ke - "+ (i + 1) + " = ");
	      arr[i] = input.nextInt();
	      
	    }
	    
	    // Tampung variabel max_num dan min_num sebagai nilai sementara pada array
	    max_num = arr[0]; 
	    min_num = arr[0]; 
	    
	    // Looping untuk memproses
	    for (i=0; i < arr_count; i++){

		 // Jika nilai nya lebih besar 
	    	 if(arr[i] > max_num){

			// Tampung variabel max_num
			max_num = arr[i];
		      }
		      
		 // Jika nilai nya lebih kecil
	    	 if(arr[i] < min_num){
		
			// Tampung variabel min_num
			min_num = arr[i];
		      } 
        }
	    
	    // Lalu tampilkan hasil nya
	    System.out.println();
	    System.out.println("=====Hasil Nilai Mahasiswa=====");
	    
	    for (i = 0; i < arr_count; i++) {
            System.out.println("Nilai mahasiswa ke - " + (i + 1) + " = " + arr[i]);
        }
	    
	    System.out.println();
		System.out.println("Nilai terbesar adalah : " + max_num);
		System.out.println("Nilai terkecil adalah : " + min_num);
		System.out.println("Petugas : " + tanyaPetugas);
	      
	  }

	}
