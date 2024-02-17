import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        System.out.println("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                }
                break;
            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil Modulus: " + hasil);
                } else {
                    System.out.println("Error: Modulus dengan nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }

        scanner.close();
    }
}
