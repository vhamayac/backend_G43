package G43_VHAMAYAC.G43_VHAMAYAC.controladores;

import G43_VHAMAYAC.G43_VHAMAYAC.modelo.Category;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.CategoryServicio;
import G43_VHAMAYAC.G43_VHAMAYAC.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin("*")
public class CategoryApiRest extends ControladorGenericoAbstracto<Category, Long> {

    @Autowired
    private CategoryServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Category, Long> getService() {
        return servicio;
    }
}
