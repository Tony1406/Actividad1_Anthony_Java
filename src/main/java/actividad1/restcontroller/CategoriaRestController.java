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

	@GetMapping("/todos")
    public List<Categoria> listarTodas() {
        return categoriaDao.todos();
    }

    @GetMapping("/{idCategoria}")
    public Categoria buscarPorId(@PathVariable Long idCategoria) {
        return categoriaDao.buscarUno(idCategoria);
    }

	@PostMapping("/crear")
    public Categoria crear(@RequestBody Categoria categoria) {
        return categoriaDao.insertarUno(categoria);
    }

	@PutMapping("/actualizar")
    public Categoria actualizar(@RequestBody Categoria categoria) {
		return categoriaDao.actualizar(categoria);
    }

	@DeleteMapping("/eliminar/{idCategoria}")
    public int eliminar(@PathVariable Long idCategoria) {
        return categoriaDao.eliminarPorId(idCategoria);
    }
}
