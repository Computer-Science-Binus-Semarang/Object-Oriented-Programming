/*
 * Full Java Code with separate functions for each topic.
 * Materi ini dibuat untuk tujuan pembelajaran.
 */

import java.util.Scanner;
import java.lang.Math;

public class FullCodeDemo {

    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------");
        System.out.println("Program Demo Berbagai Konsep Dasar Java");
        System.out.println("---------------------------------------------");

        // Memanggil setiap fungsi untuk menjalankan demo
        demoWrapperClass();
        System.out.println(); // Pemisah
        demoStringAndMath();
        System.out.println(); // Pemisah
        demoOperators();
        System.out.println(); // Pemisah
        demoExceptionHandling();
    }

    // ==========================================================
    // Fungsi untuk demonstrasi Wrapper Class
    // ==========================================================
    public static void demoWrapperClass() {
        System.out.println("### 1. Demo Wrapper Class");
        
        // Primitive types
        int primitiveInt = 100;
        double primitiveDouble = 25.5;

        // Wrapping primitive ke dalam objek
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped int: " + wrappedInt);
        
        // Menggunakan konstanta dari Wrapper Class
        System.out.println("Nilai Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Nilai Min Positive Float: " + Float.MIN_VALUE);
    }
    
    // ==========================================================
    // Fungsi untuk demonstrasi String dan Math
    // ==========================================================
    public static void demoStringAndMath() {
        System.out.println("### 2. Demo String dan Math Class");

        String greeting = "  Halo, selamat datang!   ";
        
        // Metode-metode String
        System.out.println("String asli: '" + greeting + "'");
        System.out.println("Panjang string: " + greeting.length());
        System.out.println("Dikonversi ke huruf kecil: " + greeting.toLowerCase());
        System.out.println("Dihilangkan spasi di awal/akhir: '" + greeting.trim() + "'");
        
        // Metode-metode Math
        System.out.println("Hasil Math.pow(2, 4) = " + Math.pow(2, 4));
        System.out.println("Hasil Math.round(3.7) = " + Math.round(3.7));
    }

    // ==========================================================
    // Fungsi untuk demonstrasi Operator
    // ==========================================================
    public static void demoOperators() {
        System.out.println("### 3. Demo Operasi Aritmetika, Relasional, dan Logika");

        // Operasi Aritmetika
        int x = 10;
        int y = 3;
        System.out.println("Hasil 10 + 3: " + (x + y));
        System.out.println("Hasil 10 % 3: " + (x % y));

        // Operator Increment dan Decrement
        int i = 5;
        System.out.println("Nilai i awal: " + i);
        System.out.println("Post-increment i++: " + i++);
        System.out.println("Nilai i setelah post-increment: " + i);

        // Operasi Relasional (Membandingkan)
        System.out.println("Apakah 10 > 3? " + (x > y));

        // Operasi Logika
        boolean p = true;
        boolean q = false;
        System.out.println("p AND q: " + (p && q));
        System.out.println("p OR q: " + (p || q));
    }
    
    // ==========================================================
    // Fungsi untuk demonstrasi Exception Handling
    // ==========================================================
    public static void demoExceptionHandling() {
        System.out.println("### 4. Demo Exception Handling");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan sebuah angka: ");
            int userInput = scanner.nextInt(); 
            System.out.println("Angka yang Anda masukkan: " + userInput);

            if (userInput == 0) {
                // Sengaja memicu ArithmeticException jika input 0
                throw new ArithmeticException("Tidak dapat melakukan pembagian dengan nol.");
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Kesalahan: Input yang dimasukkan harus berupa angka.");
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Blok finally: Ini selalu dieksekusi.");
            scanner.close();
        }
    }
}