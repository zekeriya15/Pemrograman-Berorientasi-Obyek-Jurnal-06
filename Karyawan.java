class Karyawan {
    protected String nama;
    protected double gaDas;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        this.gaDas = gaDas;
    }

    public void display() {
        System.out.println("\nNama karyawan: " + this.nama + "\nGaji dasar: " + this.gaDas);
    }
}