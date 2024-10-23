public class Tetap extends Karyawan{
    private double tuDas;

    public Tetap(String nama, double tuDas, double gaDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        // System.out.println("\nNama karyawan tetap: " + this.nama + "\nGaji dasar: " + this.gaDas + "\nTunjangan dasar: " + this.tuDas);
        super.display();
        System.out.println("Tunjangan dasar: " + this.tuDas);

    }
}
