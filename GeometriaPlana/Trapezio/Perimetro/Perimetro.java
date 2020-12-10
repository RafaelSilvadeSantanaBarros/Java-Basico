package GeometriaPlana.Trapezio.Perimetro;

import java.util.Scanner;

public class Perimetro {
    public static double perimetro(double B, double b,double l1,double l2) {
        return (B+b+l1+l2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe a distância da base maior");
            double B = in.nextDouble();
            System.out.println("Informe a distância da base menor");
            double b = in.nextDouble();
            System.out.println("Informe a distância de um lado");
            double lado1 = in.nextDouble();
            System.out.println("Informe a distância do outro lado");
            double lado2 = in.nextDouble();
            System.out.println("A area do triangulo é: " + perimetro(B, b, lado1, lado2));
        } finally {
            in.close();
        }
    }
}
