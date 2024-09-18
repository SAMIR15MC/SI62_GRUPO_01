package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.dtos.ComentarioCountByProyectoDTO;
import pe.edu.upc.si62_grupo_01.dtos.ComentarioCountDTO;
import pe.edu.upc.si62_grupo_01.entities.Comentario;
import pe.edu.upc.si62_grupo_01.repositories.IComentarioRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {

    @Autowired
    private IComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> list() {
        return comentarioRepository.findAll();
    }

    @Override
    public void insert(Comentario comentario) {
        comentarioRepository.save(comentario);
    }

    @Override
    public void update(Comentario comentario) {
        comentarioRepository.save(comentario);
    }

    @Override
    public void delete(int id) {
        comentarioRepository.deleteById(id);
    }

    @Override
    public List<ComentarioCountDTO> contarComentariosPorUsuario(Long idUsuario) {
        return comentarioRepository.contarComentariosPorUsuario(idUsuario);
    }

    @Override
    public List<ComentarioCountByProyectoDTO> contarComentariosPorProyecto(int idProyecto) {
        return comentarioRepository.contarComentariosPorProyecto(idProyecto);
    }
}
