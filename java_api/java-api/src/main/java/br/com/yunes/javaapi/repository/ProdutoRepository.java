package br.com.yunes.javaapi.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.yunes.javaapi.model.Produto;
import br.com.yunes.javaapi.model.exception.ResourceNotFoundException;

@Repository
public class ProdutoRepository {
    
   private List<Produto> produtos = new ArrayList<Produto>();

   private Integer ultimoId = 0;

  /**
   * Método para retornar uma lista de produtos.
   * @return Lista de produtos.
   */
  public List<Produto> obterTodos() {
    return produtos;
  }

  /**
   * Método que retorna um produto encontrado pelo seu id.
   * @param id do produto que será localizado.
   * @return Retorna um produto caso tenha localizado.
   */
  public Optional obterPorId(Integer id) {
      return produtos
            .stream()
            .filter(produto -> produto.getId() == id)
            .findFirst();
  }

  /**
   * Método para adicionar produto na lista.
   * @param produto que será adicionado.
   * @return o produto que foi adicionado na lista.
   */
  public Produto adicionar(Produto produto){

    ultimoId++;

    produto.setId(ultimoId);
    produtos.add(produto);

    return produto;
  }

  /**
   * Método para deletar o produto com base no id.
   * @param id do produto a ser deletado.
   */
  public void deletar( Integer id){
    produtos.removeIf(produto -> produto.getId() == id);
  }

  /**
   * Método para atualizar o produto na lista.
   * @param produto que será atualizado.
   * @return o produto que foi atualizado.
   */
  public Produto atualizar(Produto produto){
    
    // encontrar o produto que será deletado.
    final Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

    if(produtoEncontrado.isEmpty()) {
      throw new ResourceNotFoundException("Produto não encontrado!");
    }
    // deletar o produto.
    deletar(produto.getId());

    //adicionar o produto atualizado na lista.
    produtos.add(produto);
    
    return produto;
  }
}