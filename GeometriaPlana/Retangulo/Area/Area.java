package GeometriaPlana.Retangulo.Area;
import java.util.Scanner;
public class Area {
    
    public static double area(double b,double a) {
        return (b*a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe o distância da base");
            double base = in.nextDouble();
            System.out.println("Informe o distância da altura");
            double altura = in.nextDouble();
            System.out.println("A area do retangulo é: " + area(base,altura));
        } finally {
            in.close();
        }
    }
}
