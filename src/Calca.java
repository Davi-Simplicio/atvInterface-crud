public class Calca extends Roupa{
    private String tipo;
    private boolean temForro;

    public Calca(String marca, double preco, String tamanho, int id, String tipo, boolean temForro) {
        super(marca, preco, tamanho, id);
        this.tipo = tipo;
        this.temForro = temForro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTemForro(boolean temForro) {
        this.temForro = temForro;
    }

    public boolean isTemForro() {
        return temForro;
    }

    @Override
    public String menuEditar() {
        return super.menuEditar()+ """
                [4]tipo
                [5]Forro""";
    }
}
