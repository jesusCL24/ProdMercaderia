public  abstract class Producto implements IProducto, IMercaderia {
    protected String nombre;
    protected int stock;
    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }
    public abstract int verificarExistencia();

    public String obtenerTipoProducto(){
        System.out.println("Lacteos");
        return null;
    }

    @Override
    public boolean darDeBaja(Producto pro) {
        return false;
    }

    @Override
    public boolean ingresar(Producto pro) {
        return true;
    }

    @Override
    public void comprar() {
        System.out.println("Usted compro un producto..!!!");
    }
}
