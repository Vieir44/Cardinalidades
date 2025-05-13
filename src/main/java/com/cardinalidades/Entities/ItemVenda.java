package com.cardinalidades.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ItemVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "quantidade", nullable = false, length = 100)
	private int quantidade;
	
	@Column(name = "valor_unitario", nullable = false, length = 100)
	private String valor_unitario;
	
	@Column(name = "produto_id", nullable = false, length = 100)
	private String produto_id;
	
	@Column(name = "venda_id", nullable = false, length = 100)
	private String venda_id;
	
	@ManyToOne
	@JoinColumn(name = "id_Venda", nullable = false)
	private Venda venda;



}


	


