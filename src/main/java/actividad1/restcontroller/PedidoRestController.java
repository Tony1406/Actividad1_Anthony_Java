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

import actividad1.modelo.dao.PedidoDao;
import actividad1.modelo.entities.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoRestController {

    @Autowired
    private PedidoDao pedidoDao;

    @GetMapping
    public List<Pedido> listarTodos() {
        return null;
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Pedido crear(@RequestBody Pedido pedido) {
        return null;
    }

    @PutMapping
    public Pedido actualizar(@RequestBody Pedido pedido) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        return null;
    }
}
