import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Problema1();
        Problema2();

    }
    public static void Problema1(){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduceti n=");
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            int p = i * i;
            System.out.println("Patratul este:" + p);
        }
    }

    public static void Problema2(){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduceti n=");
        int n=in.nextInt();
        int s=0; int p=1;
        for (int i = 1; i <= n; i++) {
            if(i%2==0) {
                s = s + i;
            }
            else{
                p=p*i;

        }
    }
        System.out.println("Suma este:" + s);
        System.out.println("Produsul este:" + p);
}
    }
