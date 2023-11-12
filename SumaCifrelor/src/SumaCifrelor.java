import java.util.Scanner;
public class SumaCifrelor {
    static int sumaCifrelor(int numar) {
        int suma = 0;

        while (numar != 0) {
            suma += numar % 10;
            numar /= 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar intreg: ");
        int numar = scanner.nextInt();

        int rezultat = sumaCifrelor(numar);

        System.out.println("Suma cifrelor este: " + rezultat);
    }
}
