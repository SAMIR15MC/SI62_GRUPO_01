package pe.edu.upc.si62_grupo_01.servicesinterfaces;

import pe.edu.upc.si62_grupo_01.entities.Comentario;
import pe.edu.upc.si62_grupo_01.entities.Evaluacion;

import java.util.List;

public interface IComentarioService {
    public List<Comentario> list();
    public void insert(Comentario comentario);
    public void update(Comentario comentario);
    public void delete(int id);

}
