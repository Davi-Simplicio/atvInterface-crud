public class Oculos extends Acessorio{
    String tipo;
    String formaDaLente;

    public Oculos(String material, String utilidade, String nome, int id, String tipo1, String formaDaLente) {
        super(material, utilidade, nome, id);
        this.tipo = tipo1;
        this.formaDaLente = formaDaLente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFormaDaLente(String formaDaLente) {
        this.formaDaLente = formaDaLente;
    }

    @Override
    public String menuEditar() {
        return super.menuEditar()+ """
                [4]Tipo
                [5]Formato Da Lente""";
    }

    @Override
    public String toString() {
        return  super.toString() +
                "tipo='" + tipo + '\'' +
                ", formaDaLente='" + formaDaLente + '\'' +
                "} ";
    }
}
