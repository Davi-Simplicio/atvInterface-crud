import java.util.ArrayList;

public class BancoDeAcessorio implements ICrud<Integer,Acessorio>{
    ArrayList<Acessorio>acessorios = new ArrayList<>();



    @Override
    public Acessorio create(Acessorio object) {
        if (acessorios.add(object)){
            return object;
        };
        return null;
    }

    @Override
    public Acessorio update(Integer integer,Acessorio object) {
        return null;
    }

    @Override
    public ArrayList<Acessorio> readAll() {
        return null;
    }

    @Override
    public Acessorio readOne(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

}
