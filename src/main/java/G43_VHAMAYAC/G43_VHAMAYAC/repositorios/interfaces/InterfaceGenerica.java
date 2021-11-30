package G43_VHAMAYAC.G43_VHAMAYAC.repositorios.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface InterfaceGenerica<T, ID extends Serializable>{

    List<T> obtenerTodos();

    Optional<T> obtenerXId(ID id);

    T guardar(T objecto);

    void eliminar(ID id);
}
