public class Main {
    public static void main(String[] args) {
        QueuePelanggan antrian = new QueuePelanggan();

        Pelanggan p1 = new Pelanggan("Pelanggan ke-1");
        p1.tambahBuku("Technical Analysis");
        p1.tambahBuku("Fundamental Analysis");
        p1.tambahBuku("Data Analysis");

        Pelanggan p2 = new Pelanggan("Pelanggan ke-2");
        p2.tambahBuku("Clean Code");
        p2.tambahBuku("The Pragmatic Programmer");
        p2.tambahBuku("Design Patterns");

        Pelanggan p3 = new Pelanggan("Pelanggan ke-3");
        p3.tambahBuku("Dune");
        p3.tambahBuku("Foundation");
        p3.tambahBuku("Hyperion");
        p3.tambahBuku("Neuromancer");

        Pelanggan p4 = new Pelanggan("Pelanggan ke-4");
        p4.tambahBuku("Sapiens: A Brief History of Humankind");
        p4.tambahBuku("Guns, Germs, and Steel");
        p4.tambahBuku("The Silk Roads");

        antrian.enqueue(p1);
        antrian.enqueue(p2);
        antrian.enqueue(p3);
        antrian.enqueue(p4);

        System.out.println("\n=== Antrian awal ===");
        antrian.tampilkanAntrian();

        System.out.println("\n=== setelah dequeue ===");
        antrian.dequeue();
        antrian.tampilkanAntrian();

        Pelanggan pBaru = new Pelanggan("Pelanggan ke-4");
        pBaru.tambahBuku("Tangkuban Perahu");
        pBaru.tambahBuku("Timun Mas");
        pBaru.tambahBuku("Resep Ayam Goyeng Upin Ipin");
        antrian.enqueue(pBaru);

        System.out.println("\n=== Enqueue Pelanggan Baru ===");
        antrian.tampilkanAntrian();

        Pelanggan pelanggan1Sekarang = antrian.peek();
        pelanggan1Sekarang.hapusBuku(2);

        System.out.println("\n=== Pelanggan Pertama Baru Pop 2 Kali ===");
        antrian.tampilkanAntrian();
    }
}