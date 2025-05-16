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

@Table(name = "produtos") 

@Getter
@Setter

@NoArgsConstructor
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name="Nome_Produto")
    private String name;

    @Column(nullable = false, name="Preço_Produto")
    private Double preco;

    @Column(nullable = false, name="Quantidade_Estoque")
    private String quantidadeEstoque;

    @Column(length = 2000)
    private String descricao;

}