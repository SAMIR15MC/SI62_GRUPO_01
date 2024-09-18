package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.PermisosCountByProyectosDTO;
import pe.edu.upc.si62_grupo_01.dtos.ProyectoCountDTO;
import pe.edu.upc.si62_grupo_01.dtos.ProyectoDTO;
import pe.edu.upc.si62_grupo_01.dtos.UsuariosTerrenoDTO;
import pe.edu.upc.si62_grupo_01.entities.Proyecto;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IProyectoService;

import java.util.ArrayList;
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

    @GetMapping("/contar-por-usuario/{idUsuario}")
    public List<ProyectoCountDTO> contarProyectosPorUsuario(@PathVariable("idUsuario") Long idUsuario) {
        return proyectoService.contarProyectosPorUsuario(idUsuario);
    }
    @GetMapping("/permisos_proyectos")
    public  List<PermisosCountByProyectosDTO>contarPermisosPorProyectos(){
        List<String[]>lista=proyectoService.contarPermisosDeProyectos();
        List<PermisosCountByProyectosDTO>listaDto= new ArrayList<>();
        for(String[]columna:lista){
            PermisosCountByProyectosDTO dto=new PermisosCountByProyectosDTO();
            dto.setIdUsuario(Long.parseLong(columna[0]));
            dto.setNombreusuario(columna[1]);
            dto.setProyecto(columna[2]);
            dto.setNumPermisos(Integer.parseInt(columna[3]));
            listaDto.add(dto);
        }
        return listaDto;
    }
    @GetMapping("/permisos_permisos_usario")
    public  List<PermisosCountByProyectosDTO>contarPermisosPorProyectosUsuario(long idUsuario){
        List<String[]>lista=proyectoService.contarPermisosDeProyectosPorUsuario(idUsuario);
        List<PermisosCountByProyectosDTO>listaDto= new ArrayList<>();
        for(String[]columna:lista){
            PermisosCountByProyectosDTO dto=new PermisosCountByProyectosDTO();
            dto.setProyecto(columna[0]);
            dto.setNumPermisos(Integer.parseInt(columna[1]));
            listaDto.add(dto);
        }
        return listaDto;
    }


}
