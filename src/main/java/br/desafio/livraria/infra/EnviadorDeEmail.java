package br.desafio.livraria.infra;

import org.springframework.scheduling.annotation.Async;



public interface EnviadorDeEmail {

	    @Async
	    void enviarEmail(String destinatario, String assunto, String mensagem);
	    
}
