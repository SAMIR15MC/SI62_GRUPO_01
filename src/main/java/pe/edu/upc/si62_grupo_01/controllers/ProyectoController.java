package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.ProyectoCountDTO;
import pe.edu.upc.si62_grupo_01.dtos.ProyectoDTO;
import pe.edu.upc.si62_grupo_01.entities.Proyecto;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IProyectoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    @Autowired
    private IProyectoService proyectoService;

    @GetMapping
    public List<ProyectoDTO> listar() {
        return proyectoService.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProyectoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private  void insertar(@RequestBody ProyectoDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyecto proyecto=m.map(dto, Proyecto.class);
        proyectoService.insert(proyecto);
    }
    @PutMapping()
    public void modificar(@RequestBody ProyectoDTO proyectoDTO) {
        ModelMapper m= new ModelMapper();
        Proyecto proyecto= m.map(proyectoDTO, Proyecto.class);
        proyectoService.update(proyecto);
    }
    @DeleteMapping
    public void elimina(@PathVariable ("id") Integer id){
        proyectoService.delete(id);
    }

    @GetMapping("/contarproyectos/{idUsuario}")
    public List<ProyectoCountDTO> contarProyectosPorUsuario(@PathVariable("idUsuario") Long idUsuario) {
        return proyectoService.contarProyectosPorUsuario(idUsuario);
    }
}
