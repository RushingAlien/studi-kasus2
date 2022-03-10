package studikasus;

public class SupirTravel extends Karyawan {
    private String rute_trayek;

    public SupirTravel(String nama, String alamat, String nomorTelepon, String jenisKelamin, String kategoriKaryawan, String rute_trayek) {
        super(nama, alamat, nomorTelepon, jenisKelamin, "Supir Travel");
        this.rute_trayek = rute_trayek;
    }
    public String getRute_trayek() {
        return rute_trayek;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Rute Mobil        : " + this.getRute_trayek());
        System.out.println("============================================");
    }

    public void mengemudi() {
        System.out.println("Supir Travel sedang mengemudi sesuai rute");
        System.out.println("============================================\n");
    }
}
