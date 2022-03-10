package studikasus;

public class Mobil {
    String noPlat;
    String merkMobil;
    String warnaMobil;
    int tahunKeluaranMobil;

    public Mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaranMobil){
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaranMobil = tahunKeluaranMobil;
    }

    public void tingkahLaku() {
        if (tahunKeluaranMobil <= 2022 && tahunKeluaranMobil > 2017) {
            System.out.println("Rute           : Banyuwangi - Malang");
        }
        else if (tahunKeluaranMobil <= 2017 && tahunKeluaranMobil > 2012) {
            System.out.println("Rute           : Madura - Malang");
        }
        else{
            System.out.println("Rute           : Surabaya - Malang");
        }
    }

    public void getInfo() {
        System.out.println("-------------- RINCIAN MOBIL --------------");
        System.out.println("Nomor Plat        : " + this.noPlat);
        System.out.println("Merk Mobil        : " + this.merkMobil);
        System.out.println("Warna Mobil       : " + this.warnaMobil);
        System.out.println("Tahun Produksi    : " + this.tahunKeluaranMobil);
        System.out.println("============================================");
    }
}
