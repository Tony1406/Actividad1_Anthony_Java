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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> todos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarPorId(Long idPedido) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pedido insertarUno(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}
}
