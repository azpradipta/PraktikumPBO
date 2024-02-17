import java.util.Scanner;
import java.lang.Math;

public class Bangun_Ruang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n.:: SELAMAT DATANG DI PROGRAM BANGUN RUANG ::.\n");

        System.out.println(".:: PILIH BANGUN RUANG ::.\n");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("\nKetikkan angka pilihan Anda: ");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.print("\nMasukkan nilai panjang sisi kubus: ");
                float sisi = input.nextFloat();
                System.out.println("\nLuas permukaan Kubus adalah: " + 6 * sisi);
                System.out.println("Volume Kubus adalah: " + Math.pow(sisi, 3));
                break;
            case 2:
                System.out.print("\nMasukkan nilai panjang balok: ");
                float panjangBalok = input.nextFloat();
                System.out.print("Masukkan nilai lebar balok: ");
                float lebarBalok = input.nextFloat();
                System.out.print("Masukkan nilai tinggi balok: ");
                float tinggiBalok = input.nextFloat();
                System.out.println("\nLuas permukaan Balok adalah: " + 2 * (panjangBalok * lebarBalok + lebarBalok * tinggiBalok + panjangBalok * tinggiBalok));
                System.out.println("Volume Balok adalah: " + panjangBalok * lebarBalok * tinggiBalok);
                break;
            case 3:
                System.out.print("\nMasukkan nilai jari-jari tabung: ");
                float jariTabung = input.nextFloat();
                System.out.print("Masukkan nilai tinggi tabung: ");
                float tinggiTabung = input.nextFloat();
                System.out.println("\nLuas permukaan Tabung adalah: " + 2 * Math.PI * jariTabung * (jariTabung + tinggiTabung));
                System.out.println("Volume Tabung adalah: " + Math.PI * Math.pow(jariTabung, 2) * tinggiTabung);
                break;
            default:
                System.out.println("Masukkan angka tidak valid!!");
                break;
        }

        System.out.println("\nTerimakasih telah menggunakan Program ini!");
        input.close();
    }
}
