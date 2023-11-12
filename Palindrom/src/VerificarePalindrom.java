import java.util.Scanner;

public class VerificarePalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduceți un cuvânt pentru a verifica dacă este palindrom: ");
        String cuvant = scanner.nextLine();


        if (estePalindrom(cuvant)) {
            System.out.println(cuvant + " este un cuvânt palindrom.");
        } else {
            System.out.println(cuvant + " nu este un cuvânt palindrom.");
        }
    }


    public static boolean estePalindrom(String cuvant) {
        cuvant = cuvant.replaceAll("\\s", "").toLowerCase();


        int lungime = cuvant.length();
        for (int i = 0; i < lungime / 2; i++) {
            if (cuvant.charAt(i) != cuvant.charAt(lungime - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
