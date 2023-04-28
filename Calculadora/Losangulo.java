public class Losangulo extends figurasPlanas{
    Double lado;
    Losangulo(Double lado){
        this.lado = lado;
    }


    @Override
    public double calculoArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calculoPerimetro() {
        return lado*4;
    }
}
