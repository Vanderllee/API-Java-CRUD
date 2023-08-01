package br.com.yunes.javaapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yunes.javaapi.model.Produto;
import br.com.yunes.javaapi.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos () {
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(Integer id) {
        return produtoRepository.obterPorId(id);
    }

    public Produto adicionar(Produto produto) {

        // validar produto: o que pode e o que não pode no produto
        var addProduto =  produtoRepository.adicionar(produto);

        return addProduto;
    }

    public void deletar(Integer id) {

        // verificar se o usuário tem permissão para deletar
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id, Produto produto) {

        //validar o id
        produto.setId(id);

        return produtoRepository.atualizar(produto);
    }

}