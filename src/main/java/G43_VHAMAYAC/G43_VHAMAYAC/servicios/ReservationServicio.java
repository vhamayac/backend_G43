package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.ReservationRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationServicio extends ServicioGenericoAbstracto<Reservation, Long> {

    @Autowired
    private ReservationRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Reservation, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Reservation guardar(Reservation objeto) {
        if (objeto.getIdReservation() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Reservation actualizar(Reservation objeto) {
        if (objeto.getIdReservation() != null) {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}
