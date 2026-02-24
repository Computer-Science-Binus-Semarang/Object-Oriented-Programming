public class BelajarLogika {
    public static void main(String[] args) {
        
        int angka = 10;

        // 1. IF (Percabangan) - Digunakan untuk mengambil keputusan
        System.out.println("--- Contoh IF ---");
        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5");
        } else {
            System.out.println("Angka kurang dari atau sama dengan 5");
        }

        // 2. FOR (Perulangan Terhitung) - Digunakan saat kita tahu jumlah perulangannya
        System.out.println("\n--- Contoh FOR ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Perulangan for ke-" + i);
        }

        // 3. WHILE (Perulangan Berdasarkan Kondisi) - Terus berjalan selama kondisi true
        System.out.println("\n--- Contoh WHILE ---");
        int counter = 1;
        while (counter <= 3) {
            System.out.println("Perulangan while ke-" + counter);
            counter++; // Penting agar tidak terjadi infinite loop
        }
    }
}
