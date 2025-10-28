package actividad1.modelo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import actividad1.modelo.entities.Pedido;
import actividad1.modelo.repository.PedidoRepository;

@Service
public class PedidoDaoImpl implements PedidoDao {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido buscarUno(Long idPedido) {
        return pedidoRepository.findById(idPedido).orElse(null);
    }

    @Override
    public List<Pedido> todos() {
        return pedidoRepository.findAll();
    }

    @Override
    public int eliminarPorId(Long idPedido) {
        try {
            if (pedidoRepository.findById(idPedido).orElse(null) == null)
                return 0;
            pedidoRepository.deleteById(idPedido);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public Pedido insertarUno(Pedido pedido) {
        try {
            return pedidoRepository.save(pedido);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Pedido actualizar(Pedido pedido) {
        try {
            return pedidoRepository.save(pedido);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
