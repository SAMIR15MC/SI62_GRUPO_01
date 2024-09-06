package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.si62_grupo_01.dtos.MaterialDTO;
import pe.edu.upc.si62_grupo_01.entities.Material;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IMaterialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private IMaterialService materialService;

    @GetMapping
    public List<MaterialDTO> listar() {
        return materialService.list().stream().map(x-> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaterialDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private  void insertar(@RequestBody MaterialDTO dto) {
        ModelMapper m = new ModelMapper();
        Material material=m.map(dto,Material.class);
        materialService.insert(material);
    }
    @PutMapping()
    public void modificar(@RequestBody MaterialDTO materialDTO) {
        ModelMapper m= new ModelMapper();
        Material d= m.map(materialDTO, Material.class);
        materialService.update(d);
    }
    @DeleteMapping
    public void elimina(@PathVariable ("id") Integer id){
        materialService.delete(id);
    }
}
