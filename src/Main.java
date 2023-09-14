import javax.management.openmbean.OpenMBeanConstructorInfo;
import java.util.Scanner;

public class Main {
    static BancoDeAcessorio bancoDeAcessorio = new BancoDeAcessorio();
    static BancoDeRoupa bancoDeRoupa = new BancoDeRoupa();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuInicial();
    }

    private static void menuInicial() {
        do {


            System.out.println("""
                    --BEM VINDO A DS STORE--
                                        
                           [1]Login
                           [2]Cadastro
                           [3]Sair""");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    login();
                    break;
                case 2:
                    cadastro();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }

    private static void cadastro() {
        System.out.println("Defina uma senha");
        String senha = sc.next();
    }

    private static void login() {
        System.out.println("Qual sua senha?");
        String senha = sc.next();
        menu();
    }

    private static void menu() {
        int opcao;
        do {


            System.out.println("""
                             --DS STORE--
                    [1]Cadastrar uma nova peça
                    [2]Editar uma peça
                    [3]Ver todas as peças
                    [4]Deletar uma peça
                    [5]Sair""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarPeca();
                    break;
                case 2:
                    editarPeca();
                    break;
                case 3:
                    verTodasPecas();
                    break;
                case 4:
                    deletarPeca();
                    break;
                case 5:
                    break;
            }
        } while (opcao != 5);
    }

    private static void deletarPeca() {
        System.out.println("Deseja deletar "+ """
                [1]Roupa
                [2]Acessorio""");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                deletarRoupa();
                break;
            case 2:
                deletarAcessorio();
                break;
        }


    }

    private static void deletarAcessorio() {
        System.out.println("Escolha o id da peça que deseja deletar");
        System.out.println(" Acessorios \n" +bancoDeAcessorio.acessorios);
        int id = sc.nextInt();
        bancoDeAcessorio.delete(id);
    }

    private static void deletarRoupa() {
        System.out.println("Escolha o id da peça que deseja deletar");
        System.out.println(" Roupas \n" +bancoDeRoupa.roupas);
        int id = sc.nextInt();
        bancoDeAcessorio.delete(id);
    }

    private static void verTodasPecas() {
        System.out.println("""
                [1]Roupas
                [2]Acessorios""");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                verTodasRoupas();
                break;
            case 2:
                verTodosAcessorios();
                break;

        }
        System.out.println("Digite o id de qual você deseja ver especificamente\n[" + bancoDeRoupa.roupas.size() + 1 + "]Sair");
    }

    private static void verTodosAcessorios() {
        System.out.println(bancoDeAcessorio.readAll());
        System.out.println("Digite o id de qual você deseja ver especificamente\n[" + bancoDeAcessorio.acessorios.size() + 1 + "]Sair");
        int id = sc.nextInt();
        if (id == bancoDeAcessorio.acessorios.size() + 1) {
            System.out.println("---------------------");
        } else {
            bancoDeAcessorio.readOne(id);
        }
    }

    private static void verTodasRoupas() {
        System.out.println(bancoDeRoupa.readAll());
        System.out.println("Digite o id de qual você deseja ver especificamente\n[" + bancoDeRoupa.roupas.size() + 1 + "]Sair");
        int id = sc.nextInt();
        if (id == bancoDeRoupa.roupas.size() + 1) {
            System.out.println("---------------------");
        } else {
            bancoDeRoupa.readOne(id);
        }
    }

    private static void editarPeca() {
        System.out.println("""
                [1]Editar uma roupa
                [2]Editar um acessorio""");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                editarRoupa();
                break;
            case 2:
                editarAcessorio();
                break;
        }

    }

    private static void editarAcessorio() {
        System.out.println(bancoDeAcessorio.readAll());
        System.out.println("Escolha o id que deseja editar");
        int id = sc.nextInt();
        Acessorio acessorio = bancoDeAcessorio.acessorios.get(id-1);
        acessorio.menuEditar();
        int opcao=sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Qual o novo material?");
                String material = sc.next();
                acessorio.setMaterial(material);
                break;
            case 2:
                System.out.println("Qual a nova utilidade?");
                String utilidade = sc.next();
                acessorio.setUtilidade(utilidade);
                break;
            case 3:
                System.out.println("Qual novo nome?");
                String nome = sc.next();
                acessorio.setNome(nome);
                break;
            case 4:
                if(acessorio instanceof Colar){
                    System.out.println("Qual o novo comprimento?");
                    double comprimento = sc.nextDouble();
                    ((Colar) acessorio).setComprimento(comprimento);
                }else if(acessorio instanceof Oculos){
                    System.out.println("Qual o novo tipo?");
                    String tipo = sc.next();
                    ((Oculos) acessorio).setTipo(tipo);
                }else if(acessorio instanceof Relogio){
                    System.out.println("Qual o novo tipo?");
                    String tipo = sc.next();
                    ((Relogio) acessorio).setTipo(tipo);
            }
                break;
            case 5:
                if(acessorio instanceof Colar){
                    if(((Colar) acessorio).isTemFecho()){
                        ((Colar) acessorio).setTemFecho(false);
                    }else{
                        ((Colar) acessorio).setTemFecho(true);
                    }
                }else if(acessorio instanceof Oculos){
                    System.out.println("Qual novo formato de Lente?");
                    String formato = sc.next();
                    ((Oculos) acessorio).setFormaDaLente(formato);
                }else if(acessorio instanceof Relogio){
                    System.out.println("Qual a nova cor?");
                    String cor = sc.next();
                    ((Relogio) acessorio).setCor(cor);
                }
                break;
        }
        bancoDeAcessorio.update(id,acessorio);
    }

    private static void editarRoupa() {
        System.out.println(bancoDeRoupa.readAll());
        System.out.println("Escolha o id que deseja editar");
        int id = sc.nextInt();
        Roupa roupa = bancoDeRoupa.roupas.get(id - 1);
        roupa.menuEditar();
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Qual nova marca?");
                String marca = sc.next();
                roupa.setMarca(marca);
                break;
            case 2:
                System.out.println("Qual o novo preço?");
                double preco = sc.nextDouble();
                roupa.setPreco(preco);
                break;
            case 3:
                System.out.println("Qual novo tamanho?");
                String tamanho = sc.next();
                roupa.setTamanho(tamanho);
                break;
            case 4:
                if (roupa instanceof Calca) {
                    System.out.println("Qual novo tipo?");
                    String tipo = sc.next();
                    ((Calca) roupa).setTipo(tipo);
                } else if (roupa instanceof Camiseta) {
                    System.out.println("Qual novo comprimento da manga?");
                    double comprimento = sc.nextDouble();
                    ((Camiseta) roupa).setComprimentoDaManga(comprimento);
                } else if (roupa instanceof Casaco) {
                    if (((Casaco) roupa).isTemBolso()) {
                        ((Casaco) roupa).setTemBolso(false);
                    } else {
                        ((Casaco) roupa).setTemBolso(true);
                    }
                }
                break;
            case 5:
                if (roupa instanceof Calca) {
                    if (((Calca) roupa).isTemForro()) {
                        ((Calca) roupa).setTemForro(false);
                    } else {
                        ((Calca) roupa).setTemForro(true);
                    }
                } else if (roupa instanceof Camiseta) {
                    System.out.println("Qual a nova estampa??");
                    String estampa = sc.next();
                    ((Camiseta) roupa).setEstampa(estampa);
                } else if (roupa instanceof Casaco) {
                    if (((Casaco) roupa).isTemCapuz()) {
                        ((Casaco) roupa).setTemCapuz(false);
                    } else {
                        ((Casaco) roupa).setTemCapuz(true);
                    }
                }
                break;
        }
        bancoDeRoupa.update(id, roupa);
    }

    private static void cadastrarPeca() {
        int opcao;
        System.out.println("Oque você deseja cadastrar?" + """
                [1]Acessorio
                [2]Roupa
                [3]Sair""");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                cadastroDeAcessorio();
                break;
            case 2:
                cadastroDeRoupa();
                break;
            case 3:
                break;
        }
    }

    private static void cadastroDeRoupa() {
        boolean forro = false;
        boolean capuz = false;
        boolean bolso = false;
        System.out.println("""
                [1]Calça
                [2]Camiseta
                [3]Casaco""");
        int opcao = sc.nextInt();
        System.out.println("Qual a marca da roupa?");
        String marca = sc.next();
        System.out.println("Qual o preço da roupa?");
        double preco = sc.nextDouble();
        System.out.println("Qual o tamanho da roupa? ");
        String tamanho = sc.next();
        switch (opcao) {
            case 1:
                System.out.println("Qual o tipo da calca?");
                String tipoCalca = sc.next();
                System.out.println("A calça possui forro?");
                int opcao2 = sc.nextInt();
                switch (opcao2) {
                    case 1:
                        forro = true;
                        break;
                    case 2:
                        forro = false;
                        break;
                }
                Calca calca = new Calca(marca, preco, tamanho, bancoDeRoupa.roupas.size(), tipoCalca, forro);
                bancoDeRoupa.create(calca);
                break;
            case 2:
                System.out.println("Qual o comprimento da manga?");
                double comprimentoDaManga = sc.nextDouble();
                System.out.println("Qual a estampa da camiseta?");
                String estampa = sc.next();
                Camiseta camiseta = new Camiseta(marca, preco, tamanho, bancoDeRoupa.roupas.size(), comprimentoDaManga, estampa);
                bancoDeRoupa.create(camiseta);
                break;
            case 3:
                System.out.println("O casaco possui bolso?");
                int opcao3 = sc.nextInt();
                switch (opcao3) {
                    case 1:
                        bolso = true;
                        break;
                    case 2:
                        bolso = false;
                        break;
                }
                System.out.println("O casaco possui capuz?");
                int opcao4 = sc.nextInt();
                switch (opcao4) {
                    case 1:
                        capuz = true;
                        break;
                    case 2:
                        capuz = false;
                        break;
                }
                Casaco casaco = new Casaco(marca, preco, tamanho, bancoDeRoupa.roupas.size() + 1, bolso, capuz);
                bancoDeRoupa.create(casaco);
        }
    }

    private static void cadastroDeAcessorio() {
        boolean fecho = false;
        System.out.println("""
                [1]Colar
                [2]Oculos
                [3]Relogio""");
        int opcao = sc.nextInt();
        System.out.println("Qual o nome do acessorio?");
        String nome = sc.next();
        System.out.println("Qual o material do acessorio?");
        String material = sc.next();
        System.out.println("Qual a utilidade do acessorio? ");
        String utilidade = sc.next();
        switch (opcao) {
            case 1:
                System.out.println("Qual o comprimento do colar?");
                double comprimento = sc.nextDouble();
                System.out.println("O colar tem Fecho?");
                int opcao2 = sc.nextInt();
                switch (opcao2) {
                    case 1:
                        fecho = true;
                        break;
                    case 2:
                        fecho = false;
                        break;
                }
                Colar colar = new Colar(material, utilidade, nome, bancoDeAcessorio.acessorios.size() + 1, comprimento, fecho);
                bancoDeAcessorio.create(colar);
                break;
            case 2:
                System.out.println("Qual o tipo do oculos?");
                String tipoOculos = sc.next();
                System.out.println("Qual o formato da lente do oculos?");
                String formatoDaLente = sc.next();
                Oculos oculos = new Oculos(material, utilidade, nome, bancoDeAcessorio.acessorios.size() + 1, tipoOculos, formatoDaLente);
                bancoDeAcessorio.create(oculos);
                break;
            case 3:
                System.out.println("Qual o tipo do relogio?");
                String tipoRelogio = sc.next();
                System.out.println("Qual a cor do relogio?");
                String cor = sc.next();
                Relogio relogio = new Relogio(material, utilidade, nome, bancoDeAcessorio.acessorios.size() + 1, tipoRelogio, cor);
                bancoDeAcessorio.create(relogio);
        }
    }
}
