package Factory_Method;
public abstract class Logistica {
    public abstract Transporte crearTransporte();

    public void planificarEntrega() {
        Transporte transporte = crearTransporte();
        System.out.println("Planificando la entrega...");
        transporte.entregar();
    }
}
