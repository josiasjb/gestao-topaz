package com.topaz.gestaotopaz.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.topaz.gestaotopaz.servico.PrimeiroContextoServico;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//LINK SWAGGER =http://localhost:8080/swagger-ui.html#/PrimeiroContexto/idValidoUsingGET

@Api(tags = "Contorller 1")
@RestController
@RequestMapping("/contexto")
public class PrimeiroContextoControlador {
	
	@Autowired
	private PrimeiroContextoServico primerioContextoServico;
	
	@ApiOperation(value = "Somar")
	@GetMapping
	public long soma(@RequestHeader("codigo1") Long codigo1, @RequestHeader("codigo2") Long codigo2) {
		long somar = primerioContextoServico.somar(codigo1, codigo2);
		return somar;
	}
	
	@ApiOperation(value = "Validar")
	@ResponseBody
	@GetMapping("/{validar}")
	public boolean idValido(String idValido) {
		boolean idValidado = primerioContextoServico.nomeValido(idValido);
		return idValidado;
	   
	}

}
