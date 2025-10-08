// ==========================================================
// 5. BASIC CONCEPTS (Class, Object, Method) & POLYMORPHISM (Overloading)
// ==========================================================
public class OOPDemo {

    // POLYMORPHISM: Method Overloading
    // Dua method dengan nama SAMA ('cetak') tetapi parameter BERBEDA.
    public static void cetak(String pesan) {
        System.out.println("Pesan String: " + pesan);
    }
    public static void cetak(double angka) {
        System.out.println("Pesan Angka: " + angka);
    }

    public static void main(String[] args) {
        
        // BASIC: OBJECT (Instansiasi Class)
        // Membuat Object 'persegiA' dari Class 'Persegi' melalui Constructor
        Persegi persegiA = new Persegi(5.0);
        
        // BASIC: Method Call (Panggil method dari objek)
        persegiA.tampilkanNama(); // Method diwarisi dari Bentuk (INHERITANCE)

        System.out.println("\n--- DEMO ENCAPSULATION ---");
        // Mengakses data 'private' melalui Getter (tidak bisa langsung persegiA.sisi)
        cetak("Sisi awal: " + persegiA.getSisi()); // POLYMORPHISM Overloading (panggil cetak(String))
        
        // Mengubah data 'private' melalui Setter
        persegiA.setSisi(7.0); 
        cetak("Sisi baru: " + persegiA.getSisi()); // POLYMORPHISM Overloading (panggil cetak(String))
        
        System.out.println("\n--- DEMO ABSTRACTION & POLYMORPHISM ---");
        // POLYMORPHISM Overriding (hitungLuas di Persegi)
        double luas = persegiA.hitungLuas(); 
        cetak(luas); // POLYMORPHISM Overloading (panggil cetak(double))
        
        // ABSTRACTION: Kita hanya perlu tahu bahwa setiap Bentuk memiliki hitungLuas(),
        // tanpa peduli apakah itu Persegi, Segitiga, atau Lingkaran.
    }
}