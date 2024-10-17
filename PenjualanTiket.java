import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTiket = 0;
        int totalHarga = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau -1 untuk keluar): ");
            int jumlahTiket = scanner.nextInt();

            if (jumlahTiket == -1) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang valid.");
                continue;
            }

            int hargaTiket = 50000;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            int hargaDiskon = (int) (hargaTiket * diskon);
            int hargaBayar = hargaTiket - hargaDiskon;

            totalTiket += jumlahTiket;
            totalHarga += hargaBayar * jumlahTiket;

            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Harga tiket per unit: Rp " + hargaTiket);
            System.out.println("Diskon: " + diskon * 100 + "%");
            System.out.println("Harga bayar per unit: Rp " + hargaBayar);
            System.out.println("Total harga bayar: Rp " + hargaBayar * jumlahTiket);
            System.out.println();
        }

        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + totalHarga);
    }
}