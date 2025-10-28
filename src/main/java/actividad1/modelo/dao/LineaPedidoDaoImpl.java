package actividad1.modelo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import actividad1.modelo.entities.LineaPedido;
import actividad1.modelo.repository.LineaPedidoRepository;

@Service
public class LineaPedidoDaoImpl implements LineaPedidoDao {

    @Autowired
    private LineaPedidoRepository lineaPedidoRepository;

    @Override
    public LineaPedido buscarUno(Long numeroOrden) {
        return lineaPedidoRepository.findById(numeroOrden).orElse(null);
    }

    @Override
    public List<LineaPedido> todos() {
        return lineaPedidoRepository.findAll();
    }

    @Override
    public int eliminarPorId(Long numeroOrden) {
        try {
            if (lineaPedidoRepository.findById(numeroOrden).orElse(null) == null)
                return 0;
            lineaPedidoRepository.deleteById(numeroOrden);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public LineaPedido insertarUno(LineaPedido lineaPedido) {
        try {
            return lineaPedidoRepository.save(lineaPedido);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public LineaPedido actualizar(LineaPedido lineaPedido) {
        try {
            return lineaPedidoRepository.save(lineaPedido);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
