package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Notificacion;
import pe.edu.upc.si62_grupo_01.repositories.INotificacionRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.INotificacionService;

import java.util.List;

@Service
public class NotificacionServiceImplement implements INotificacionService {
    @Autowired
    private INotificacionRepository repositoryNotificacion;
    @Override
    public List<Notificacion> list() {
        return repositoryNotificacion.findAll();
    }

    @Override
    public void insert(Notificacion notificacion) {
        repositoryNotificacion.save(notificacion);
    }

    @Override
    public void delete(int id) {
        repositoryNotificacion.deleteById(id);
    }

    @Override
    public void update(Notificacion notificacion) {
        repositoryNotificacion.save(notificacion);
    }
}
