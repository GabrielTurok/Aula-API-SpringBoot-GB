package com.example.cadastro_pessoas.model;

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

@Table(name = "itens_compras") 

@Getter
@Setter

@NoArgsConstructor
public class ItemCompraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name="Compra_Id")
    private Long compraId;

    @Column(nullable = false, name="Produto_Id")
    private Long produtoId;

    @Column(nullable = false, name="Quantidade")
    private Double quantidade;

    @Column(nullable = false, name="Preco_Unitario")
    private Double precoUnitario;

}   
