package GeometriaPlana.Trapezio.Area;

import java.util.Scanner;

public class Area {
    public static double area(double B, double b,double a) {
        return (((B+b)*a)/2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe a distância da base maior");
            double B = in.nextDouble();
            System.out.println("Informe a distância da base menor");
            double b = in.nextDouble();
            System.out.println("Informe a distância da altura");
            double altura = in.nextDouble();
            System.out.println("A area do trapezio é: " + area(B, b, altura));
        } finally {
            in.close();
        }
    }
}
