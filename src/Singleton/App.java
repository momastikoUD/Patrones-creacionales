package Singleton;

public class App {
    public static void main(String[] args) {
        ConfiguracionApp config1 = ConfiguracionApp.getInstancia();
        config1.setModoOscuro(true);

        ConfiguracionApp config2 = ConfiguracionApp.getInstancia();

        System.out.println("¿config1 y config2 son el mismo objeto? " + (config1 == config2));
        System.out.println("Modo oscuro visto desde config2: " + config2.isModoOscuro());
    }
}
