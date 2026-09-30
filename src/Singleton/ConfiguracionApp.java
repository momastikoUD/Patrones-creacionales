package Singleton;

public class ConfiguracionApp {
    private static ConfiguracionApp instancia;
    private boolean modoOscuro;
    private String idiomaPredeterminado;

    private ConfiguracionApp() {
        this.modoOscuro = false;
        this.idiomaPredeterminado = "es";
        System.out.println("Creando la unica instancia de ConfiguracionApp...");
    }

    public static ConfiguracionApp getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionApp();
        }
        return instancia;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public String getIdiomaPredeterminado() {
        return idiomaPredeterminado;
    }
}
