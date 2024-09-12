package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.ComentarioCountDTO;
import pe.edu.upc.si62_grupo_01.dtos.ComentarioDTO;
import pe.edu.upc.si62_grupo_01.dtos.EvaluacionDTO;
import pe.edu.upc.si62_grupo_01.entities.Comentario;
import pe.edu.upc.si62_grupo_01.entities.Evaluacion;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    @Autowired
    private IComentarioService comentarioService;

    @PostMapping
    private void insertar(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper m = new ModelMapper();
        Comentario comentario = m.map(comentarioDTO, Comentario.class);
        comentarioService.insert(comentario);
    }

    @GetMapping
    public List<ComentarioDTO> listar() {
        return comentarioService.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    private void modificar(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper m = new ModelMapper();
        Comentario comentario = m.map(comentarioDTO, Comentario.class);

    }

    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id) {
        comentarioService.delete(id);
    }

    @GetMapping("/contarcomentarios/{idUsuario}")
    public List<ComentarioCountDTO> contarComentariosPorUsuario(@PathVariable("idUsuario") Long idUsuario) {
        return comentarioService.contarComentariosPorUsuario(idUsuario);
    }

}
