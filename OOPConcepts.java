import java.util.Scanner;

public class OOPConcepts {
    
   
    // Metode Bagian 1: Deklarasi Dasar dan Variabel
    
    public void basicConcepts() {
        System.out.println("--- Bagian 1: Variabel dan Tipe Data ---");
        // Access Modifier: public, private, protected
        
        int myInteger = 10;
        double myDouble = 20.5;
        char myChar = 'A';
        boolean myBoolean = true;
        String myString = "Hello, Java!";

        System.out.println("Nilai Integer: " + myInteger);
        System.out.println("Nilai Double: " + myDouble);
        System.out.println("Nilai Boolean: " + myBoolean);
        System.out.println("Nilai String: " + myString);

        // Menampilkan karakter dan nilai ASCII
        System.out.println("Nilai Karakter: " + myChar);
        int asciiValue = myChar;
        System.out.println("Nilai ASCII dari " + myChar + " adalah: " + asciiValue);
    }
    
   
    // Metode Bagian 2: Input dan Output
    
    public void inputOutput() {
        System.out.println("\n--- Bagian 2: Input dan Output ---");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String name = input.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int age = input.nextInt();

        System.out.println("Halo, " + name + "! Usia Anda adalah " + age + " tahun.");
        
        input.close();
    }
    
    
    // Metode Bagian 3: Kondisi dan Perulangan (if, while, for)
    
    public void selectionAndLoop() {
        System.out.println("\n--- Bagian 3: Kondisi dan Perulangan ---");
        int score = 75;
        if (score >= 80) {
            System.out.println("Selamat, Anda lulus dengan nilai A!");
        } else if (score >= 60) {
            System.out.println("Anda lulus.");
        } else {
            System.out.println("Maaf, Anda tidak lulus.");
        }

        System.out.println("\n--- Perulangan dengan While ---");
        int count = 0;
        while (count < 3) {
            System.out.println("While loop: " + count);
            count++;
        }

        System.out.println("\n--- Perulangan dengan For ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop: " + i);
        }
    }

    
    // Metode Bagian 4: Perulangan Bertingkat dan Switch
    
    public void nestedAndSwitch() {
        System.out.println("\n--- Bagian 4: Perulangan Bertingkat dan Switch ---");
        System.out.println("Contoh Nested Loop (pola bintang):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int day = 3;
        System.out.print("Hari ke-" + day + " adalah: ");
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }
    }

    
    // Metode Bagian 5: Break, Continue, dan Label
    
    public void breakContinueLabel() {
        System.out.println("\n--- Bagian 5: Break, Continue, dan Label ---");
        System.out.println("Contoh Break:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Loop dengan break: " + i);
        }

        System.out.println("\nContoh Continue:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Loop dengan continue: " + i);
        }

        System.out.println("\nContoh Label:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
            }
        }
    }

    
    // Metode Bagian 6: Contoh Berbagai Jenis Error
    
    public void errorExamples() {
        // System.out.println("\n--- Bagian 6: Contoh Berbagai Jenis Error ---");

        // Contoh Syntax Error:
        // System.out.println("Ini akan menyebabkan error sintaks") // Semicolon hilang

        // Contoh Runtime Error (ArithmeticException):
        // int result = 10 / 0;

        // Contoh Logic Error:
        // int a = 10;
        // int b = 5;
        // int c = a - b;
        // System.out.println("Hasil yang salah: " + c);

        // Contoh Common Error (NullPointerException):
        // String str = null;
        // System.out.println(str.length());
    }

   
    // Main Method
    
    public static void main(String[] args) {
        // Buat satu objek untuk mengakses semua metode
        OOPConcepts obj = new OOPConcepts();
        
        // Aktifkan metode yang ingin dijalankan Uncomment baris di bawah ini untuk menguji bagian-bagian lainnya
        // obj.basicConcepts();
        // obj.inputOutput();
        // obj.selectionAndLoop();
        // obj.nestedAndSwitch();
        // obj.breakContinueLabel();
        // obj.errorExamples();
    }
}