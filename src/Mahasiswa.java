public class Mahasiswa {
    String nama;
    String Nim;
    String Jurusan;

    public Mahasiswa(String nama, String Nim, String Jurusan) {  // constractor
        this.nama = nama;
        this.Nim = Nim;
        this.Jurusan = Jurusan;
    }
    public static void main(String[]args) {
        Mahasiswa mhs1 = new Mahasiswa("Muhammad Rafie Al Ghifari", "24552011052", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Aldi Firmansyah", "24556789", "Pariwisata" ); //object
        System.out.println();
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();

    }
    public void tampilkanInfo() {
        System.out.printf("Nama : %s \n", this.nama);
        System.out.printf("Nim : %s \n", this.Nim);
        System.out.printf("Jurusan : %s \n", this.Jurusan);

    }
}
