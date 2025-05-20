package com.example.cadastro_pessoas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;               

import com.example.cadastro_pessoas.model.CompraModel;
import com.example.cadastro_pessoas.repository.CompraRepository;



@Service
public class CompraService {

    @Autowired
    private CompraRepository repository;

    public ResponseEntity<CompraModel> criar(CompraModel compra){

        CompraModel novaCompra = repository.save(compra);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaCompra);
    }

    public List<CompraModel> listarTodos() {

        return repository.findAll();
    }

    public Optional<CompraModel> buscarPorId(Long id) {
    
        return repository.findById(id);
    }


    public CompraModel atualizar(CompraModel compraModel){

        return repository.save(compraModel);
    }


    public CompraModel salvar(CompraModel compraModel1) {
    
        return repository.save(compraModel1);
    }

    public void deletar(Long id) {
       
        repository.deleteById(id);
    }
}