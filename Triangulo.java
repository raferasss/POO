public class Triangulo {

    //atributos
    int base, altura;
    int area, perimetro;

    //metodos
    double calcularArea(int base, int altura) {
        area = (base * altura) / 2;
        return area;
    }

    double calcularPerimetro(int base) {
        perimetro = base * 3;
        return perimetro;
    }
}
