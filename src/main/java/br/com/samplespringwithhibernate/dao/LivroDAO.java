package br.com.samplespringwithhibernate.dao;

import java.util.List;

import br.com.samplespringwithhibernate.model.Livro;

public interface LivroDAO {

	public void salvarLivro(Livro livro);

	public List<Livro> listarLivros();

}
