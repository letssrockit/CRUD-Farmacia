package com.generation.farmaciaonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmaciaonline.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAllByCategoria_TipoContainingIgnoreCase(String tipoCategoria);

}
