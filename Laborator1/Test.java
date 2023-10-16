package Laborator1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Introduceti n=");
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            int p = i * i;
            System.out.println("Patratul este:" + p);
        }
    }
}
