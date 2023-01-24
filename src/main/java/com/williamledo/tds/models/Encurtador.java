package com.williamledo.tds.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "encurtador")
@Entity(name = "Encurtador")
@Getter @Setter
@NoArgsConstructor
public class Encurtador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	private String urlEncurtada = "localhost:8080/";
	private String urlOriginal;
	private Integer qtdDeAcessos = 0;
	
	public Encurtador(Long id, String codigo, String urlEncurtada, String urlOriginal) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.urlEncurtada += codigo;
		this.urlOriginal = urlOriginal;
	}
	
	public Encurtador(String codigo, String urlOriginal) {
		super();
		this.codigo = codigo;
		this.urlEncurtada += codigo;
		this.urlOriginal = urlOriginal;
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
		Encurtador other = (Encurtador) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
