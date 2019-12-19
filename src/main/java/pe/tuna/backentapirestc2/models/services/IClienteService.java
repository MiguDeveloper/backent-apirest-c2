package pe.tuna.backentapirestc2.models.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.tuna.backentapirestc2.models.intetity.Cliente;
import pe.tuna.backentapirestc2.models.intetity.Factura;
import pe.tuna.backentapirestc2.models.intetity.Producto;
import pe.tuna.backentapirestc2.models.intetity.Region;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
    public List<Region> findAllRegiones();
    public Factura findFacturaById(Long id);
    public Factura saveFactura(Factura factura);
    public void deleteFacturaById(Long id);
    public List<Producto> findProductoByNombre(String term);
}
