package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.dtos.ProyectoCountDTO;
import pe.edu.upc.si62_grupo_01.entities.Proyecto;
import pe.edu.upc.si62_grupo_01.repositories.IProyectoRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IProyectoService;

import java.util.List;

@Service
public class ProyectoServiceImplement implements IProyectoService {

    @Autowired
    private IProyectoRepository pR;
    @Override
    public List<Proyecto> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Proyecto proyecto) {
     pR.save(proyecto);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public void update(Proyecto proyecto) {
        pR.save(proyecto);
    }

    @Override
    public List<ProyectoCountDTO> contarProyectosPorUsuario(Long idUsuario) {
        return pR.contarProyectosPorUsuario(idUsuario);
    }

    @Override
    public List<String[]> contarPermisosDeProyectosPorUsuario(Long idUsuario) {
        return pR.permisosPorProyecto_Usuario(idUsuario);
    }

    @Override
    public List<String[]> contarPermisosDeProyectos() {
        return pR.permisosPorProyecto();
    }

}
