public class Circulo {

    //atributos
    int raio;
    double area, perimetro;

    //metodos
    double calcularArea(int raio) {
        area = 3.14 * (raio * raio);
        return area;
    }

    double calcularPerimetro(int raio) {
        perimetro = 3.14 * 2 * raio;
        return perimetro;
    }
}
