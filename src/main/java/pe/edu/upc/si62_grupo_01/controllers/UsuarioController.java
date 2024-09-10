package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.UsuarioDTO;
import pe.edu.upc.si62_grupo_01.entities.Usuario;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;

    @PostMapping
    private void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper m= new ModelMapper();
        Usuario usuario = m.map(dto, Usuario.class);
        uS.insert(usuario);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(usuarioDTO, Usuario.class);
        uS.update(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) { // Cambiado de Integer a Long
        uS.delete(id);
    }
}
