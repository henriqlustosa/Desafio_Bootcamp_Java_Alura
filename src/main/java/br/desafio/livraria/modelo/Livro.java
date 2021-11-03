package br.desafio.livraria.modelo;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "livros")
public class Livro {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	 @Column(nullable = false)
	 private String titulo;
	 
	 @Column(nullable = false)
	 private LocalDate dataDeLancamento;
	 
	 @Column(nullable = false)
	 private Integer numeroPaginas;
	
	 @ManyToOne()
	 @JoinColumn(name = "autor_id")
	 private Autor autor;
	 
	 @ManyToOne()
	 @JoinColumn(name = "usuario_id")
	 private Usuario usuario;
	public void atualizarInformacoes(String titulo, LocalDate dataDeLancamento, Integer numeroPaginas) {
	        this.titulo = titulo;
	        this.dataDeLancamento = dataDeLancamento;
	        this.numeroPaginas = numeroPaginas;
	        
	    }
}
