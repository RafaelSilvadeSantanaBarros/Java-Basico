package GeometriaPlana.Triangulo.Perimetro;
import java.util.Scanner;
public class Perimetro {    
    public static double perimetro(double a,double b,double c) {
        return (a+b+c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Informe o primeiro lado do triangulo");
            double a = in.nextDouble();
            System.out.println("Informe o distância da altura");
            double b = in.nextDouble();
            System.out.println("Informe o distância da base");
            double c = in.nextDouble();
            System.out.println("A area do triangulo é: " + perimetro(a,b,c));
        } finally {
            in.close();
        }
    }
}

    


