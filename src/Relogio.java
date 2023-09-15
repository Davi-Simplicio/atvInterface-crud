public class Relogio extends Acessorio{
    String tipo;
    String cor;

    public Relogio(String material, String utilidade, String nome, int id, String tipo1, String cor) {
        super(material, utilidade, nome, id);
        this.tipo = tipo1;
        this.cor = cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String menuEditar() {
        return super.menuEditar()+ """
                [4]Tipo
                [5]Cor""";
    }

    @Override
    public String toString() {
        return  super.toString() +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                "} " ;
    }
}
