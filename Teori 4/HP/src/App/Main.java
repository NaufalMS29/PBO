package App;

public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy A33");
        daftarHandphone[1] = new FeaturePhone("Oppo", "F1+");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.KirimPesan("0813120095",  " Sedang mengerjakan tugas pbo");
            if(hp instanceof Smartphone){
                ((Smartphone)hp).KirimPesan("Budi@univpancasil.ac.id", "Prak PBO", "Ajarin Prak PBO");
            } else {
                hp.KirimPesan("039414123", "02341234", "HandPhone ini dijual !!!");
            }
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                // Akses Internet
                ((Smartphone) hp).aksesInternet();
                System.out.println();
            } else if (hp instanceof FeaturePhone) {
                // Main Game Snake
                ((FeaturePhone) hp).mainGameSnake();
                System.out.println();
            }
        }

        // Mengirim pesan ke beberapa nomor sekaligus
        String[] daftarNomor = {"082435231234", "087642132424", "08231599241"};
        System.out.println("\n Mengirim Pesan ke beberapa nomor: ");
        for(Handphone hp : daftarHandphone){
            hp.KirimPesan(daftarNomor, " Tolong Simpan no baru saya (0891245123)");
        }
    }
}
