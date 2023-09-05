public class Retangulo {

    //atributos
    int base, altura;
    double area, perimetro;

    //metodos
    double calcularArea(int base, int altura) {
        area = base * altura;
        return area;
    }

    double calcularPerimetro(int base, int altura) {
        perimetro = (base + altura) * 2;
        return perimetro;
    }
}
