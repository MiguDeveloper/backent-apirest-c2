package pe.tuna.backentapirestc2.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.tuna.backentapirestc2.models.intetity.Factura;

public interface IFacturaRepository extends JpaRepository<Factura, Long> {

}
