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

import actividad1.modelo.dao.ProductoDao;
import actividad1.modelo.entities.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {

    @Autowired
    private ProductoDao productoDao;

    @GetMapping
    public List<Producto> listarTodos() {
        return null;
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return null;
    }

    @PutMapping
    public Producto actualizar(@RequestBody Producto producto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        return null;
    }
}
