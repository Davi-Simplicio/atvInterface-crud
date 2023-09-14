public class Colar extends Acessorio{
    double comprimento;
    boolean temFecho;

    public Colar(String material, String utilidade, String nome, int id, double comprimento, boolean temFecho) {
        super(material, utilidade, nome, id);
        this.comprimento = comprimento;
        this.temFecho = temFecho;
    }

    public boolean isTemFecho() {
        return temFecho;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setTemFecho(boolean temFecho) {
        this.temFecho = temFecho;
    }

    @Override
    public String menuEditar() {
        return super.menuEditar()+ """
                [4]Comprimento
                [5]Fecho""";
    }
}
