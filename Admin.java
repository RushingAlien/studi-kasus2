package studikasus;

public class Admin extends Karyawan {
    private int tunjangan;

    public Admin(String nama, String alamat, String nomorTelepon, String jenisKelamin, String kategoriKaryawan, int tunjangan) {
        super(nama, alamat, nomorTelepon, jenisKelamin, "Admin");
        this.tunjangan = tunjangan;
    }
    public int getTunjangan() {
        return tunjangan;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Tunjangan         : " + this.getTunjangan());
        System.out.println("============================================");
    }

    public void mendata() {
        System.out.println("Admin sedang mendata pesanan pelanggan");
        System.out.println("============================================\n");
    }
}
