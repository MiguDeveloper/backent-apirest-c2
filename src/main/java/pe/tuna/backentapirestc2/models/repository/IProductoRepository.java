package pe.tuna.backentapirestc2.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.tuna.backentapirestc2.models.intetity.Producto;

import java.util.List;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

    // Forma manual
    @Query("SELECT p FROM Producto p WHERE p.nombre LIKE %?1%")
    public List<Producto> findByNombre(String term);

    // Utilizando nombre del metodo
    public List<Producto> findByNombreContainingIgnoreCase(String term);
}
