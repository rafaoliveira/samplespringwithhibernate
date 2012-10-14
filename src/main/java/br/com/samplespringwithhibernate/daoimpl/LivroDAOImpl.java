package br.com.samplespringwithhibernate.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import br.com.samplespringwithhibernate.dao.LivroDAO;
import br.com.samplespringwithhibernate.model.Livro;

public class LivroDAOImpl implements LivroDAO {

	private SessionFactory sessionFactory;

	@Transactional
	public void salvarLivro(Livro livro) {
		getSessionFactory().getCurrentSession().save(livro);
	}

	@Transactional
	public List<Livro> listarLivros() {
		Query query = getSessionFactory().getCurrentSession().createQuery("from Livro");
		List<Livro> livros = query.list();
		return livros;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
