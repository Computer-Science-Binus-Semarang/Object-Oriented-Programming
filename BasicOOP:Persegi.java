// ==========================================================
// 2. INHERITANCE (Pewarisan) & 3. ENCAPSULATION
// ==========================================================
// Class Persegi mewarisi semua sifat dan perilaku dari Class Bentuk.
class Persegi extends Bentuk {
    
    // ENCAPSULATION: Variabel 'sisi' disembunyikan menggunakan 'private'.
    private double sisi; 
    
    // Constructor
    public Persegi(double sisiAwal) {
        this.namaBentuk = "Persegi"; // Properti dari Parent Class
        this.sisi = sisiAwal;
    }
    
    // ENCAPSULATION: Public Getter Method untuk mengakses data 'private'
    public double getSisi() {
        return sisi;
    }
    
    // ENCAPSULATION: Public Setter Method untuk mengubah data 'private'
    public void setSisi(double sisiBaru) {
        if (sisiBaru > 0) {
            this.sisi = sisiBaru;
        }
    }
    
    // ==========================================================
    // 4. POLYMORPHISM (Method Overriding)
    // ==========================================================
    // Implementasi method abstrak dari Parent Class Bentuk.
    // Ini adalah bentuk Polymorphism: satu nama method ('hitungLuas') 
    // memiliki implementasi yang berbeda di setiap Class turunan.
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}