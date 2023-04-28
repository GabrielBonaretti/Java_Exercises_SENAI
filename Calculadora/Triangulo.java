public class Triangulo extends figurasPlanas{
    Double base;
    Double altura;
    Double lado;
    Triangulo(Double base, Double altura, Double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return (base*altura)/2;
    }

    @Override
    public double calculoPerimetro() {
        return lado*3;
    }
}
