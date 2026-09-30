package Factory_Method;
public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }

}
