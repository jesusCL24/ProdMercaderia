public class Principal {
    public static void main(String[] args) {
        Lacteos l1=new Lacteos("queso",23);
        if (l1.verificarExistencia() == 1) {
            System.out.println("existe el producto");
        }else {
            System.out.println("No existe el producto");
        }
        l1.comprar();
        l1.obtenerTipoProducto();
        System.out.println("---------------------------");
        IMercaderia m1=new Mercaderia();
        m1.comprar();
    }
}
