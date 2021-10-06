package com.topaz.gestaotopaz.servico;

import org.springframework.stereotype.Service;

@Service
public class PrimeiroContextoServico {
	
	public long somar(Long codigo1, Long codigo2) {
		long soma = codigo1 + codigo2;
		return soma;
	}
	
	public boolean nomeValido(String idValido){ 
		String regex = "^A([a-zA-Z]{0,12})?$"; 
		if(idValido.matches(regex)) 
	return true; return false; }

}


