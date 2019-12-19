package pe.tuna.backentapirestc2.models.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.tuna.backentapirestc2.models.intetity.Cliente;
import pe.tuna.backentapirestc2.models.intetity.Factura;
import pe.tuna.backentapirestc2.models.intetity.Producto;
import pe.tuna.backentapirestc2.models.intetity.Region;
import pe.tuna.backentapirestc2.models.repository.IClienteRepository;
import pe.tuna.backentapirestc2.models.repository.IFacturaRepository;
import pe.tuna.backentapirestc2.models.repository.IProductoRepository;
import pe.tuna.backentapirestc2.models.services.IClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    @Autowired
    private IFacturaRepository facturaRepository;

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Region> findAllRegiones() {
        return clienteRepository.findAllRegiones();
    }

    @Override
    @Transactional(readOnly = true)
    public Factura findFacturaById(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Factura saveFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    @Transactional
    public void deleteFacturaById(Long id) {
        facturaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findProductoByNombre(String term) {
        return productoRepository.findByNombreContainingIgnoreCase(term);
    }
}
