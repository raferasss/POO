public class Quadrado {

    //atributos
    int base;
    double area, perimetro;

    //metodos
    double calcularArea(int base) {
        area = base * base;
        return area;
    }

    double calcularPerimetro(int base) {
        perimetro = 4 * base;
        return perimetro;
    }

}
