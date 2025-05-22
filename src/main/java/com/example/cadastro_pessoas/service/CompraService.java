package com.example.cadastro_pessoas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;               

import com.example.cadastro_pessoas.model.CompraModel;
import com.example.cadastro_pessoas.repository.CompraRepository;


@Service
public class CompraService {

    @Autowired
    private CompraRepository repository;

    public CompraModel criar(CompraModel compra){
        
        return repository.save(compra);
    }

    public List<CompraModel> listarTodos() {

        return repository.findAll();
    }

    public Optional<CompraModel> buscarPorId(Long id) {
    
        return repository.findById(id);
    }

    public void deletar(Long id) {
       
        repository.deleteById(id);
    }

    public Optional<CompraModel> buscarPorId2(Long id) {
        return repository.findById(id);
    }

}