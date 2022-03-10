package studikasus;

public class Karyawan {
    String nama;
    String alamat;
    String nomorTelepon;
    String jenisKelamin;
    String kategoriKaryawan;

    Karyawan(String nama, String alamat, String nomorTelepon, String jenisKelamin, String kategoriKaryawan) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.jenisKelamin = jenisKelamin;
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public void tingkahLaku() {
        if (kategoriKaryawan.equalsIgnoreCase("Supir Travel")) {
            System.out.println("Karyawan sedang menyetir travel\n");
        }
        else if (kategoriKaryawan.equalsIgnoreCase("Supir Rentcar")) {
            System.out.println("Karyawan sedang menyetir rentcar\n");
        }
        else if (kategoriKaryawan.equalsIgnoreCase("Admin")){
            System.out.println("Karyawan sedang mendata pesanan\n");
        }
    }

    public void resign() {
        System.out.println("Karyawan sudah mengundurkan diri");
    }

    public void getInfo() {
        System.out.println("-------------- DATA KARYAWAN --------------");
        System.out.println("Nama              : " + this.nama);
        System.out.println("Alamat            : " + this.alamat);
        System.out.println("Nomor Telepon     : " + this.nomorTelepon);
        System.out.println("Jenis Kelamin     : " + this.jenisKelamin);
        System.out.println("Kategori Karyawan : " + this.kategoriKaryawan);
    }
}
