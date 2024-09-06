package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.PrototipoDTO;
import pe.edu.upc.si62_grupo_01.entities.Prototipo;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IPrototipoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/prototipo")
public class PrototipoController {
    @Autowired
    private IPrototipoService prototipoService;

    @GetMapping
    public List<PrototipoDTO> listar() {
        return prototipoService.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PrototipoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private  void insertar(@RequestBody PrototipoDTO prototipoDTO) {
        ModelMapper m = new ModelMapper();
        Prototipo prototipo=m.map(prototipoDTO,Prototipo.class);
        prototipoService.insert(prototipo);
    }
    @PutMapping()
    public void modificar(@RequestBody PrototipoDTO prototipoDTO) {
        ModelMapper m= new ModelMapper();
        Prototipo prototipo=m.map(prototipoDTO,Prototipo.class);
        prototipoService.update(prototipo);
    }
    @DeleteMapping
    public void elimina(@PathVariable ("id") Integer id){
        prototipoService.delete(id);
    }

}
