public class Karyawan {
    protected String KodeKaryawan;
    protected String nama;

    public Karyawan(String KodeKaryawan, String nama) {
        this.KodeKaryawan = KodeKaryawan;
        this.nama = nama;
    }
    
    public void absenPagi() {
        System.out.println(this.nama + " : absen pagi");
    }

    public void kerja() {
        System.out.println(this.nama + " : sedang bekerja");
    }

    public void absenPulang() {
        System.out.println(this.nama + " : absen pulang");
    }

    public void getInfo() {
        System.out.println("Kode Karyawan: " + this.KodeKaryawan);
        System.out.println("Nama: " + this.nama);
    }
}