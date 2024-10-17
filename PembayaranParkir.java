import java.util.Scanner;

public class PembayaranParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPembayaran = 0, jenisKendaraan, durasiParkir, tarifParkir;

        while (true) {
            System.out.println("Masukkan jenis kendaraan :");
            System.out.println("1 untuk mobil");
            System.out.println("2 untuk motor");
            System.out.println("0 untuk keluar");
            
            jenisKendaraan = scanner.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Input tidak valid. Silakan masukkan jenis kendaraan yang valid.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasiParkir = scanner.nextInt();

            if (durasiParkir < 0) {
                System.out.println("Input tidak valid. Silakan masukkan durasi parkir yang valid.");
                continue;
            }

            tarifParkir = 0;

            if (durasiParkir > 5) {
                tarifParkir = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    tarifParkir = 3000 * durasiParkir;
                } else {
                    tarifParkir = 2000 * durasiParkir;
                }
            }

            totalPembayaran = totalPembayaran + tarifParkir;

            System.out.println("Jenis kendaraan: " + (jenisKendaraan == 1 ? "Mobil" : "Motor"));
            System.out.println("Durasi parkir: " + durasiParkir + " jam");
            System.out.println("Tarif parkir: Rp " + tarifParkir);
            System.out.println();
        }

        System.out.println("Total pembayaran: Rp " + totalPembayaran);
    }
}