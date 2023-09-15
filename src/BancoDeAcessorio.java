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
        if (acessorios.set(integer,object)!=null){
            return object;
        }
        return null;
    }

    @Override
    public ArrayList<Acessorio> readAll() {
        return acessorios;
    }

    @Override
    public Acessorio readOne(Integer integer) {
        return acessorios.get(integer);
    }

    @Override
    public void delete(Integer integer) {
        acessorios.remove(acessorios.get(integer));
        for (Acessorio acessorio:acessorios) {
            acessorio.setId(acessorio.getId()-1);
        }
    }

}
