// ==========================================================
// 1. ABSTRACTION (Kelas Abstrak)
// ==========================================================
// Class abstrak tidak bisa di-instansiasi menjadi objek langsung.
// Tujuannya adalah untuk mendefinisikan template/kerangka umum.
abstract class Bentuk {
    
    // Properti yang akan diwarisi
    protected String namaBentuk; 
    
    // Method abstrak: WAJIB diimplementasikan oleh Subclass/Child Class.
    // Ini menunjukkan ABSTRAKSI: kita tahu ada kemampuan 'hitungLuas', 
    // tetapi detailnya diserahkan ke Subclass.
    public abstract double hitungLuas();
    
    // Method Concrete (yang sudah memiliki implementasi)
    public void tampilkanNama() {
        System.out.println("Ini adalah: " + namaBentuk);
    }
}