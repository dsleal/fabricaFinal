package br.com.senai.fatesg.fabrica.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CpfCnpjControl {
	
	
	private String opcao;

	public boolean isCPF() {
		return getOpcao() != null && getOpcao().equals("CPF");
	}

	public boolean isCNPJ() {
		return getOpcao() != null && getOpcao().equals("CNPJ");
	}

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

}
