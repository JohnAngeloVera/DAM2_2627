public class Pistola implements Arma{
    public Pistola(){

    }
    @Override
    public void disparar() {
        System.out.println("Pistola disparando......");
    }

    @Override
    public void recargar() {
        System.out.println("Pistola recargando......");
    }
}
