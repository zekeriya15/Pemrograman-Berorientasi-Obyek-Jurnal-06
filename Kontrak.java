public class Kontrak extends Karyawan {
    private int waktu;

    public Kontrak(String nama, int waktu, double gaDas) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display() {
        // System.out.println("\nNama karyawan kontrak: " + this.nama + "\nGaji dasar: " + this.gaDas + "\nWaktu: " + this.waktu);
        super.display();
        System.out.println("Waktu: " + this.waktu);
    }
}
