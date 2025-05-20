package com.example.cadastro_pessoas.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;                        

@Entity

@Table(name = "compras") 

@Getter
@Setter

@NoArgsConstructor
public class CompraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name="Data_Compra")
    private LocalDateTime dataCompra;

    @Column(nullable = false, name="Preço_Produto")
    private Double preco;

    @Column(nullable = false, name="pessoa_Id")
    private Long pessoaId;

}   