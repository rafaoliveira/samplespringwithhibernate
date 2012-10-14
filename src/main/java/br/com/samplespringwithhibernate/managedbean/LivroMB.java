package br.com.samplespringwithhibernate.managedbean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.samplespringwithhibernate.dao.LivroDAO;
import br.com.samplespringwithhibernate.model.Livro;

@ManagedBean
@RequestScoped
public class LivroMB {

	@ManagedProperty(value = "#{livroDAO}")
	private LivroDAO livroDAO;
	@ManagedProperty(value = "#{livro}")
	private Livro livro;

	public String cadastrar() {
		try {
			livroDAO.salvarLivro(livro);
			return "sucesso";
		} catch (Exception e) {
			FacesMessage fm = new FacesMessage(e.getMessage());
			FacesContext.getCurrentInstance().addMessage("Ocorreu um erro", fm);
			return null;
		}
	}

	public List<Livro> getLivros() {
		try {
			return livroDAO.listarLivros();
		} catch (Exception e) {
			FacesMessage fm = new FacesMessage(e.getMessage());
			FacesContext.getCurrentInstance().addMessage("Ocorreu um erro", fm);
			return null;
		}
	}

	public String voltar() {
		return "index";
	}

	public LivroDAO getLivroDAO() {
		return livroDAO;
	}

	public void setLivroDAO(LivroDAO livroDAO) {
		this.livroDAO = livroDAO;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
