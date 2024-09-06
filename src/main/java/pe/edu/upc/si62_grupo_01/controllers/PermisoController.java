package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.PermisoDTO;
import pe.edu.upc.si62_grupo_01.entities.Permiso;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IPermisoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/permiso")
public class PermisoController {
    @Autowired
    private IPermisoService permisoService;

    @GetMapping
    public List<PermisoDTO> listar() {
        return permisoService.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PermisoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private  void insertar(@RequestBody PermisoDTO dto) {
        ModelMapper m = new ModelMapper();
        Permiso permiso=m.map(dto,Permiso.class);
        permisoService.insert(permiso);
    }
    @PutMapping()
    public void modificar(@RequestBody PermisoDTO permisoDTO) {
        ModelMapper m= new ModelMapper();
        Permiso permiso= m.map(permisoDTO, Permiso.class);
        permisoService.update(permiso);
    }
    @DeleteMapping
    public void elimina(@PathVariable ("id") Integer id){
        permisoService.delete(id);
    }

}
