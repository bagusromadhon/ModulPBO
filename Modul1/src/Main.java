import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();


        String jenisKelamin;
        while (true) {
            System.out.print("Tentukan Jenis Kelamin anda Option hanya (L/P): ");
            String jenisKelaminInput = scanner.nextLine();
            if (jenisKelaminInput.equalsIgnoreCase("L")) {
                jenisKelamin = "Laki-laki";
                break;
            } else if (jenisKelaminInput.equalsIgnoreCase("P")) {
                jenisKelamin = "Perempuan";
                break;
            } else {
                System.out.println("Maaf, pilihan hanya L atau P. Silakan coba lagi.");
            }
        }


        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);


        LocalDate now = LocalDate.now();
        long betweenYears = ChronoUnit.YEARS.between(tanggalLahir, now);
        long betweenMonth = ChronoUnit.MONTHS.between(tanggalLahir.plusYears(betweenYears), now);

        // Output data diri
        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + betweenYears + " tahun " + betweenMonth + " bulan");
    }
}