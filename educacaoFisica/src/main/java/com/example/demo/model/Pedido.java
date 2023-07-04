	package com.example.demo.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//configurando o formato da data com jsonFormat
	@JsonFormat(shape= JsonFormat.Shape.STRING, 
	pattern = "yyyy-MM-dd 'T' HH:mm:ss 'Z'", timezone="GMT")
	private Instant data;
	
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Usuario cliente;
	
	@OneToMany(mappedBy = "id.pedido")
	private Set<ItensdoPedido> itens = new HashSet<>();
	
	
	
	public Pedido() {
		super();
	}
	
	
	
	

	public Pedido(Long id, Instant data, Usuario cliente) {
		super();
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		
	}





	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Instant getData() {
		return data;
	}



	public void setData(Instant data) {
		this.data = data;
	}



	public Usuario getCliente() {
		return cliente;
	}



	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public void setItens(Set<ItensdoPedido> itens) {
		this.itens = itens;
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
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}



	public Set<ItensdoPedido> getItens(){
		return itens;
	}

	public double getPrice() {
		
		return 0;
	}

	
		
	}
	
	
	
	


