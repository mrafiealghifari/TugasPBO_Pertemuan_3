public class mainPerpustakaan {
    public static void main(String[]args){
        //objek perpustakaan
       Perpustakaan perpustakaan = new Perpustakaan ("Perpustakaan Sekolah");

       //Menambahkan Buku
        Buku buku1 = new Buku("001", "Naruto Shipudden", " Masashi Kisimoto");
        Buku buku2 = new Buku("002", "The shining", "Stepen King");
        Buku buku3 = new Buku("003", "Psycology Of Money", "Morgan Housel");
        Buku buku4 = new Buku("004", "48 Laws of power", "Robert Greene");
        Buku buku5 = new Buku("005", "Harry Potter", "Rowling");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);
        perpustakaan.tambahBuku(buku5);

        perpustakaan.tampilkanKoleksiBuku();

        System.out.println("\n=== Proses Peminjaman ===");
        perpustakaan.pinjamBuku("A001" , "004");
        perpustakaan.pinjamBuku("A002" , "003");
        perpustakaan.pinjamBuku("A003" , "007");
        perpustakaan.pinjamBuku("A005" , "001");
        perpustakaan.pinjamBuku("A004" , "002");
        perpustakaan.pinjamBuku("A002" , "005");

        perpustakaan.tampilkanKoleksiBuku();

        perpustakaan.tampilkanLogPeminjaman();


}



}
