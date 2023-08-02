package br.com.yunes.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yunes.javaapi.entity.Produto;


public interface ProdutoRepositoryNew extends JpaRepository<Produto, Integer> {
}