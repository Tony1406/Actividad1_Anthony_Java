package actividad1.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import actividad1.modelo.entities.LineaPedido;

public interface LineaPedidoRepository extends JpaRepository<LineaPedido, Long> {

}
