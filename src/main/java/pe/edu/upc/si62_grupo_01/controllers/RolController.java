package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.RolDTO;
import pe.edu.upc.si62_grupo_01.entities.Rol;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService rolService;

    @GetMapping
    public List<RolDTO> listar() {
        return rolService.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private void insertar(@RequestBody RolDTO rolDTO) {
        ModelMapper m=new ModelMapper();
        Rol r=m.map(rolDTO,Rol.class);
        rolService.insert(r);
    }
    @PutMapping()
    public void modificar(@RequestBody RolDTO rolDTO) {
        ModelMapper m= new ModelMapper();
        Rol d=m.map(rolDTO,Rol.class);
        rolService.update(d);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id)
    {
        rolService.delete(id);
    }
}
