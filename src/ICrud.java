import java.util.ArrayList;

public interface ICrud<ID,T> {
    T create(T object);
    T update(ID id,T object);
    ArrayList<T> readAll();
    T readOne(ID id);
    void delete(ID id);
}
