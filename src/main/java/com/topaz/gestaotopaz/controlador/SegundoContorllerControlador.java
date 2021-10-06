package com.topaz.gestaotopaz.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topaz.gestaotopaz.servico.SegundoContorllerServico;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Contorller 2")
@RestController
@RequestMapping("/lista")
public class SegundoContorllerControlador {
	
	@Autowired
	private SegundoContorllerServico segundoContorllerServico;
	
	@ApiOperation(value = "Listar")
	@GetMapping
	public List<Long> recebeLista( @RequestBody List<Long> listaValor ) {
		List<Long> valorNumericoListarOrdemDecrescente = segundoContorllerServico.valorNumericoListarOrdemDecrescente(listaValor);
		return valorNumericoListarOrdemDecrescente;
		
	}

}
