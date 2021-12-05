package G43_VHAMAYAC.G43_VHAMAYAC.servicios;


import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Reservation;
import G43_VHAMAYAC.G43_VHAMAYAC.modelo.custom.CountClient;
import G43_VHAMAYAC.G43_VHAMAYAC.modelo.custom.StatusRes;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.ReservationRepositorio;
import G43_VHAMAYAC.G43_VHAMAYAC.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
            return (Reservation) repositorio.guardar(objeto);
        } else {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
            if (c.isEmpty()) {
                return (Reservation) repositorio.guardar(objeto);
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
                return (Reservation) repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }

    public List<CountClient> getTopClientesReport(){
        return repositorio.getTopClient();

    }

    public StatusRes getStatusReport(){
        List<Reservation> completed= repositorio.getReservationByStatus("completed");
        List<Reservation> cancelled= repositorio.getReservationByStatus("cancelled");

        StatusRes statusres = new StatusRes(completed.size(),cancelled.size());
        return statusres;
    }

    public List<Reservation> getReservationPeriodReport(String d1, String d2){
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        Date dateOne=new Date();
        Date dateTwo=new Date();

        try{
            dateOne=parser.parse(d1);
            dateTwo=parser.parse(d2);
        }catch (ParseException e){
            e.printStackTrace();
        }
        if(dateOne.before(dateTwo)){
            return repositorio.getReservationPeriod(dateOne, dateTwo);
        }else{
            return new ArrayList<>();
        }
    }



}
