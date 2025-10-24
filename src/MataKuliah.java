public class MataKuliah {
    // 1. Atribut
    private String namaMatkul;
    private int sks;

    // 2. Constructor
    public MataKuliah(String namaMatkul, int sks) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    // 3. getter
    public String getNamaMatkul() {
        return this.namaMatkul;
    }
    public int getSks() {
        return this.sks;
    }

    // 4. Setter
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }

    //5. Metode Intanse
    public void tampilkanInfo() {
        System.out.println("-- Informasi Mata Kuliah --");
        System.out.println("Nama  :" + this.namaMatkul);
        System.out.println("Sks   :" + this.sks);
        System.out.println("-------------------");
    }
    // Kelas Main untuk menjalankan dan menguji kelas MataKuliah.

    public static void main(String[] args) {
        MataKuliah mataKuliah1  = new MataKuliah("Pemrograman Berorientasi Objek", 3);
        MataKuliah mataKuliah2  = new MataKuliah( "Pendidikan Pancasila", 2);
        MataKuliah mataKuliah3  = new MataKuliah("Statistika", 2);

        System.out.println("\n-> Mengubah sks mata kuliah " + mataKuliah1.getNamaMatkul() + " menjadi 4....");
        mataKuliah1.setSks(4);

        System.out.println("\n-> Mengubah sks mata kuliah " + mataKuliah2.getNamaMatkul() + " menjadi 3....");
        mataKuliah2.setSks(3);

        System.out.println("\n-> Mengubah sks mata kuliah " + mataKuliah3.getNamaMatkul() + " menjadi 3....");
        mataKuliah1.setSks(3);

        // Menampilkan informasi terbaru
        mataKuliah1.tampilkanInfo();
        mataKuliah2.tampilkanInfo();

    }
}