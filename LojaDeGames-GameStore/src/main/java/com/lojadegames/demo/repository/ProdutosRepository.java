  package com.lojadegames.demo.repository;
  
  
  
  import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.demo.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
}



