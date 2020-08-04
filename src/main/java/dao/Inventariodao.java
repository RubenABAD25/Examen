package dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Inventario;

@Stateless
public class Inventariodao {
	@Inject
	private EntityManager em;
	public void create(Inventario inventario) {
		em.persist(inventario);
	}

	public Inventario read(int codigo) {
		return em.find(Inventario.class, codigo);
	}

	public void update(Inventario inventario) {
		em.merge(inventario);
	}

	public void delete(int codigo) {
		em.remove(read(codigo));
	}
	

}
