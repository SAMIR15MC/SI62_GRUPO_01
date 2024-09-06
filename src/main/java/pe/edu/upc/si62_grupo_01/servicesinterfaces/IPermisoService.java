package pe.edu.upc.si62_grupo_01.servicesinterfaces;

import pe.edu.upc.si62_grupo_01.entities.Permiso;

import java.util.List;

public interface IPermisoService {
    public List<Permiso>list();
    public void insert(Permiso permiso);
    public void delete(int id);
    public void update(Permiso permiso);
}
