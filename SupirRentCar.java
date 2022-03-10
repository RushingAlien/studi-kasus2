package studikasus;

public class SupirRentCar extends Karyawan {
    private Mobil mobil_sewa;

    public SupirRentCar(String nama, String alamat, String nomorTelepon, String jenisKelamin, String kategoriKaryawan, Mobil mobil_sewa) {
        super(nama, alamat, nomorTelepon, jenisKelamin, "Supir Rentcar");
        this.mobil_sewa = mobil_sewa;
    }

    public Mobil getMobil_sewa() {
        return mobil_sewa;
    }

    public void getInfo() {
        super.getInfo();
        mobil_sewa.getInfo();
    }

    public void mengemudi() {
        System.out.println("Supir Rentcar sedang mengemudi mobil sewaan");
        System.out.println("============================================\n");
    }
}
