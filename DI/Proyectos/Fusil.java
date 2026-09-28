public class Fusil implements Arma{
    @Override
    public void disparar() {
        System.out.println("Fusil disparando......");
    }

    @Override
    public void recargar() {
        System.out.println("Fusil recargando......");
    }
}
