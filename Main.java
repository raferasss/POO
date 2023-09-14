import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (args.length < 2) {
            System.out.println("Uso: java Main <TIPO DE MEDIDA> <FORMA GEOMETRICA>");
            return;
        }

        String medida = args[0];
        String forma = args[1];

        if (Objects.equals(medida, "perimetro")) {
            if (Objects.equals(forma, "circulo")) {
                Circulo c1 = new Circulo();
                System.out.println("Digite o Raio do Circulo");
                c1.raio = input.nextInt();
                System.out.println("Perimetro do Circulo= " + c1.calcularPerimetro(c1.raio) + " m");
            } else if (Objects.equals(forma, "quadrado")) {
                Quadrado q1 = new Quadrado();
                System.out.println("Digite o lado do Quadrado");
                q1.base = input.nextInt();
                System.out.println("Perimetro do Quadrado= " + q1.calcularPerimetro(q1.base) + " m");
            } else if (Objects.equals(forma, "retangulo")) {
                Retangulo r1 = new Retangulo();
                System.out.println("Digite a base e altura do retangulo respectivamente");
                r1.base = input.nextInt();
                r1.altura = input.nextInt();
                System.out.println("Perimetro do Retangulo= " + r1.calcularPerimetro(r1.base, r1.altura) + " m");
            } else if (Objects.equals(forma, "triangulo")) {
                Triangulo t1 = new Triangulo();
                System.out.println("Digite a base do triangulo respectivamente");
                t1.base = input.nextInt();
                System.out.println("Perimetro do Triangulo= " + t1.calcularPerimetro(t1.base) + " m");
            }else {
                System.out.println("comando invalido");
            }
        } else if (Objects.equals(medida, "area")) {
            if (Objects.equals(forma, "circulo")) {
                Circulo c1 = new Circulo();
                System.out.println("Digite o Raio do Circulo");
                c1.raio = input.nextInt();
                System.out.println("Area do Circulo= " + c1.calcularArea(c1.raio) + " m2");
            } else if (Objects.equals(forma, "quadrado")) {
                Quadrado q1 = new Quadrado();
                System.out.println("Digite o lado do Quadrado");
                q1.base = input.nextInt();
                System.out.println("Area do Quadrado= " + q1.calcularArea(q1.base) + " m2");
            } else if (Objects.equals(forma, "retangulo")) {
                Retangulo r1 = new Retangulo();
                System.out.println("Digite a base e altura do retangulo respectivamente");
                r1.base = input.nextInt();
                r1.altura = input.nextInt();
                System.out.println("Area do Retangulo= " + r1.calcularArea(r1.base, r1.altura) + " m2");
            } else if (Objects.equals(forma, "triangulo")) {
                Triangulo t1 = new Triangulo();
                System.out.println("Digite a base e altura do triangulo respectivamente");
                t1.base = input.nextInt();
                t1.altura = input.nextInt();
                System.out.println("Area do Triangulo= " + t1.calcularArea(t1.base, t1.altura) + " m2");
            }
        }else {
            System.out.println("comando invalido");
        }

    }
}


