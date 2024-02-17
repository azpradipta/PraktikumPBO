import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        // Input dua bilangan bulat
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka pertama: ");
        int angkaPertama = scanner.nextInt();
        System.out.print("Masukkan Angka kedua: ");
        int angkaKedua = scanner.nextInt();

        // Pilih operasi
        System.out.println("\nPilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");

        System.out.print("Pilihan Anda (1/2/3/4/5): ");
        int pilihan = scanner.nextInt();

        // Hitung hasil
        int hasil = 0;
        String operasi = "";
        switch (pilihan) {
            case 1:
                hasil = tambah(angkaPertama, angkaKedua);
                operasi = "Penjumlahan";
                break;
            case 2:
                hasil = kurang(angkaPertama, angkaKedua);
                operasi = "Pengurangan";
                break;
            case 3:
                hasil = kali(angkaPertama, angkaKedua);
                operasi = "Perkalian";
                break;
            case 4:
                hasil = bagi(angkaPertama, angkaKedua);
                operasi = "Pembagian";
                break;
            case 5:
                hasil = modulus(angkaPertama, angkaKedua);
                operasi = "Modulus";
                break;
            default:
                System.out.println("Error: Pilihan operasi tidak valid.");
                System.exit(0);
        }

        // Tampilkan hasil
        System.out.println("\nHasil dari " + operasi + " " + angkaPertama + " dan " + angkaKedua + " adalah " + hasil + ".");

        // Tutup Scanner
        scanner.close();
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static int bagi(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            System.exit(0);
            return 0; // Untuk menghindari kesalahan kompilasi (return harus ada di setiap kasus)
        }
    }

    public static int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Modulus dengan nol tidak diizinkan.");
            System.exit(0);
            return 0; // Untuk menghindari kesalahan kompilasi (return harus ada di setiap kasus)
        }
    }
}
