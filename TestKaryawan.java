package studikasus;

import java.util.Scanner;

public class TestKaryawan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah karyawan   : ");
        int jumlahKaryawan = scan.nextInt(); scan.nextLine();
        System.out.println("");
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Masukkan nama karyawan     : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan alamat            : ");
            String alamat = scan.nextLine();
            System.out.print("Masukkan nomor telepon     : ");
            String nomorTelepon = scan.nextLine();
            System.out.print("Masukkan jenis kelamin     : ");
            String jenisKelamin = scan.nextLine();
            System.out.print("Masukkan kategori karyawan : ");
            String kategoriKaryawan = scan.nextLine();
            if (kategoriKaryawan.equalsIgnoreCase("Supir Travel")) {
                System.out.print("Masukkan rute trayek       : ");
                String rute_trayek = scan.nextLine();
                Karyawan supir_travel = new SupirTravel(nama, alamat, nomorTelepon, jenisKelamin, kategoriKaryawan,rute_trayek);
                getInfoKaryawan(supir_travel);
            }
            else if (kategoriKaryawan.equalsIgnoreCase("Supir Rentcar")) {
                System.out.print("Masukkan nomor plat        : ");
                String noPlat = scan.nextLine();
                System.out.print("Masukkan merk mobil        : ");
                String merkMobil = scan.nextLine();
                System.out.print("Masukkan warna mobil       : ");
                String warnaMobil = scan.nextLine();
                System.out.print("Masukkan tahun produksi    : ");
                int tahunKeluaranMobil = scan.nextInt(); scan.nextLine();
                Mobil mobil_sewa = new Mobil(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil);
                Karyawan supir_rentcar = new SupirRentCar(nama, alamat, nomorTelepon, jenisKelamin, kategoriKaryawan, mobil_sewa);
                getInfoKaryawan(supir_rentcar);
            }
            else if (kategoriKaryawan.equalsIgnoreCase("Admin")) {
                System.out.print("Masukkan tunjangan karyawan: ");
                int tunjangan = scan.nextInt(); scan.nextLine();
                Karyawan admin = new Admin(nama, alamat, nomorTelepon, jenisKelamin, kategoriKaryawan,tunjangan);
                getInfoKaryawan(admin);
            }
            else {
                System.out.println("============================================");
                System.out.println("Bukan termasuk kategori karyawan");
                System.out.println("Karyawan sudah mengundurkan diri");
                System.out.println("============================================\n");
            }
        }
    }
    static void getInfoKaryawan(Karyawan kar) {
        kar.getInfo();
        if (kar instanceof Admin) {
            Admin n = (Admin) kar;
            n.mendata();
        }
        else if (kar instanceof SupirRentCar) {
            SupirRentCar n = (SupirRentCar) kar;
            n.mengemudi();
        }
        else if (kar instanceof SupirTravel) {
            SupirTravel n = (SupirTravel) kar;
            n.mengemudi();
        }
    }
}