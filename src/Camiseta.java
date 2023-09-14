public class Camiseta extends Roupa{
    private double comprimentoDaManga;
    private String estampa;

    public Camiseta(String marca, double preco, String tamanho, int id, double comprimentoDaManga, String estampa) {
        super(marca, preco, tamanho, id);
        this.comprimentoDaManga = comprimentoDaManga;
        this.estampa = estampa;
    }

    public void setComprimentoDaManga(double comprimentoDaManga) {
        this.comprimentoDaManga = comprimentoDaManga;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    @Override
    public String menuEditar() {
        return super.menuEditar()+ """
                [4]Comprimento da Manga
                [5]estampa""";
    }
}
