package com.example.cadastro_pessoas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;               

import com.example.cadastro_pessoas.model.ProdutosModel;
import com.example.cadastro_pessoas.repository.ProdutosRepository;


@Service
public class ProdutoService {

    @Autowired
    private ProdutosRepository repository;

    public ResponseEntity<ProdutosModel> criar( ProdutosModel produto){

        ProdutosModel novoProduto = repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
    }

    public List<ProdutosModel> listarTodos() {

        return repository.findAll();
    }

    public Optional<ProdutosModel> buscarPorId(Long id) {
    
        return repository.findById(id);
    }


    public ProdutosModel atualizar(ProdutosModel produtosModel1){

        return repository.save(produtosModel1);
    }


    public ProdutosModel salvar(ProdutosModel produtosModal) {
    
        return repository.save(produtosModal);
    }

    public void deletar(Long id) {
       
        repository.deleteById(id);
    }
}

