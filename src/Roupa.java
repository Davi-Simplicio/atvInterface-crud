public class Roupa {
    private String marca;
    private double preco;
    private String tamanho;
    private int id;

    public Roupa(String marca, double preco, String tamanho, int id) {
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" + id +"]"+
                "marca='" + marca + '\'' +
                ", preco=" + preco +
                ", tamanho='" + tamanho + '\'' +
                '\n';
    }
    public String menuEditar(){
        return """
                [0]Sair
                [1]Marca
                [2]Preço
                [3]Tamanho
                """;
    }
}
