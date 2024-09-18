package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.NotificacionDto;
import pe.edu.upc.si62_grupo_01.dtos.PermisoDTO;
import pe.edu.upc.si62_grupo_01.entities.Notificacion;
import pe.edu.upc.si62_grupo_01.entities.Permiso;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.INotificacionService;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IPermisoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
    @Autowired
    private INotificacionService notificacionService;

    @GetMapping
    public List<NotificacionDto> listar() {
        return notificacionService.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificacionDto.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private  void insertar(@RequestBody NotificacionDto dto) {
        ModelMapper m = new ModelMapper();
        Notificacion notificacion=m.map(dto,Notificacion.class);
        notificacionService.insert(notificacion);
    }

    @PutMapping()
    public void modificar(@RequestBody NotificacionDto dto) {
        ModelMapper m= new ModelMapper();
        Notificacion notificacion= m.map(dto, Notificacion.class);
        notificacionService.update(notificacion);
    }
    @DeleteMapping
    public void elimina(@PathVariable ("id") Integer id){
        notificacionService.delete(id);
    }

}
