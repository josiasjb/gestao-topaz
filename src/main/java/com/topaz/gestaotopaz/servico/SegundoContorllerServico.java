package com.topaz.gestaotopaz.servico;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SegundoContorllerServico {
	
	public List<Long> valorNumericoListarOrdemDecrescente(List<Long> listaValor) {
		
		Collections.reverse(listaValor);
		return listaValor;
		
	}

}
