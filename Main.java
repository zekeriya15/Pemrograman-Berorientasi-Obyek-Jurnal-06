public class Main {
    public static void main(String[] args) {

        Departemen it = new Departemen("IT");
        
        Tetap t1 = new Tetap("Budi", 50000, 100000);
        Tetap t2 = new Tetap("Azmi", 50000, 100000);
        Tetap t3 = new Tetap("Alfian", 50000, 100000);

        Kontrak k1 = new Kontrak("Budi2", 24, 50000);
        Kontrak k2 = new Kontrak("Azmi2", 24, 50000);
        Kontrak k3 = new Kontrak("Alfian2", 24, 50000);

        it.addKaryawan(t1);
        it.addKaryawan(t2);
        it.addKaryawan(t3);
        it.addKaryawan(k1);
        it.addKaryawan(k2);
        it.addKaryawan(k3);

        System.out.println("-- List semua karyawan --");
        it.displayAll();

        System.out.println();
        System.out.println("-- List semua karaywan tetap: --");
        it.displayTetap();

        System.out.println();
        System.out.println("-- List semua karyawan kontrak --");
        it.displayKontrak();


  
    }
}
