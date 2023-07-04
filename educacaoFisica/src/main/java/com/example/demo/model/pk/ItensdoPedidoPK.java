package com.example.demo.model.pk;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.example.demo.model.ItensdoPedido;
import com.example.demo.model.Material;
import com.example.demo.model.Pedido;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class ItensdoPedidoPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	@ManyToOne
	@JoinColumn(name="pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="material_id")
	private Material material;
	
	

}
