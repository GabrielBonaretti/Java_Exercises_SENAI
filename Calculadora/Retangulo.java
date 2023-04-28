public class Retangulo extends figurasPlanas{
    Double base;
    Double altura;
    Retangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        return base*altura;
    }

    @Override
    public double calculoPerimetro() {
        return (base*2)+(altura*2);
    }
}
