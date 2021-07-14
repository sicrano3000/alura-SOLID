package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajustes {
	void validar(Funcionario funcionario, BigDecimal aumento);
}
