package actividad1.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import actividad1.modelo.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
