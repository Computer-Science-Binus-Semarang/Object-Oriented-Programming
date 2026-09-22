import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        // 1. ArrayList: Menyimpan daftar urut, boleh ada duplikat
        ArrayList<String> daftarBuah = new ArrayList<>();
        daftarBuah.add("Apel");
        daftarBuah.add("Jeruk");
        daftarBuah.add("Apel"); // "Apel" kedua tetap masuk

        System.out.println("ArrayList: " + daftarBuah);
        // Output: [Apel, Jeruk, Apel]
        // Akses via indeks:
        System.out.println("Buah pertama: " + daftarBuah.get(0)); // Apel


        // 2. HashSet: Menyimpan data unik, duplikat otomatis ditolak
        HashSet<String> buahUnik = new HashSet<>();
        buahUnik.add("Apel");
        buahUnik.add("Jeruk");
        buahUnik.add("Apel"); // Diabaikan karena sudah ada

        System.out.println("\nHashSet: " + buahUnik);
        // Output: [Apel, Jeruk] (hanya 2 item)
        // Cek keberadaan data:
        System.out.println("Ada Jeruk? " + buahUnik.contains("Jeruk")); // true


        // 3. HashMap: Menyimpan pasangan Kunci (Key) -> Nilai (Value)
        HashMap<String, Integer> stokBuah = new HashMap<>();
        stokBuah.put("Apel", 10);
        stokBuah.put("Jeruk", 25);
        stokBuah.put("Apel", 15); // Key "Apel" diperbarui nilainya jadi 15

        System.out.println("\nHashMap: " + stokBuah);
        // Output: {Apel=15, Jeruk=25}
        // Akses via kunci:
        System.out.println("Stok Apel: " + stokBuah.get("Apel")); // 15
    }
}
