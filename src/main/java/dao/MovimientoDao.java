package dao;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Inventario;
import modelo.Movimiento;

@Stateless
public class MovimientoDao {
	@Inject
	private EntityManager em;
	public void create(Movimiento movimiento) {
		em.persist(movimiento);
	}

	public Movimiento read(int codigo) {
		return em.find(Movimiento.class, codigo);
	}

	public void update(Movimiento movimiento) {
		em.merge(movimiento);
	}

	public void delete(int codigo) {
		em.remove(read(codigo));
	}
}
