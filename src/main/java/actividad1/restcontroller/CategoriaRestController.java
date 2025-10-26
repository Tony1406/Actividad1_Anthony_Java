package actividad1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import actividad1.modelo.dao.CategoriaDao;
import actividad1.modelo.entities.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaRestController {

    @Autowired
    private CategoriaDao categoriaDao;

    @GetMapping
    public List<Categoria> listarTodas() {
        return null;
    }

    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Categoria crear(@RequestBody Categoria categoria) {
        return null;
    }

    @PutMapping
    public Categoria actualizar(@RequestBody Categoria categoria) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        return null;
    }
}
