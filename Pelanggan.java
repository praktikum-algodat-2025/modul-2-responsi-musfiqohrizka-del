public class Pelanggan {
    String nama;
    StackBuku stackBuku;

    public Pelanggan(String nama) {
        this.nama = nama;
        this.stackBuku = new StackBuku();
    }

    public void tambahBuku(String judul) {
        stackBuku.push(judul);
    }

    public void hapusBuku(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            stackBuku.pop();
        }
    }

    public void tampilkan() {
        System.out.println(nama);
        stackBuku.tampilkanBuku();
    }
}
