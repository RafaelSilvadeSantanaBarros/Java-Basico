package GeometriaPlana.Retangulo.Perimetro;
import java.util.Scanner;
public class Perimetro {
  
    public static double perimetro(double b,double a) {
        return (2*(b+a));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe o distância da base");
            double base = in.nextDouble();
            System.out.println("Informe o distância da altura");
            double altura = in.nextDouble();
            System.out.println("O perimetro do quadrado é: " + perimetro(base,altura));
        } finally {
            in.close();
        }
    }
}
