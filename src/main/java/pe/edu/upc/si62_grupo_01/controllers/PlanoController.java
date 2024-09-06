package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.PermisoDTO;
import pe.edu.upc.si62_grupo_01.dtos.PlanoDTO;
import pe.edu.upc.si62_grupo_01.entities.Permiso;
import pe.edu.upc.si62_grupo_01.entities.Plano;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IPlanoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    @Autowired
    private IPlanoService planoService;
    @GetMapping
    public List<PlanoDTO> listar() {
        return planoService.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PlanoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private  void insertar(@RequestBody PlanoDTO planoDTO) {
        ModelMapper m = new ModelMapper();
        Plano plano=m.map(planoDTO,Plano.class);
        planoService.insert(plano);
    }
    @PutMapping()
    public void modificar(@RequestBody PlanoDTO planoDTO) {
        ModelMapper m= new ModelMapper();
        Plano plano= m.map(planoDTO, Plano.class);
        planoService.update(plano);
    }
    @DeleteMapping
    public void elimina(@PathVariable ("id") Integer id){
        planoService.delete(id);
    }

}
