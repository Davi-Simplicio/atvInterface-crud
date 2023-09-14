public class Acessorio {
    private String material;
    private String utilidade;
    private String nome;
    private int id;

    public Acessorio(String material, String utilidade, String nome, int id) {
        this.material = material;
        this.utilidade = utilidade;
        this.nome = nome;
        this.id = id;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "["+ id  +"]"+
                "material='" + material + '\'' +
                ", utilidade='" + utilidade + '\'' +
                ", nome='" + nome + '\'' +
                '\n';
    }
    public String menuEditar(){
        return """
                [1]Material
                [2]Utilidade
                [3]Nome""";
    }
}
