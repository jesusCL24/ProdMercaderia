public class Lacteos extends Producto{
    public Lacteos(String nombre, int stock) {
        super(nombre, stock);
    }

    @Override
    public int verificarExistencia() {
        int k=0;
        if (stock>0){
            k=1;
        }
        return k;
    }
}
