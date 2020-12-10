package GeometriaPlana.Losango.Area;

import java.util.Scanner;

public class Area {

    public static double area(double D, double d) {
        return ((D * d) / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe o distância da diagonal maior");
            double D = in.nextDouble();
            System.out.println("Informe o distância da diagonal menor");
            double d = in.nextDouble();
            System.out.println("A area do Losango é: " + area(D, d));
        } finally {
            in.close();
        }
    }
}
