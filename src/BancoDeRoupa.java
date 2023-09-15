import java.util.ArrayList;
import java.util.function.IntToDoubleFunction;

public class BancoDeRoupa implements ICrud<Integer,Roupa>{
    ArrayList<Roupa>roupas = new ArrayList<>();


    @Override
    public Roupa create(Roupa object) {
        if (roupas.add(object)){
            return object;
        };
        return null;
    }

    @Override
    public Roupa update(Integer integer,Roupa object) {
        if (roupas.set(integer,object)!=null){
            return object;
        }
        return null;
    }

    @Override
    public ArrayList<Roupa> readAll() {
        return roupas;
    }

    @Override
    public Roupa readOne(Integer integer) {
        return roupas.get(integer);
    }

    @Override
    public void delete(Integer integer) {
        roupas.remove(roupas.get(integer));
        for (Roupa roupa:roupas) {
            roupa.setId(roupa.getId()-1);
        }
    }
}
