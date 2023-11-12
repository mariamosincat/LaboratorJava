public class Main {

    public static void main(String[] args) {

        String cuvant = "masina";

        String mijloc = caractereMijloc(cuvant);
        System.out.println("Output asteptat: si");
        System.out.println("Output obtinut: " + mijloc);
    }

    private static String caractereMijloc(String cuvant) {
        int lungime = cuvant.length();
        int mijlocIndex = lungime / 2;

        if (lungime % 2 == 0) {

            return cuvant.substring(mijlocIndex - 1, mijlocIndex + 1);
        } else {
            return cuvant.substring(mijlocIndex, mijlocIndex + 1);
        }
    }
}
