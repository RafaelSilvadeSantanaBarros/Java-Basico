package GeometriaPlana.Quadrado.Perimetro;

import java.util.Scanner;

public class Circunferencia {
    public static double perimetro(double l) {
        return (l * 4);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe o distância de um lado do quadrado");
            double lado = in.nextDouble();
            System.out.println("O perimetro do quadrado é: " + perimetro(lado));
        } finally {
            in.close();
        }
    }
}
