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
@RequestMapping("/lineapedidos")
public class LineaPedidoRestController {

    @Autowired
    private LineaPedidoDao lineaPedidoDao;

    @GetMapping("/todos")
    public List<LineaPedido> listarTodos() {
        return lineaPedidoDao.todos();
    }

    @GetMapping("/{numeroOrden}")
    public LineaPedido buscarPorId(@PathVariable Long numeroOrden) {
        return lineaPedidoDao.buscarUno(numeroOrden);
    }

    @PostMapping("/crear")
    public LineaPedido crear(@RequestBody LineaPedido lineaPedido) {
        return lineaPedidoDao.insertarUno(lineaPedido);
    }

    @PutMapping("/actualizar")
    public LineaPedido actualizar(@RequestBody LineaPedido lineaPedido) {
        return lineaPedidoDao.actualizar(lineaPedido);
    }

    @DeleteMapping("/eliminar/{numeroOrden}")
    public int eliminar(@PathVariable Long numeroOrden) {
        return lineaPedidoDao.eliminarPorId(numeroOrden);
    }
}
