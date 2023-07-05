package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import com.example.demo.model.pk.ItensdoPedidoPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_pedido_material")
public class ItensdoPedido implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItensdoPedidoPK id = new ItensdoPedidoPK();
	
	private Integer quantidade;
	private double preco;

	public ItensdoPedido() {
		
	}

	public ItensdoPedido(Pedido pedido, Material material ,Integer quantidade, double preco) {
		super();
		id.setPedido(pedido);
		id.setMaterial(material);
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@JsonIgnore
	public 	Pedido getPedido() {
		return id.getPedido();
	}
	
	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
	}
	
	public Material getMaterial() {
		return id.getMaterial();
	}
	
	public void setMaterial(Material material) {
		id.setMaterial(material);
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensdoPedido other = (ItensdoPedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
