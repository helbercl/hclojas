package com.hclojas.erp.enums;

public enum TiposFornecedores {
	MEI("MicroEmpreendedor Individual"), EIRELI("Empresa Individual de Resposnsabilidade Limitada"),
	LTDA(" Sociedade Limitada"), SA("Sociedade Anonima");

	private String descricao;

	TiposFornecedores(String descricao) {
      this.descricao =descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
