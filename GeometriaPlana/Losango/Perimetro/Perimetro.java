package GeometriaPlana.Losango.Perimetro;
import java.util.Scanner;
public class Perimetro {

    public static double perimetro(double l) {
        return (4*l);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe a distância de um lado do Losango");
            double lado = in.nextDouble();
            System.out.println("A area do Losango é: " + perimetro(lado));
        } finally {
            in.close();
        }
    }
}

