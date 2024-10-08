package pe.edu.upc.si62_grupo_01.servicesinterfaces;

import pe.edu.upc.si62_grupo_01.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    public List<Proyecto> list();
    public void insert(Proyecto proyecto);
    public void delete(int id);
    public void update(Proyecto proyecto);
}
