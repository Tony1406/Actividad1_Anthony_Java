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

    @GetMapping("/todos")
    public List<Pedido> listarTodos() {
        return pedidoDao.todos();
    }

    @GetMapping("/{idPedido}")
    public Pedido buscarPorId(@PathVariable Long idPedido) {
        return pedidoDao.buscarUno(idPedido);
    }

    @PostMapping("/crear")
    public Pedido crear(@RequestBody Pedido pedido) {
        return pedidoDao.insertarUno(pedido);
    }

    @PutMapping("/actualizar")
    public Pedido actualizar(@RequestBody Pedido pedido) {
        return pedidoDao.actualizar(pedido);
    }

    @DeleteMapping("/eliminar/{idPedido}")
    public int eliminar(@PathVariable Long idPedido) {
        return pedidoDao.eliminarPorId(idPedido);
    }
}
