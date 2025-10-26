package actividad1.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import actividad1.modelo.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
