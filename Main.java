import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //criação dos objetos
            Circulo c1 = new Circulo();
            Quadrado q1 = new Quadrado();
            Retangulo r1 = new Retangulo();
            Triangulo t1 = new Triangulo();

            //input dos atributos
            System.out.println("Digite o Raio do Circulo");
            c1.raio = input.nextInt();
            System.out.println("Digite o lado do Quadrado");
            q1.base = input.nextInt();
            System.out.println("Digite a base e altura do retangulo respectivamente");
            r1.base = input.nextInt();
            r1.altura = input.nextInt();
            System.out.println("Digite a base e altura do triangulo respectivamente");
            t1.base = input.nextInt();
            t1.altura = input.nextInt();

            //chamando os metodos
            System.out.println("Area do Circulo= "+ c1.calcularArea(c1.raio) + " m2");
            System.out.println("Perimetro do Circulo= " + c1.calcularPerimetro(c1.raio)+ " m");
            System.out.println("Area do Quadrado= "+ q1.calcularArea(q1.base) + " m2");
            System.out.println("Perimetro do Quadrado= "+ q1.calcularPerimetro(q1.base) + " m");
            System.out.println("Area do Retangulo= "+ r1.calcularArea(r1.base, r1.altura) + " m2");
            System.out.println("Perimetro do Retangulo= "+ r1.calcularPerimetro(r1.base, r1.altura) + " m");
            System.out.println("Area do Triangulo= "+ t1.calcularArea(t1.base,t1.altura) + " m2");
            System.out.println("Perimetro do Triangulo= "+ t1.calcularPerimetro(t1.base) + " m");
        }

}