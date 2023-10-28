/*
   NAMA = GALIH ANGGORO PRASETYA
   NIM = 22205018
   PRODI = TEKNIK INFORMATIKA
   DESKRIPSI PROGRAM = WAKTU SAAT INI
*/

// Import library java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Init class Main
public class Main {

    // Jalankan method main
    public static void main(String[] args) {

	// Set variabel sebagai waktu dan tanggal lokal sekarang
        LocalDateTime myDateObj = LocalDateTime.now();

	// Format ke Indonesia
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss", Locale.forLanguageTag("in-ID"));
        String formattedDate = myDateObj.format(myFormatObj);

	// Tampilkan
        System.out.println("Hari ini adalah hari : " + formattedDate);
    }
}
