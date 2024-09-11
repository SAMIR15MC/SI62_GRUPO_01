package pe.edu.upc.si62_grupo_01.servicesinterfaces;

import pe.edu.upc.si62_grupo_01.dtos.ProyectoCountDTO;
import pe.edu.upc.si62_grupo_01.entities.Prototipo;

import java.util.List;

public interface IPrototipoService {
    public List<Prototipo> list();
    public void insert(Prototipo prototipo);
    public void delete(int id);
    public void update(Prototipo prototipo);
}
