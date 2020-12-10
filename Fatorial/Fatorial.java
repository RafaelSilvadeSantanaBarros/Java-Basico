package Fatorial;

import java.util.Scanner;

public class Fatorial {

    /* Codigo para Fatorial */
    public static int fat(int n) {

        if (n == 0) {
            return 1;
        } else {
            int fact = n * fat(n - 1);
            return fact;
        }
    }

    public static void main(String Args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Quer saber o fatorial de qual n�mero?");
            int numfat = in.nextInt();
            System.out.println("O fatorial �: " + fat(numfat));
        } finally {
            in.close();
        }

    }
}
