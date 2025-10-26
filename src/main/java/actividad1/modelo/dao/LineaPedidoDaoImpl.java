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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LineaPedido> todos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarPorId(Long numeroOrden) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LineaPedido insertarUno(LineaPedido lineaPedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LineaPedido actualizar(LineaPedido lineaPedido) {
		// TODO Auto-generated method stub
		return null;
	}
}
