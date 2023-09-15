public class Casaco extends Roupa{
    private boolean temBolso;
    private boolean temCapuz;

    public Casaco(String marca, double preco, String tamanho, int id, boolean temBolso, boolean temCapuz) {
        super(marca, preco, tamanho, id);
        this.temBolso = temBolso;
        this.temCapuz = temCapuz;
    }

    public void setTemBolso(boolean temBolso) {
        this.temBolso = temBolso;
    }

    public void setTemCapuz(boolean temCapuz) {
        this.temCapuz = temCapuz;
    }

    public boolean isTemBolso() {
        return temBolso;
    }

    public boolean isTemCapuz() {
        return temCapuz;
    }

    @Override
    public String menuEditar() {
        return super.menuEditar()+ """
                [4]Bolso
                [5]Capuz""";
    }

    @Override
    public String toString() {
        return super.toString() +
                "temBolso=" + temBolso +
                ", temCapuz=" + temCapuz +
                "} ";
    }
}
