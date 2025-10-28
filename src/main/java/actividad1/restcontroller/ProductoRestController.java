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

    @GetMapping("/todos")
    public List<Producto> listarTodos() {
        return productoDao.todos();
    }

    @GetMapping("/{idProducto}")
    public Producto buscarPorId(@PathVariable Long idProducto) {
        return productoDao.buscarUno(idProducto);
    }

    @PostMapping("/crear")
    public Producto crear(@RequestBody Producto producto) {
        return productoDao.insertarUno(producto);
    }

    @PutMapping("/actualizar")
    public Producto actualizar(@RequestBody Producto producto) {
        return productoDao.actualizar(producto);
    }

    @DeleteMapping("/eliminar/{idProducto}")
    public int eliminar(@PathVariable Long idProducto) {
        return productoDao.eliminarPorId(idProducto);
    }
}
