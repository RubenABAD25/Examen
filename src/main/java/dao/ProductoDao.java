package dao;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Movimiento;
import modelo.Producto;

@Stateless
public class ProductoDao {
	@Inject
	private EntityManager em;
	public void create(Producto producto) {
		em.persist(producto);
	}

	public Producto read(int codigo) {
		return em.find(Producto.class, codigo);
	}

	public void update(Producto producto) {
		em.merge(producto);
	}

	public void delete(int codigo) {
		em.remove(read(codigo));
	}
	
}
