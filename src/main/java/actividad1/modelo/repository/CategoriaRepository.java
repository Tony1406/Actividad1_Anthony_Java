package actividad1.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import actividad1.modelo.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
