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

import actividad1.modelo.dao.LineaPedidoDao;
import actividad1.modelo.entities.LineaPedido;

@RestController
@RequestMapping("/lineaspedido")
public class LineaPedidoRestController {

    @Autowired
    private LineaPedidoDao lineaPedidoDao;

    @GetMapping
    public List<LineaPedido> listarTodos() {
        return null;
    }

    @GetMapping("/{id}")
    public LineaPedido buscarPorId(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public LineaPedido crear(@RequestBody LineaPedido lineaPedido) {
        return null;
    }

    @PutMapping
    public LineaPedido actualizar(@RequestBody LineaPedido lineaPedido) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        return null;
    }
}
